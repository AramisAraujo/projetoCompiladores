/**
 * generated by Xtext 2.13.0
 */
package org.xtext.validation;

import com.google.common.base.Objects;
import java.util.LinkedHashMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.xtext.go.basicLit;
import org.xtext.go.expression;
import org.xtext.go.expressionList;
import org.xtext.go.functionDecl;
import org.xtext.go.ifStmt;
import org.xtext.go.importDecl;
import org.xtext.go.importSpec;
import org.xtext.go.literal;
import org.xtext.go.operand;
import org.xtext.go.operandName;
import org.xtext.go.parameterDecl;
import org.xtext.go.parameterList;
import org.xtext.go.shortVarDecl;
import org.xtext.go.type;
import org.xtext.go.typeLit;
import org.xtext.go.typeName;
import org.xtext.go.varDecl;
import org.xtext.go.varSpec;
import org.xtext.validation.AbstractGoValidator;
import org.xtext.validation.NullObj;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class GoValidator extends AbstractGoValidator {
  private final LinkedHashMap<Object, Object> ids = CollectionLiterals.<Object, Object>newLinkedHashMap();
  
  @Check
  public void checkExpression(final expression e) {
    String _operator = e.getExpressionMatched().getOperator();
    boolean _tripleNotEquals = (_operator != null);
    if (_tripleNotEquals) {
      String binaryOperator = e.getExpressionMatched().getOperator();
      if ((Objects.equal(binaryOperator, "||") || Objects.equal(binaryOperator, "&&"))) {
        this.checkRelExp(e);
      } else {
        boolean _isArithimeticOp = this.isArithimeticOp(binaryOperator);
        if (_isArithimeticOp) {
          this.checkAritOp(e, binaryOperator);
        } else {
          boolean _isBooleanOp = this.isBooleanOp(binaryOperator);
          if (_isBooleanOp) {
            this.checkBooleanOp(e, binaryOperator);
          }
        }
      }
    }
  }
  
  @Check
  public void checkVarDecl(final varDecl vd) {
    for (int i = 0; (i < ((Object[])Conversions.unwrapArray(vd.getSpecs(), Object.class)).length); i++) {
      {
        varSpec varspec = vd.getSpecs().get(i);
        int _length = ((Object[])Conversions.unwrapArray(varspec.getIdList().getIds(), Object.class)).length;
        int _length_1 = ((Object[])Conversions.unwrapArray(varspec.getExprList(), Object.class)).length;
        boolean _equals = (_length == _length_1);
        if (_equals) {
          int index = 0;
          type type = varspec.getType();
          EList<String> _ids = varspec.getIdList().getIds();
          for (final String id : _ids) {
            if ((type != null)) {
              expression e = varspec.getExprList().get(index).getExpr().get(index);
              this.checkAndMakeDecl(id, this.extractType(type), e.getUnaryExpr().getPrimaryExpr().getOperand().getLiteral().getLitBasic());
            } else {
              this.nullDeclaration(id);
            }
          }
        } else {
          this.error("Semantic Error: Wrong number of atributes", null);
        }
        for (int j = 0; (j < ((Object[])Conversions.unwrapArray(varspec.getIdList().getIds(), Object.class)).length); j++) {
          {
            String varId = varspec.getIdList().getIds().get(j);
            this.nullDeclaration(varId);
            org.xtext.go.type type_1 = varspec.getType();
            for (int k = 0; (k < ((Object[])Conversions.unwrapArray(varspec.getExprList().get(j).getExpr(), Object.class)).length); k++) {
              {
                expression exp = varspec.getExprList().get(j).getExpr().get(k);
                basicLit varExp = exp.getUnaryExpr().getPrimaryExpr().getOperand().getLiteral().getLitBasic();
                if (((type_1 != null) && (varExp != null))) {
                  String varType = this.extractType(type_1);
                  if ((varType != null)) {
                    boolean error = this.checkAndMakeDecl(varId, varType, varExp);
                    if (((varId.charAt(0) != varId.toLowerCase().charAt(0)) && (!error))) {
                      this.warning("Variables usually starts with Lower Case", null);
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }
  
  public String extractType(final type type) {
    typeLit _contentL = type.getContentL();
    boolean _tripleNotEquals = (_contentL != null);
    if (_tripleNotEquals) {
      return type.getContentL().getContentType();
    } else {
      typeName _contentT = type.getContentT();
      boolean _tripleNotEquals_1 = (_contentT != null);
      if (_tripleNotEquals_1) {
        return type.getContentT().getName();
      }
    }
    return this.extractType(type.getContent());
  }
  
  @Check
  public void imporDeclCheck(final importDecl id) {
    EList<importSpec> imports = id.getSpecs();
    for (final importSpec import_ : imports) {
      this.nullDeclaration(import_.getPath().replaceAll("\"", ""));
    }
  }
  
  @Check
  public Boolean ifDclrCheck(final ifStmt stmt) {
    boolean _xifexpression = false;
    expression _expr = stmt.getExpr();
    boolean _tripleNotEquals = (_expr != null);
    if (_tripleNotEquals) {
      boolean _xblockexpression = false;
      {
        operand ifVar = stmt.getExpr().getUnaryExpr().getPrimaryExpr().getOperand();
        String t = this.getBasicLitType(ifVar.getLiteral().getLitBasic());
        boolean _xifexpression_1 = false;
        if ((t != null)) {
          _xifexpression_1 = this.checkAndMakeDecl(ifVar.getOperandName().getName(), t, ifVar.getLiteral().getLitBasic());
        } else {
          this.error("Semantic Error: Invalid declaration", null);
        }
        _xblockexpression = _xifexpression_1;
      }
      _xifexpression = _xblockexpression;
    } else {
      this.error("Semantic Error: Invalid declaration", null);
    }
    return Boolean.valueOf(_xifexpression);
  }
  
  @Check
  public void funcDecla(final functionDecl fd) {
    String funcName = fd.getName();
    EList<parameterList> parameters = fd.getSig().getParams().getParamList();
    LinkedHashMap<String, Object> parameterList = CollectionLiterals.<String, Object>newLinkedHashMap();
    for (int i = 0; (i < ((Object[])Conversions.unwrapArray(parameters, Object.class)).length); i++) {
      for (int j = 0; (j < ((Object[])Conversions.unwrapArray(parameters.get(i).getParamsDecl(), Object.class)).length); j++) {
        {
          parameterDecl p = parameters.get(i).getParamsDecl().get(j);
          for (int k = 0; (k < ((Object[])Conversions.unwrapArray(p.getIdentifierList().getIds(), Object.class)).length); k++) {
            type _type = p.getType();
            boolean _tripleNotEquals = (_type != null);
            if (_tripleNotEquals) {
              parameterList.put(
                p.getIdentifierList().getIds().get(k), 
                p.getType().getContent());
              this.ids.put(
                p.getIdentifierList().getIds().get(k), 
                p.getType().getContent());
            } else {
              String _get = p.getIdentifierList().getIds().get(k);
              NullObj _nullObj = new NullObj();
              parameterList.put(_get, _nullObj);
              String _get_1 = p.getIdentifierList().getIds().get(k);
              NullObj _nullObj_1 = new NullObj();
              this.ids.put(_get_1, _nullObj_1);
            }
          }
        }
      }
    }
    for (final org.xtext.go.parameterList p : parameters) {
      this.ids.put(funcName, parameterList.toString());
    }
  }
  
  @Check
  public void checkOperandName(final operand op) {
    boolean _containsKey = this.ids.containsKey(op.getOperandName().getName());
    boolean _not = (!_containsKey);
    if (_not) {
      String _name = op.getOperandName().getName();
      String _plus = ("Semantic Error: Identifier " + _name);
      String _plus_1 = (_plus + " was never declared");
      this.error(_plus_1, null);
    } else {
      boolean _contains = this.ids.get(op.getOperandName().getName()).toString().contains(",");
      if (_contains) {
        String[] elements = this.ids.get(op.getOperandName().getName()).toString().split(",");
        expression expList = op.getExpr();
        this.callMethodCheck(expList, elements, op);
      }
    }
  }
  
  @Check
  public void shortVarDecl(final shortVarDecl sv) {
    for (int i = 0; (i < sv.getIdList().getIds().size()); i++) {
      this.ids.put(
        sv.getIdList().getIds().get(i), 
        sv.getExprList());
    }
  }
  
  public void checkRelExp(final expression e) {
    if (((e.getUnaryExpr().getPrimaryExpr().getOperand().getLiteral() != null) && 
      (e.getExpressionMatched().getExpression().getUnaryExpr().getPrimaryExpr().getOperand().getLiteral() != null))) {
      basicLit basicLiteral1 = e.getUnaryExpr().getPrimaryExpr().getOperand().getLiteral().getLitBasic();
      basicLit basicLiteral2 = e.getExpressionMatched().getExpression().getUnaryExpr().getPrimaryExpr().getOperand().getLiteral().getLitBasic();
      if (((basicLiteral1.getBoolLit() == null) || (basicLiteral2.getBoolLit() == null))) {
        this.error("Semantic Error: Invalid boolean expression", null);
      }
    }
  }
  
  public void checkAritOp(final expression e, final String binaryOp) {
    String type1 = "";
    String type2 = "";
    String id1 = "";
    String id2 = "";
    if (((e.getUnaryExpr().getPrimaryExpr().getOperand().getLiteral() != null) && 
      (e.getExpressionMatched().getExpression().getUnaryExpr().getPrimaryExpr().getOperand().getLiteral() != null))) {
      basicLit basicLiteral1 = e.getUnaryExpr().getPrimaryExpr().getOperand().getLiteral().getLitBasic();
      basicLit basicLiteral2 = e.getExpressionMatched().getExpression().getUnaryExpr().getPrimaryExpr().getOperand().getLiteral().getLitBasic();
      type1 = this.getBasicLitType(basicLiteral1);
      type2 = this.getBasicLitType(basicLiteral2);
    } else {
      literal _literal = e.getUnaryExpr().getPrimaryExpr().getOperand().getLiteral();
      boolean _tripleNotEquals = (_literal != null);
      if (_tripleNotEquals) {
        basicLit basicLiteral1_1 = e.getUnaryExpr().getPrimaryExpr().getOperand().getLiteral().getLitBasic();
        id2 = e.getExpressionMatched().getExpression().getUnaryExpr().getPrimaryExpr().getOperand().getOperandName().getName();
        type1 = this.getBasicLitType(basicLiteral1_1);
        type2 = this.getType(this.ids.get(id2));
      } else {
        literal _literal_1 = e.getExpressionMatched().getExpression().getUnaryExpr().getPrimaryExpr().getOperand().getLiteral();
        boolean _tripleNotEquals_1 = (_literal_1 != null);
        if (_tripleNotEquals_1) {
          id1 = e.getUnaryExpr().getPrimaryExpr().getOperand().getOperandName().getName();
          basicLit basicLiteral2_1 = e.getExpressionMatched().getExpression().getUnaryExpr().getPrimaryExpr().getOperand().getLiteral().getLitBasic();
          type2 = this.getBasicLitType(basicLiteral2_1);
          type1 = this.getType(this.ids.get(id1));
        } else {
          id1 = e.getUnaryExpr().getPrimaryExpr().getOperand().getOperandName().getName();
          id2 = e.getExpressionMatched().getExpression().getUnaryExpr().getPrimaryExpr().getOperand().getOperandName().getName();
          type1 = this.getType(this.ids.get(id1));
          type2 = this.getType(this.ids.get(id2));
        }
      }
    }
    if ((Objects.equal(type1, "null") || Objects.equal(type2, "null"))) {
      boolean _equals = Objects.equal(type1, "null");
      if (_equals) {
        this.error((("Semantic Error: " + id1) + " was declared but never assigned."), null);
      }
      boolean _equals_1 = Objects.equal(type2, "null");
      if (_equals_1) {
        this.error((("Semantic Error: " + id2) + " was declared but never assigned."), null);
      }
    } else {
      this.checkTypesInAritimeticOp(binaryOp, type1, type2);
    }
  }
  
  public void checkBooleanOp(final expression e, final String binaryOp) {
    String type1 = "";
    String type2 = "";
    String id1 = "";
    String id2 = "";
    if (((e.getUnaryExpr().getPrimaryExpr().getOperand().getLiteral() != null) && 
      (e.getExpressionMatched().getExpression().getUnaryExpr().getPrimaryExpr().getOperand().getLiteral() != null))) {
      basicLit basicLiteral1 = e.getUnaryExpr().getPrimaryExpr().getOperand().getLiteral().getLitBasic();
      basicLit basicLiteral2 = e.getExpressionMatched().getExpression().getUnaryExpr().getPrimaryExpr().getOperand().getLiteral().getLitBasic();
      type1 = this.getBasicLitType(basicLiteral1);
      type2 = this.getBasicLitType(basicLiteral2);
    } else {
      literal _literal = e.getUnaryExpr().getPrimaryExpr().getOperand().getLiteral();
      boolean _tripleNotEquals = (_literal != null);
      if (_tripleNotEquals) {
        basicLit basicLiteral1_1 = e.getUnaryExpr().getPrimaryExpr().getOperand().getLiteral().getLitBasic();
        id2 = e.getExpressionMatched().getExpression().getUnaryExpr().getPrimaryExpr().getOperand().getOperandName().getName();
        type1 = this.getBasicLitType(basicLiteral1_1);
        type2 = this.getType(this.ids.get(id2));
      } else {
        literal _literal_1 = e.getExpressionMatched().getExpression().getUnaryExpr().getPrimaryExpr().getOperand().getLiteral();
        boolean _tripleNotEquals_1 = (_literal_1 != null);
        if (_tripleNotEquals_1) {
          id1 = e.getUnaryExpr().getPrimaryExpr().getOperand().getOperandName().getName();
          basicLit basicLiteral2_1 = e.getExpressionMatched().getExpression().getUnaryExpr().getPrimaryExpr().getOperand().getLiteral().getLitBasic();
          type2 = this.getBasicLitType(basicLiteral2_1);
          type1 = this.getType(this.ids.get(id1));
        } else {
          id1 = e.getUnaryExpr().getPrimaryExpr().getOperand().getOperandName().getName();
          id2 = e.getExpressionMatched().getExpression().getUnaryExpr().getPrimaryExpr().getOperand().getOperandName().getName();
          type1 = this.getType(this.ids.get(id1));
          type2 = this.getType(this.ids.get(id2));
        }
      }
    }
    if ((Objects.equal(type1, "null") || Objects.equal(type2, "null"))) {
      boolean _equals = Objects.equal(type1, "null");
      if (_equals) {
        this.error((("Semantic Error: " + id1) + " was declared but never assigned."), null);
      }
      boolean _equals_1 = Objects.equal(type2, "null");
      if (_equals_1) {
        this.error((("Semantic Error: " + id2) + " was declared but never assigned."), null);
      }
    } else {
      this.checkTypesInBoolOp(binaryOp, type1, type2);
    }
  }
  
  protected void checkTypesInBoolOp(final String binaryOp, final String type1, final String type2) {
    if ((Objects.equal(binaryOp, "==") || Objects.equal(binaryOp, "!="))) {
      boolean _notEquals = (!Objects.equal(type1, type2));
      if (_notEquals) {
        this.error(((("Semantic Error: Invalid boolean operation. Mismatched types " + type1) + " and ") + type2), null);
      }
    } else {
      boolean _equals = Objects.equal(type1, "int");
      if (_equals) {
        if ((Objects.equal(type2, "bool") || Objects.equal(type2, "string"))) {
          this.error(((("Semantic Error: Invalid boolean operation. Mismatched types " + type1) + " and ") + type2), 
            null);
        }
      } else {
        boolean _equals_1 = Objects.equal(type1, "float");
        if (_equals_1) {
          if ((Objects.equal(type2, "bool") || Objects.equal(type2, "string"))) {
            this.error(((("Semantic Error: Invalid boolean operation. Mismatched types " + type1) + " and ") + type2), 
              null);
          }
        } else {
          if ((Objects.equal(type1, "bool") || Objects.equal(type2, "bool"))) {
            this.error((("Semantic Error: Invalid boolean operation. Operator " + binaryOp) + " not defined on bool."), null);
          } else {
            boolean _equals_2 = Objects.equal(type1, "string");
            if (_equals_2) {
              boolean _notEquals_1 = (!Objects.equal(type2, "string"));
              if (_notEquals_1) {
                this.error(((("Semantic Error: Invalid boolean operation. Mismatched types " + type1) + " and ") + type2), 
                  null);
              }
            }
          }
        }
      }
    }
  }
  
  public String getBasicLitType(final basicLit lit) {
    String _floatLit = lit.getFloatLit();
    boolean _tripleNotEquals = (_floatLit != null);
    if (_tripleNotEquals) {
      return "float";
    } else {
      String _intLit = lit.getIntLit();
      boolean _tripleNotEquals_1 = (_intLit != null);
      if (_tripleNotEquals_1) {
        return "int";
      } else {
        String _stringLit = lit.getStringLit();
        boolean _tripleNotEquals_2 = (_stringLit != null);
        if (_tripleNotEquals_2) {
          return "string";
        }
      }
    }
    return null;
  }
  
  protected boolean isArithimeticOp(final String binaryOperator) {
    return ((((Objects.equal(binaryOperator, "+") || Objects.equal(binaryOperator, "-")) || Objects.equal(binaryOperator, "*")) || Objects.equal(binaryOperator, "/")) || 
      Objects.equal(binaryOperator, "%"));
  }
  
  protected boolean isBooleanOp(final String binaryOperator) {
    return (((((Objects.equal(binaryOperator, "==") || Objects.equal(binaryOperator, "!=")) || Objects.equal(binaryOperator, "<")) || Objects.equal(binaryOperator, "<=")) || 
      Objects.equal(binaryOperator, ">")) || Objects.equal(binaryOperator, ">="));
  }
  
  public Object nullDeclaration(final String id) {
    NullObj _nullObj = new NullObj();
    return this.ids.put(id, _nullObj);
  }
  
  public boolean checkAndMakeDecl(final String id, final String constType, final basicLit literal) {
    boolean error = false;
    boolean _equals = Objects.equal(constType, "float");
    if (_equals) {
      String _intLit = literal.getIntLit();
      boolean _tripleNotEquals = (_intLit != null);
      if (_tripleNotEquals) {
        String _intLit_1 = literal.getIntLit();
        Integer _integer = new Integer(_intLit_1);
        this.ids.put(id, _integer);
      } else {
        String _floatLit = literal.getFloatLit();
        boolean _tripleNotEquals_1 = (_floatLit != null);
        if (_tripleNotEquals_1) {
          String _floatLit_1 = literal.getFloatLit();
          Double _double = new Double(_floatLit_1);
          this.ids.put(id, _double);
        } else {
          error = true;
          this.error("Semantic Error: Invalid declaration, operator \n\t\t\t\t\t\tnot assigned to float.", null);
        }
      }
    } else {
      boolean _equals_1 = Objects.equal(constType, "int");
      if (_equals_1) {
        String _intLit_2 = literal.getIntLit();
        boolean _tripleNotEquals_2 = (_intLit_2 != null);
        if (_tripleNotEquals_2) {
          String _intLit_3 = literal.getIntLit();
          Integer _integer_1 = new Integer(_intLit_3);
          this.ids.put(id, _integer_1);
        } else {
          error = true;
          this.error("Semantic Error: Invalid declaration, operator \n\t\t\t\t\t\tnot assigned to int.", null);
        }
      } else {
        boolean _equals_2 = Objects.equal(constType, "string");
        if (_equals_2) {
          String _stringLit = literal.getStringLit();
          boolean _tripleNotEquals_3 = (_stringLit != null);
          if (_tripleNotEquals_3) {
            String _stringLit_1 = literal.getStringLit();
            String _string = new String(_stringLit_1);
            this.ids.put(id, _string);
          } else {
            error = true;
            this.error("Semantic Error: Invalid declaration, operator \n\t\t\t\t\t\tnot assigned to string.", null);
          }
        } else {
          boolean _equals_3 = Objects.equal(constType, "bool");
          if (_equals_3) {
            String _boolLit = literal.getBoolLit();
            boolean _tripleNotEquals_4 = (_boolLit != null);
            if (_tripleNotEquals_4) {
              String _boolLit_1 = literal.getBoolLit();
              Boolean _boolean = new Boolean(_boolLit_1);
              this.ids.put(id, _boolean);
            } else {
              error = true;
              this.error("Semantic Error: Invalid declaration, operator \n\t\t\t\t\t\tnot assigned to boolean.", null);
            }
          }
        }
      }
    }
    return error;
  }
  
  protected void callMethodCheck(final expressionList expList, final String[] elements, final operand op) {
    int termsCount = 0;
    EList<expression> _expr = expList.getExpr();
    for (final expression exp : _expr) {
      operandName _operandName = exp.getUnaryExpr().getPrimaryExpr().getOperand().getOperandName();
      boolean _tripleNotEquals = (_operandName != null);
      if (_tripleNotEquals) {
        String _name = exp.getUnaryExpr().getPrimaryExpr().getOperand().getOperandName().getName();
        boolean _tripleNotEquals_1 = (_name != null);
        if (_tripleNotEquals_1) {
          int _termsCount = termsCount;
          termsCount = (_termsCount + 1);
        }
      } else {
        basicLit _litBasic = exp.getUnaryExpr().getPrimaryExpr().getOperand().getLiteral().getLitBasic();
        boolean _tripleNotEquals_2 = (_litBasic != null);
        if (_tripleNotEquals_2) {
          int _termsCount_1 = termsCount;
          termsCount = (_termsCount_1 + 1);
        }
      }
    }
    int _length = elements.length;
    boolean _tripleNotEquals_3 = (termsCount != _length);
    if (_tripleNotEquals_3) {
      String _name_1 = op.getOperandName().getName();
      String _plus = ("Semantic Error: Wrong number of parameters for " + _name_1);
      this.error(_plus, null);
    }
  }
  
  protected void callMethodCheck(final expression exp, final String[] elements, final operand op) {
    int termsCount = 0;
    operandName _operandName = exp.getUnaryExpr().getPrimaryExpr().getOperand().getOperandName();
    boolean _tripleNotEquals = (_operandName != null);
    if (_tripleNotEquals) {
      String _name = exp.getUnaryExpr().getPrimaryExpr().getOperand().getOperandName().getName();
      boolean _tripleNotEquals_1 = (_name != null);
      if (_tripleNotEquals_1) {
        int _termsCount = termsCount;
        termsCount = (_termsCount + 1);
      }
    } else {
      basicLit _litBasic = exp.getUnaryExpr().getPrimaryExpr().getOperand().getLiteral().getLitBasic();
      boolean _tripleNotEquals_2 = (_litBasic != null);
      if (_tripleNotEquals_2) {
        int _termsCount_1 = termsCount;
        termsCount = (_termsCount_1 + 1);
      }
    }
    int _length = elements.length;
    boolean _tripleNotEquals_3 = (termsCount != _length);
    if (_tripleNotEquals_3) {
      String _name_1 = op.getOperandName().getName();
      String _plus = ("Semantic Error: Wrong number of parameters for " + _name_1);
      this.error(_plus, null);
    }
  }
  
  public String getType(final Object obj) {
    if ((obj instanceof Integer)) {
      return "int";
    } else {
      if ((obj instanceof Double)) {
        return "float";
      } else {
        if ((obj instanceof Boolean)) {
          return "bool";
        } else {
          if ((obj instanceof String)) {
            return "string";
          } else {
            if ((obj instanceof NullObj)) {
              return "null";
            }
          }
        }
      }
    }
    return null;
  }
  
  public void checkTypesInAritimeticOp(final String binaryOp, final String type1, final String type2) {
    if ((Objects.equal(type1, "string") || Objects.equal(type2, "string"))) {
      if ((Objects.equal(type1, "string") && Objects.equal(binaryOp, "+"))) {
        if ((type2 != "string")) {
          this.error("Semantic Error: Invalid arithmetic operation", null);
        }
      } else {
        if ((Objects.equal(type2, "string") && Objects.equal(binaryOp, "+"))) {
          if ((type1 != "string")) {
            this.error("Semantic Error: Invalid arithmetic operation", null);
          }
        } else {
          this.error(
            (("Semantic Error: Invalid arithmetic operation, operator " + binaryOp) + " not defined on string."), 
            null);
        }
      }
    } else {
      if ((Objects.equal(type1, "bool") || Objects.equal(type2, "bool"))) {
        this.error("Semantic Error: Invalid arithmetic operation", null);
      }
    }
  }
}
