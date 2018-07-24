/**
 * generated by Xtext 2.13.0
 */
package org.xtext.validation;

import org.eclipse.xtext.validation.Check;
import org.xtext.go.assignment;
import org.xtext.go.conversion;
import org.xtext.go.expression;
import org.xtext.go.expressionMatched;
import org.xtext.go.expressionStmt;
import org.xtext.go.ifStmt;
import org.xtext.go.incDecStmt;
import org.xtext.go.literal;
import org.xtext.go.methodExpr;
import org.xtext.go.operand;
import org.xtext.go.operandName;
import org.xtext.go.primaryExpr;
import org.xtext.go.primaryExprArguments;
import org.xtext.go.primaryExprIndex;
import org.xtext.go.primaryExprSelector;
import org.xtext.go.primaryExprSlice;
import org.xtext.go.primaryExprTypeAssertion;
import org.xtext.go.qualifiedIdent;
import org.xtext.go.sendStmt;
import org.xtext.go.shortVarDecl;
import org.xtext.go.simpleStmt;
import org.xtext.go.unaryExpr;
import org.xtext.validation.AbstractGoValidator;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class GoValidator extends AbstractGoValidator {
  @Check
  public Object checkIf(final ifStmt stmt) {
    Object _xblockexpression = null;
    {
      simpleStmt _simplStatement = stmt.getSimplStatement();
      boolean _tripleNotEquals = (_simplStatement != null);
      if (_tripleNotEquals) {
        this.checkSimple(stmt.getSimplStatement());
      }
      Object _xifexpression = null;
      expression _expr = stmt.getExpr();
      boolean _tripleNotEquals_1 = (_expr != null);
      if (_tripleNotEquals_1) {
        _xifexpression = this.checkExpression(stmt.getExpr());
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public Object checkPrimary(final primaryExpr expr) {
    Object _xblockexpression = null;
    {
      operand _operand = expr.getOperand();
      boolean _tripleNotEquals = (_operand != null);
      if (_tripleNotEquals) {
        this.checkOperand(expr.getOperand());
      }
      conversion _conversion = expr.getConversion();
      boolean _tripleNotEquals_1 = (_conversion != null);
      if (_tripleNotEquals_1) {
        this.checkConversion(expr.getConversion());
      }
      primaryExprArguments _primaryExprArguments = expr.getPrimaryExprArguments();
      boolean _tripleNotEquals_2 = (_primaryExprArguments != null);
      if (_tripleNotEquals_2) {
        this.checkPrimaryExprArguments(expr.getPrimaryExprArguments());
      }
      primaryExprIndex _primaryExprIndex = expr.getPrimaryExprIndex();
      boolean _tripleNotEquals_3 = (_primaryExprIndex != null);
      if (_tripleNotEquals_3) {
        this.checkPrimaryExprIndex(expr.getPrimaryExprIndex());
      }
      primaryExprSelector _primaryExprSelector = expr.getPrimaryExprSelector();
      boolean _tripleNotEquals_4 = (_primaryExprSelector != null);
      if (_tripleNotEquals_4) {
        this.checkPrimaryExprSelector(expr.getPrimaryExprSelector());
      }
      primaryExprSlice _primaryExprSlice = expr.getPrimaryExprSlice();
      boolean _tripleNotEquals_5 = (_primaryExprSlice != null);
      if (_tripleNotEquals_5) {
        this.checkPrimaryExprSlice(expr.getPrimaryExprSlice());
      }
      Object _xifexpression = null;
      primaryExprTypeAssertion _primaryExprTypeAssertion = expr.getPrimaryExprTypeAssertion();
      boolean _tripleNotEquals_6 = (_primaryExprTypeAssertion != null);
      if (_tripleNotEquals_6) {
        _xifexpression = this.checkPrimaryExprTypeAssertion(expr.getPrimaryExprTypeAssertion());
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public Object checkPrimaryExprTypeAssertion(final primaryExprTypeAssertion assertion) {
    return null;
  }
  
  public Object checkPrimaryExprSlice(final primaryExprSlice slice) {
    return null;
  }
  
  public Object checkPrimaryExprSelector(final primaryExprSelector selector) {
    return null;
  }
  
  public Object checkPrimaryExprIndex(final primaryExprIndex index) {
    return null;
  }
  
  public Object checkPrimaryExprArguments(final primaryExprArguments arguments) {
    return null;
  }
  
  public Object checkConversion(final conversion conversion) {
    return null;
  }
  
  public Object checkOperand(final operand operand) {
    Object _xblockexpression = null;
    {
      literal _literal = operand.getLiteral();
      boolean _tripleNotEquals = (_literal != null);
      if (_tripleNotEquals) {
        this.checkLiteral(operand.getLiteral());
      }
      methodExpr _methodExpr = operand.getMethodExpr();
      boolean _tripleNotEquals_1 = (_methodExpr != null);
      if (_tripleNotEquals_1) {
        this.checkMethodExpr(operand.getMethodExpr());
      }
      operandName _operandName = operand.getOperandName();
      boolean _tripleNotEquals_2 = (_operandName != null);
      if (_tripleNotEquals_2) {
        this.checkOperandName(operand.getOperandName());
      }
      Object _xifexpression = null;
      expression _expr = operand.getExpr();
      boolean _tripleNotEquals_3 = (_expr != null);
      if (_tripleNotEquals_3) {
        _xifexpression = this.checkExpression(operand.getExpr());
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public Object checkOperandName(final operandName name) {
    Object _xblockexpression = null;
    {
      String _name = name.getName();
      boolean _tripleNotEquals = (_name != null);
      if (_tripleNotEquals) {
      }
      Object _xifexpression = null;
      qualifiedIdent _qualIdent = name.getQualIdent();
      boolean _tripleNotEquals_1 = (_qualIdent != null);
      if (_tripleNotEquals_1) {
        _xifexpression = this.checkQualIdent(name.getQualIdent());
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public Object checkQualIdent(final qualifiedIdent ident) {
    Object _xblockexpression = null;
    {
      String _packageName = ident.getPackageName();
      boolean _tripleNotEquals = (_packageName != null);
      if (_tripleNotEquals) {
      }
      Object _xifexpression = null;
      String _name = ident.getName();
      boolean _tripleNotEquals_1 = (_name != null);
      if (_tripleNotEquals_1) {
        _xifexpression = null;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public Object checkMethodExpr(final methodExpr expr) {
    return null;
  }
  
  public Object checkLiteral(final literal literal) {
    return null;
  }
  
  public Object checkSimple(final simpleStmt stmt) {
    Object _xblockexpression = null;
    {
      sendStmt _sendStmt = stmt.getSendStmt();
      boolean _tripleNotEquals = (_sendStmt != null);
      if (_tripleNotEquals) {
        this.checkSendStmt(stmt.getSendStmt());
      }
      expressionStmt _expressionStmt = stmt.getExpressionStmt();
      boolean _tripleNotEquals_1 = (_expressionStmt != null);
      if (_tripleNotEquals_1) {
        this.checkExpression(stmt.getExpressionStmt().getExpr());
      }
      incDecStmt _incDecStmt = stmt.getIncDecStmt();
      boolean _tripleNotEquals_2 = (_incDecStmt != null);
      if (_tripleNotEquals_2) {
        this.checkDcStmt(stmt.getIncDecStmt());
      }
      assignment _assignment = stmt.getAssignment();
      boolean _tripleNotEquals_3 = (_assignment != null);
      if (_tripleNotEquals_3) {
        this.checkAssignment(stmt.getAssignment());
      }
      Object _xifexpression = null;
      shortVarDecl _shortVarDecl = stmt.getShortVarDecl();
      boolean _tripleNotEquals_4 = (_shortVarDecl != null);
      if (_tripleNotEquals_4) {
        _xifexpression = this.checkShortVar(stmt.getShortVarDecl());
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public Object checkSendStmt(final sendStmt stmt) {
    Object _xifexpression = null;
    expression _expr1 = stmt.getExpr1();
    boolean _tripleNotEquals = (_expr1 != null);
    if (_tripleNotEquals) {
      Object _xifexpression_1 = null;
      expression _expr2 = stmt.getExpr2();
      boolean _tripleNotEquals_1 = (_expr2 != null);
      if (_tripleNotEquals_1) {
        Object _xblockexpression = null;
        {
          this.checkExpression(stmt.getExpr1());
          _xblockexpression = this.checkExpression(stmt.getExpr2());
        }
        _xifexpression_1 = _xblockexpression;
      } else {
        _xifexpression_1 = null;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  public Object checkDcStmt(final incDecStmt stmt) {
    return null;
  }
  
  public Object checkAssignment(final assignment assignment) {
    return null;
  }
  
  public Object checkShortVar(final shortVarDecl decl) {
    return null;
  }
  
  public Object checkExpression(final expression expression) {
    Object _xblockexpression = null;
    {
      unaryExpr _unaryExpr = expression.getUnaryExpr();
      boolean _tripleNotEquals = (_unaryExpr != null);
      if (_tripleNotEquals) {
        this.checkUnary(expression.getUnaryExpr());
      }
      Object _xifexpression = null;
      expressionMatched _expressionMatched = expression.getExpressionMatched();
      boolean _tripleNotEquals_1 = (_expressionMatched != null);
      if (_tripleNotEquals_1) {
        _xifexpression = this.checkMatched(expression.getExpressionMatched());
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public Object checkMatched(final expressionMatched matched) {
    Object _xblockexpression = null;
    {
      expression _expression = matched.getExpression();
      boolean _tripleNotEquals = (_expression != null);
      if (_tripleNotEquals) {
        this.checkExpression(matched.getExpression());
      }
      Object _xifexpression = null;
      String _operator = matched.getOperator();
      boolean _tripleNotEquals_1 = (_operator != null);
      if (_tripleNotEquals_1) {
        _xifexpression = null;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public Object checkUnary(final unaryExpr expr) {
    Object _xblockexpression = null;
    {
      primaryExpr _primaryExpr = expr.getPrimaryExpr();
      boolean _tripleNotEquals = (_primaryExpr != null);
      if (_tripleNotEquals) {
        this.checkPrimary(expr.getPrimaryExpr());
      }
      Object _xifexpression = null;
      unaryExpr _unaryExpr = expr.getUnaryExpr();
      boolean _tripleNotEquals_1 = (_unaryExpr != null);
      if (_tripleNotEquals_1) {
        _xifexpression = this.checkUnary(expr.getUnaryExpr());
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
}
