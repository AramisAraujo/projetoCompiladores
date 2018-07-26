/**
 * generated by Xtext 2.13.0
 */
package org.xtext.generator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.xtext.go.assignment;
import org.xtext.go.block;
import org.xtext.go.breakStmt;
import org.xtext.go.continueStmt;
import org.xtext.go.declaration;
import org.xtext.go.deferStmt;
import org.xtext.go.expression;
import org.xtext.go.expressionStmt;
import org.xtext.go.fallthroughStmt;
import org.xtext.go.forStmt;
import org.xtext.go.goStmt;
import org.xtext.go.ifStmt;
import org.xtext.go.incDecStmt;
import org.xtext.go.labeledStmt;
import org.xtext.go.returnStmt;
import org.xtext.go.selectStmt;
import org.xtext.go.sendStmt;
import org.xtext.go.shortVarDecl;
import org.xtext.go.simpleStmt;
import org.xtext.go.statement;
import org.xtext.go.statementList;
import org.xtext.go.switchStmt;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 * «»
 */
@SuppressWarnings("all")
public class GoGenerator extends AbstractGenerator {
  private Integer counter = Integer.valueOf(1);
  
  private Integer variables = Integer.valueOf(1);
  
  private Integer address = Integer.valueOf(0);
  
  @Override
  public void doGenerate(final Resource input, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    fsa.generateFile("file.txt", "TESTE GO");
  }
  
  /**
   * for(e : input.allContents.toIterable.filter(ifStmt)) {
   * fsa.generateFile("stmt" + counter + ".txt", e.compileIfStatement());
   * counter++;
   * }
   */
  public CharSequence compileIfStatement(final ifStmt stmt) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(this.address);
    _builder.append(": LD SP, 1000");
    _builder.newLineIfNotEmpty();
    this.nextAddress();
    _builder.newLineIfNotEmpty();
    CharSequence _compileSimpleStatement = this.compileSimpleStatement(stmt.getSimplStatement());
    _builder.append(_compileSimpleStatement);
    _builder.newLineIfNotEmpty();
    CharSequence _compileExpression = this.compileExpression(stmt.getExpr());
    _builder.append(_compileExpression);
    _builder.newLineIfNotEmpty();
    CharSequence _compileBlock = this.compileBlock(stmt.getCodeBlock());
    _builder.append(_compileBlock);
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public CharSequence compileExpression(final expression expression) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("//TODO");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compileBlock(final block block) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _compileStatementList = this.compileStatementList(block.getStatements());
    _builder.append(_compileStatementList);
    _builder.newLineIfNotEmpty();
    _builder.append("//TODO");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compileStatementList(final statementList stmtList) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<statement> _statements = stmtList.getStatements();
      for(final statement stmt : _statements) {
        CharSequence _compileStatement = this.compileStatement(stmt);
        _builder.append(_compileStatement);
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compileDeclaration(final declaration decl) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("//TODO");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compileContinueStatement(final continueStmt cntStmt) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("//TODO");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compileStatement(final statement stmt) {
    StringConcatenation _builder = new StringConcatenation();
    {
      declaration _declaration = stmt.getDeclaration();
      boolean _tripleNotEquals = (_declaration != null);
      if (_tripleNotEquals) {
        CharSequence _compileDeclaration = this.compileDeclaration(stmt.getDeclaration());
        _builder.append(_compileDeclaration);
        _builder.newLineIfNotEmpty();
        _builder.newLine();
      } else {
        continueStmt _continueStmt = stmt.getContinueStmt();
        boolean _tripleNotEquals_1 = (_continueStmt != null);
        if (_tripleNotEquals_1) {
          CharSequence _compileContinueStatement = this.compileContinueStatement(stmt.getContinueStmt());
          _builder.append(_compileContinueStatement);
          _builder.newLineIfNotEmpty();
          _builder.newLine();
        } else {
          labeledStmt _labeledStmt = stmt.getLabeledStmt();
          boolean _tripleNotEquals_2 = (_labeledStmt != null);
          if (_tripleNotEquals_2) {
            CharSequence _compileLabeledStatement = this.compileLabeledStatement(stmt.getLabeledStmt());
            _builder.append(_compileLabeledStatement);
            _builder.newLineIfNotEmpty();
            _builder.newLine();
          } else {
            simpleStmt _simpleStmt = stmt.getSimpleStmt();
            boolean _tripleNotEquals_3 = (_simpleStmt != null);
            if (_tripleNotEquals_3) {
              CharSequence _compileSimpleStatement = this.compileSimpleStatement(stmt.getSimpleStmt());
              _builder.append(_compileSimpleStatement);
              _builder.newLineIfNotEmpty();
              _builder.newLine();
            } else {
              goStmt _goStmt = stmt.getGoStmt();
              boolean _tripleNotEquals_4 = (_goStmt != null);
              if (_tripleNotEquals_4) {
                CharSequence _compileGoStatement = this.compileGoStatement(stmt.getGoStmt());
                _builder.append(_compileGoStatement);
                _builder.newLineIfNotEmpty();
                _builder.newLine();
              } else {
                returnStmt _returnStmt = stmt.getReturnStmt();
                boolean _tripleNotEquals_5 = (_returnStmt != null);
                if (_tripleNotEquals_5) {
                  CharSequence _compileReturnStatement = this.compileReturnStatement(stmt.getReturnStmt());
                  _builder.append(_compileReturnStatement);
                  _builder.newLineIfNotEmpty();
                  _builder.newLine();
                } else {
                  breakStmt _breakStmt = stmt.getBreakStmt();
                  boolean _tripleNotEquals_6 = (_breakStmt != null);
                  if (_tripleNotEquals_6) {
                    CharSequence _compileBreakStatement = this.compileBreakStatement(stmt.getBreakStmt());
                    _builder.append(_compileBreakStatement);
                    _builder.newLineIfNotEmpty();
                    _builder.newLine();
                  } else {
                    fallthroughStmt _fallthroughStmt = stmt.getFallthroughStmt();
                    boolean _tripleNotEquals_7 = (_fallthroughStmt != null);
                    if (_tripleNotEquals_7) {
                      CharSequence _compileFallthroughStatement = this.compileFallthroughStatement(stmt.getFallthroughStmt());
                      _builder.append(_compileFallthroughStatement);
                      _builder.newLineIfNotEmpty();
                      _builder.newLine();
                    } else {
                      block _block = stmt.getBlock();
                      boolean _tripleNotEquals_8 = (_block != null);
                      if (_tripleNotEquals_8) {
                        Object _compileBlock = this.compileBlock(stmt.getBlock());
                        _builder.append(_compileBlock);
                        _builder.newLineIfNotEmpty();
                        _builder.newLine();
                      } else {
                        ifStmt _ifStmt = stmt.getIfStmt();
                        boolean _tripleNotEquals_9 = (_ifStmt != null);
                        if (_tripleNotEquals_9) {
                          CharSequence _compileIfStatement = this.compileIfStatement(stmt.getIfStmt());
                          _builder.append(_compileIfStatement);
                          _builder.newLineIfNotEmpty();
                          _builder.newLine();
                        } else {
                          switchStmt _switchStmt = stmt.getSwitchStmt();
                          boolean _tripleNotEquals_10 = (_switchStmt != null);
                          if (_tripleNotEquals_10) {
                            CharSequence _compileSwitchStatement = this.compileSwitchStatement(stmt.getSwitchStmt());
                            _builder.append(_compileSwitchStatement);
                            _builder.newLineIfNotEmpty();
                            _builder.newLine();
                          } else {
                            forStmt _forStmt = stmt.getForStmt();
                            boolean _tripleNotEquals_11 = (_forStmt != null);
                            if (_tripleNotEquals_11) {
                              CharSequence _compileForStatement = this.compileForStatement(stmt.getForStmt());
                              _builder.append(_compileForStatement);
                              _builder.newLineIfNotEmpty();
                              _builder.newLine();
                            } else {
                              selectStmt _selectStmt = stmt.getSelectStmt();
                              boolean _tripleNotEquals_12 = (_selectStmt != null);
                              if (_tripleNotEquals_12) {
                                CharSequence _compileSelectStatement = this.compileSelectStatement(stmt.getSelectStmt());
                                _builder.append(_compileSelectStatement);
                                _builder.newLineIfNotEmpty();
                                _builder.newLine();
                              } else {
                                deferStmt _deferStmt = stmt.getDeferStmt();
                                boolean _tripleNotEquals_13 = (_deferStmt != null);
                                if (_tripleNotEquals_13) {
                                  CharSequence _compileDeferStatement = this.compileDeferStatement(stmt.getDeferStmt());
                                  _builder.append(_compileDeferStatement);
                                  _builder.newLineIfNotEmpty();
                                  _builder.newLine();
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
            }
          }
        }
      }
    }
    return _builder;
  }
  
  public CharSequence compileForStatement(final forStmt stmt) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("//TODO");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compileSelectStatement(final selectStmt stmt) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("//TODO");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compileDeferStatement(final deferStmt stmt) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("//TODO");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compileSwitchStatement(final switchStmt stmt) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("//TODO");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compileFallthroughStatement(final fallthroughStmt stmt) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("//TODO");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compileReturnStatement(final returnStmt stmt) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("//TODO");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compileBreakStatement(final breakStmt stmt) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("//TODO");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compileGoStatement(final goStmt stmt) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("//TODO");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compileLabeledStatement(final labeledStmt lbstmt) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("//TODO");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence compileSimpleStatement(final simpleStmt stmt) {
    StringConcatenation _builder = new StringConcatenation();
    {
      sendStmt _sendStmt = stmt.getSendStmt();
      boolean _tripleNotEquals = (_sendStmt != null);
      if (_tripleNotEquals) {
        this.compileSendStmt(stmt.getSendStmt());
        _builder.newLineIfNotEmpty();
        _builder.newLine();
      } else {
        expressionStmt _expressionStmt = stmt.getExpressionStmt();
        boolean _tripleNotEquals_1 = (_expressionStmt != null);
        if (_tripleNotEquals_1) {
          this.compileExpressionStmt(stmt.getExpressionStmt());
          _builder.newLineIfNotEmpty();
          _builder.newLine();
        } else {
          incDecStmt _incDecStmt = stmt.getIncDecStmt();
          boolean _tripleNotEquals_2 = (_incDecStmt != null);
          if (_tripleNotEquals_2) {
            this.compileIncDecStmt(stmt.getIncDecStmt());
            _builder.newLineIfNotEmpty();
            _builder.newLine();
          } else {
            assignment _assignment = stmt.getAssignment();
            boolean _tripleNotEquals_3 = (_assignment != null);
            if (_tripleNotEquals_3) {
              this.compileAssignment(stmt.getAssignment());
              _builder.newLineIfNotEmpty();
              _builder.newLine();
            } else {
              shortVarDecl _shortVarDecl = stmt.getShortVarDecl();
              boolean _tripleNotEquals_4 = (_shortVarDecl != null);
              if (_tripleNotEquals_4) {
                this.compileShortVarDecl(stmt.getShortVarDecl());
                _builder.newLineIfNotEmpty();
                _builder.newLine();
              }
            }
          }
        }
      }
    }
    return _builder;
  }
  
  public void compileShortVarDecl(final shortVarDecl decl) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  public void compileAssignment(final assignment assignment) {
    int _size = assignment.getExprList1().getExpr().size();
    ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, _size, true);
    for (final Integer i : _doubleDotLessThan) {
      this.compileSingleAssignment(assignment.getExprList1().getExpr().get((i).intValue()), assignment.getOperation(), assignment.getExprList2().getExpr().get((i).intValue()));
    }
  }
  
  public CharSequence compileSingleAssignment(final expression expression, final String operator, final org.xtext.go.expression expression2) {
    StringConcatenation _builder = new StringConcatenation();
    {
      boolean _equals = operator.equals("=");
      if (_equals) {
        String _string = this.address.toString();
        _builder.append(_string);
        _builder.append(": LD R");
        String _string_1 = this.variables.toString();
        _builder.append(_string_1);
        _builder.append(" ");
        CharSequence _compileExpression = this.compileExpression(expression);
        _builder.append(_compileExpression);
        _builder.newLineIfNotEmpty();
        this.nextAddress();
        _builder.newLineIfNotEmpty();
        String _string_2 = this.address.toString();
        _builder.append(_string_2);
        _builder.append(": LD R");
        String _string_3 = this.variables.toString();
        _builder.append(_string_3);
        _builder.append(" ");
        CharSequence _compileExpression_1 = this.compileExpression(expression2);
        _builder.append(_compileExpression_1);
        _builder.newLineIfNotEmpty();
        this.nextAddress();
        _builder.newLineIfNotEmpty();
        String _string_4 = this.address.toString();
        _builder.append(_string_4);
        _builder.append(": LD R");
        String _string_5 = Integer.valueOf(((this.variables).intValue() - 2)).toString();
        _builder.append(_string_5);
        _builder.append(" R");
        String _string_6 = Integer.valueOf(((this.variables).intValue() - 2)).toString();
        _builder.append(_string_6);
        _builder.newLineIfNotEmpty();
        this.nextAddress();
        _builder.append(" // TODO: need create ST");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  public void compileIncDecStmt(final incDecStmt stmt) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  public void compileExpressionStmt(final expressionStmt stmt) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  public void compileSendStmt(final sendStmt stmt) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  public void nextAddress() {
    this.address = Integer.valueOf(((this.address).intValue() + 8));
  }
  
  public void increment() {
    this.variables++;
  }
}
