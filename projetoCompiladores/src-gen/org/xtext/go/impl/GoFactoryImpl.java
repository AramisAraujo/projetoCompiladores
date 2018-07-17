/**
 * generated by Xtext 2.13.0
 */
package org.xtext.go.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.go.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GoFactoryImpl extends EFactoryImpl implements GoFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static GoFactory init()
  {
    try
    {
      GoFactory theGoFactory = (GoFactory)EPackage.Registry.INSTANCE.getEFactory(GoPackage.eNS_URI);
      if (theGoFactory != null)
      {
        return theGoFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new GoFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GoFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case GoPackage.MODEL: return createModel();
      case GoPackage.SOURCE_FILE: return createsourceFile();
      case GoPackage.IMPORT_DECL: return createimportDecl();
      case GoPackage.IMPORT_SPEC: return createimportSpec();
      case GoPackage.TOP_LEVEL_DECL: return createtopLevelDecl();
      case GoPackage.DECLARATION: return createdeclaration();
      case GoPackage.CONST_DECL: return createconstDecl();
      case GoPackage.CONST_SPEC: return createconstSpec();
      case GoPackage.EXPRESSION_LIST: return createexpressionList();
      case GoPackage.TYPE_DECL: return createtypeDecl();
      case GoPackage.TYPE_SPEC: return createtypeSpec();
      case GoPackage.FUNCTION_DECL: return createfunctionDecl();
      case GoPackage.FUNCTION: return createfunction();
      case GoPackage.METHOD_DECL: return createmethodDecl();
      case GoPackage.RECEIVER: return createreceiver();
      case GoPackage.VAR_DECL: return createvarDecl();
      case GoPackage.VAR_SPEC: return createvarSpec();
      case GoPackage.BLOCK: return createblock();
      case GoPackage.STATEMENT_LIST: return createstatementList();
      case GoPackage.STATEMENT: return createstatement();
      case GoPackage.SIMPLE_STMT: return createsimpleStmt();
      case GoPackage.EXPRESSION_STMT: return createexpressionStmt();
      case GoPackage.SEND_STMT: return createsendStmt();
      case GoPackage.INC_DEC_STMT: return createincDecStmt();
      case GoPackage.ASSIGNMENT: return createassignment();
      case GoPackage.SHORT_VAR_DECL: return createshortVarDecl();
      case GoPackage.LABELED_STMT: return createlabeledStmt();
      case GoPackage.RETURN_STMT: return createreturnStmt();
      case GoPackage.DEFER_STMT: return createdeferStmt();
      case GoPackage.IF_STMT: return createifStmt();
      case GoPackage.SWITCH_STMT: return createswitchStmt();
      case GoPackage.EXPR_SWITCH_STMT: return createexprSwitchStmt();
      case GoPackage.EXPR_CASE_CLAUSE: return createexprCaseClause();
      case GoPackage.EXPR_SWITCH_CASE: return createexprSwitchCase();
      case GoPackage.TYPE_SWITCH_STMT: return createtypeSwitchStmt();
      case GoPackage.TYPE_SWITCH_GUARD: return createtypeSwitchGuard();
      case GoPackage.TYPE_CASE_CLAUSE: return createtypeCaseClause();
      case GoPackage.TYPE_SWITCH_CASE: return createtypeSwitchCase();
      case GoPackage.TYPE_LIST: return createtypeList();
      case GoPackage.SELECT_STMT: return createselectStmt();
      case GoPackage.COMM_CLAUSE: return createcommClause();
      case GoPackage.COMM_CASE: return createcommCase();
      case GoPackage.RECV_STMT: return createrecvStmt();
      case GoPackage.FOR_STMT: return createforStmt();
      case GoPackage.FOR_CLAUSE: return createforClause();
      case GoPackage.RANGE_CLAUSE: return createrangeClause();
      case GoPackage.GO_STMT: return creategoStmt();
      case GoPackage.TYPE: return createtype();
      case GoPackage.TYPE_NAME: return createtypeName();
      case GoPackage.TYPE_LIT: return createtypeLit();
      case GoPackage.ARRAY_TYPE: return createarrayType();
      case GoPackage.ARRAY_LENGTH: return createarrayLength();
      case GoPackage.ELEMENT_TYPE: return createelementType();
      case GoPackage.POINTER_TYPE: return createpointerType();
      case GoPackage.INTERFACE_TYPE: return createinterfaceType();
      case GoPackage.SLICE_TYPE: return createsliceType();
      case GoPackage.MAP_TYPE: return createmapType();
      case GoPackage.CHANNEL_TYPE: return createchannelType();
      case GoPackage.METHOD_SPEC: return createmethodSpec();
      case GoPackage.FUNCTION_TYPE: return createfunctionType();
      case GoPackage.SIGNATURE: return createsignature();
      case GoPackage.RESULT: return createresult();
      case GoPackage.PARAMETERS: return createparameters();
      case GoPackage.PARAMETER_LIST: return createparameterList();
      case GoPackage.PARAMETER_DECL: return createparameterDecl();
      case GoPackage.OPERAND: return createoperand();
      case GoPackage.LITERAL: return createliteral();
      case GoPackage.OPERAND_NAME: return createoperandName();
      case GoPackage.COMPOSITE_LIT: return createcompositeLit();
      case GoPackage.LITERAL_TYPE: return createliteralType();
      case GoPackage.LITERAL_VALUE: return createliteralValue();
      case GoPackage.ELEMENT_LIST: return createelementList();
      case GoPackage.KEYED_ELEMENT: return createkeyedElement();
      case GoPackage.KEY: return createkey();
      case GoPackage.ELEMENT: return createelement();
      case GoPackage.STRUCT_TYPE: return createstructType();
      case GoPackage.FIELD_DECL: return createfieldDecl();
      case GoPackage.ANONYMOUS_FIELD: return createanonymousField();
      case GoPackage.FUNCTION_LIT: return createfunctionLit();
      case GoPackage.PRIMARY_EXPR: return createprimaryExpr();
      case GoPackage.PRIMARY_EXPR_STUFF: return createprimaryExprStuff();
      case GoPackage.PRIMARY_EXPR_SELECTOR: return createprimaryExprSelector();
      case GoPackage.PRIMARY_EXPR_INDEX: return createprimaryExprIndex();
      case GoPackage.PRIMARY_EXPR_SLICE: return createprimaryExprSlice();
      case GoPackage.PRIMARY_EXPR_TYPE_ASSERTION: return createprimaryExprTypeAssertion();
      case GoPackage.PRIMARY_EXPR_ARGUMENTS: return createprimaryExprArguments();
      case GoPackage.INDEX: return createindex();
      case GoPackage.SLICE: return createslice();
      case GoPackage.TYPE_ASSERTION: return createtypeAssertion();
      case GoPackage.ARGUMENTS: return createarguments();
      case GoPackage.METHOD_EXPR: return createmethodExpr();
      case GoPackage.RECEIVER_TYPE: return createreceiverType();
      case GoPackage.EXPRESSION: return createexpression();
      case GoPackage.EXPRESSION_MATCHED: return createexpressionMatched();
      case GoPackage.UNARY_EXPR: return createunaryExpr();
      case GoPackage.CONVERSION: return createconversion();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public sourceFile createsourceFile()
  {
    sourceFileImpl sourceFile = new sourceFileImpl();
    return sourceFile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public importDecl createimportDecl()
  {
    importDeclImpl importDecl = new importDeclImpl();
    return importDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public importSpec createimportSpec()
  {
    importSpecImpl importSpec = new importSpecImpl();
    return importSpec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public topLevelDecl createtopLevelDecl()
  {
    topLevelDeclImpl topLevelDecl = new topLevelDeclImpl();
    return topLevelDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public declaration createdeclaration()
  {
    declarationImpl declaration = new declarationImpl();
    return declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public constDecl createconstDecl()
  {
    constDeclImpl constDecl = new constDeclImpl();
    return constDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public constSpec createconstSpec()
  {
    constSpecImpl constSpec = new constSpecImpl();
    return constSpec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public expressionList createexpressionList()
  {
    expressionListImpl expressionList = new expressionListImpl();
    return expressionList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public typeDecl createtypeDecl()
  {
    typeDeclImpl typeDecl = new typeDeclImpl();
    return typeDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public typeSpec createtypeSpec()
  {
    typeSpecImpl typeSpec = new typeSpecImpl();
    return typeSpec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public functionDecl createfunctionDecl()
  {
    functionDeclImpl functionDecl = new functionDeclImpl();
    return functionDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public function createfunction()
  {
    functionImpl function = new functionImpl();
    return function;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public methodDecl createmethodDecl()
  {
    methodDeclImpl methodDecl = new methodDeclImpl();
    return methodDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public receiver createreceiver()
  {
    receiverImpl receiver = new receiverImpl();
    return receiver;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public varDecl createvarDecl()
  {
    varDeclImpl varDecl = new varDeclImpl();
    return varDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public varSpec createvarSpec()
  {
    varSpecImpl varSpec = new varSpecImpl();
    return varSpec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public block createblock()
  {
    blockImpl block = new blockImpl();
    return block;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public statementList createstatementList()
  {
    statementListImpl statementList = new statementListImpl();
    return statementList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public statement createstatement()
  {
    statementImpl statement = new statementImpl();
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public simpleStmt createsimpleStmt()
  {
    simpleStmtImpl simpleStmt = new simpleStmtImpl();
    return simpleStmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public expressionStmt createexpressionStmt()
  {
    expressionStmtImpl expressionStmt = new expressionStmtImpl();
    return expressionStmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public sendStmt createsendStmt()
  {
    sendStmtImpl sendStmt = new sendStmtImpl();
    return sendStmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public incDecStmt createincDecStmt()
  {
    incDecStmtImpl incDecStmt = new incDecStmtImpl();
    return incDecStmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public assignment createassignment()
  {
    assignmentImpl assignment = new assignmentImpl();
    return assignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public shortVarDecl createshortVarDecl()
  {
    shortVarDeclImpl shortVarDecl = new shortVarDeclImpl();
    return shortVarDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public labeledStmt createlabeledStmt()
  {
    labeledStmtImpl labeledStmt = new labeledStmtImpl();
    return labeledStmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public returnStmt createreturnStmt()
  {
    returnStmtImpl returnStmt = new returnStmtImpl();
    return returnStmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public deferStmt createdeferStmt()
  {
    deferStmtImpl deferStmt = new deferStmtImpl();
    return deferStmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ifStmt createifStmt()
  {
    ifStmtImpl ifStmt = new ifStmtImpl();
    return ifStmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public switchStmt createswitchStmt()
  {
    switchStmtImpl switchStmt = new switchStmtImpl();
    return switchStmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public exprSwitchStmt createexprSwitchStmt()
  {
    exprSwitchStmtImpl exprSwitchStmt = new exprSwitchStmtImpl();
    return exprSwitchStmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public exprCaseClause createexprCaseClause()
  {
    exprCaseClauseImpl exprCaseClause = new exprCaseClauseImpl();
    return exprCaseClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public exprSwitchCase createexprSwitchCase()
  {
    exprSwitchCaseImpl exprSwitchCase = new exprSwitchCaseImpl();
    return exprSwitchCase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public typeSwitchStmt createtypeSwitchStmt()
  {
    typeSwitchStmtImpl typeSwitchStmt = new typeSwitchStmtImpl();
    return typeSwitchStmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public typeSwitchGuard createtypeSwitchGuard()
  {
    typeSwitchGuardImpl typeSwitchGuard = new typeSwitchGuardImpl();
    return typeSwitchGuard;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public typeCaseClause createtypeCaseClause()
  {
    typeCaseClauseImpl typeCaseClause = new typeCaseClauseImpl();
    return typeCaseClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public typeSwitchCase createtypeSwitchCase()
  {
    typeSwitchCaseImpl typeSwitchCase = new typeSwitchCaseImpl();
    return typeSwitchCase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public typeList createtypeList()
  {
    typeListImpl typeList = new typeListImpl();
    return typeList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public selectStmt createselectStmt()
  {
    selectStmtImpl selectStmt = new selectStmtImpl();
    return selectStmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public commClause createcommClause()
  {
    commClauseImpl commClause = new commClauseImpl();
    return commClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public commCase createcommCase()
  {
    commCaseImpl commCase = new commCaseImpl();
    return commCase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public recvStmt createrecvStmt()
  {
    recvStmtImpl recvStmt = new recvStmtImpl();
    return recvStmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public forStmt createforStmt()
  {
    forStmtImpl forStmt = new forStmtImpl();
    return forStmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public forClause createforClause()
  {
    forClauseImpl forClause = new forClauseImpl();
    return forClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public rangeClause createrangeClause()
  {
    rangeClauseImpl rangeClause = new rangeClauseImpl();
    return rangeClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public goStmt creategoStmt()
  {
    goStmtImpl goStmt = new goStmtImpl();
    return goStmt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public type createtype()
  {
    typeImpl type = new typeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public typeName createtypeName()
  {
    typeNameImpl typeName = new typeNameImpl();
    return typeName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public typeLit createtypeLit()
  {
    typeLitImpl typeLit = new typeLitImpl();
    return typeLit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public arrayType createarrayType()
  {
    arrayTypeImpl arrayType = new arrayTypeImpl();
    return arrayType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public arrayLength createarrayLength()
  {
    arrayLengthImpl arrayLength = new arrayLengthImpl();
    return arrayLength;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public elementType createelementType()
  {
    elementTypeImpl elementType = new elementTypeImpl();
    return elementType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public pointerType createpointerType()
  {
    pointerTypeImpl pointerType = new pointerTypeImpl();
    return pointerType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public interfaceType createinterfaceType()
  {
    interfaceTypeImpl interfaceType = new interfaceTypeImpl();
    return interfaceType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public sliceType createsliceType()
  {
    sliceTypeImpl sliceType = new sliceTypeImpl();
    return sliceType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public mapType createmapType()
  {
    mapTypeImpl mapType = new mapTypeImpl();
    return mapType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public channelType createchannelType()
  {
    channelTypeImpl channelType = new channelTypeImpl();
    return channelType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public methodSpec createmethodSpec()
  {
    methodSpecImpl methodSpec = new methodSpecImpl();
    return methodSpec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public functionType createfunctionType()
  {
    functionTypeImpl functionType = new functionTypeImpl();
    return functionType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public signature createsignature()
  {
    signatureImpl signature = new signatureImpl();
    return signature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public result createresult()
  {
    resultImpl result = new resultImpl();
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public parameters createparameters()
  {
    parametersImpl parameters = new parametersImpl();
    return parameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public parameterList createparameterList()
  {
    parameterListImpl parameterList = new parameterListImpl();
    return parameterList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public parameterDecl createparameterDecl()
  {
    parameterDeclImpl parameterDecl = new parameterDeclImpl();
    return parameterDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public operand createoperand()
  {
    operandImpl operand = new operandImpl();
    return operand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public literal createliteral()
  {
    literalImpl literal = new literalImpl();
    return literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public operandName createoperandName()
  {
    operandNameImpl operandName = new operandNameImpl();
    return operandName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public compositeLit createcompositeLit()
  {
    compositeLitImpl compositeLit = new compositeLitImpl();
    return compositeLit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public literalType createliteralType()
  {
    literalTypeImpl literalType = new literalTypeImpl();
    return literalType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public literalValue createliteralValue()
  {
    literalValueImpl literalValue = new literalValueImpl();
    return literalValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public elementList createelementList()
  {
    elementListImpl elementList = new elementListImpl();
    return elementList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public keyedElement createkeyedElement()
  {
    keyedElementImpl keyedElement = new keyedElementImpl();
    return keyedElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public key createkey()
  {
    keyImpl key = new keyImpl();
    return key;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public element createelement()
  {
    elementImpl element = new elementImpl();
    return element;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public structType createstructType()
  {
    structTypeImpl structType = new structTypeImpl();
    return structType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public fieldDecl createfieldDecl()
  {
    fieldDeclImpl fieldDecl = new fieldDeclImpl();
    return fieldDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public anonymousField createanonymousField()
  {
    anonymousFieldImpl anonymousField = new anonymousFieldImpl();
    return anonymousField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public functionLit createfunctionLit()
  {
    functionLitImpl functionLit = new functionLitImpl();
    return functionLit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public primaryExpr createprimaryExpr()
  {
    primaryExprImpl primaryExpr = new primaryExprImpl();
    return primaryExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public primaryExprStuff createprimaryExprStuff()
  {
    primaryExprStuffImpl primaryExprStuff = new primaryExprStuffImpl();
    return primaryExprStuff;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public primaryExprSelector createprimaryExprSelector()
  {
    primaryExprSelectorImpl primaryExprSelector = new primaryExprSelectorImpl();
    return primaryExprSelector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public primaryExprIndex createprimaryExprIndex()
  {
    primaryExprIndexImpl primaryExprIndex = new primaryExprIndexImpl();
    return primaryExprIndex;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public primaryExprSlice createprimaryExprSlice()
  {
    primaryExprSliceImpl primaryExprSlice = new primaryExprSliceImpl();
    return primaryExprSlice;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public primaryExprTypeAssertion createprimaryExprTypeAssertion()
  {
    primaryExprTypeAssertionImpl primaryExprTypeAssertion = new primaryExprTypeAssertionImpl();
    return primaryExprTypeAssertion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public primaryExprArguments createprimaryExprArguments()
  {
    primaryExprArgumentsImpl primaryExprArguments = new primaryExprArgumentsImpl();
    return primaryExprArguments;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public index createindex()
  {
    indexImpl index = new indexImpl();
    return index;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public slice createslice()
  {
    sliceImpl slice = new sliceImpl();
    return slice;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public typeAssertion createtypeAssertion()
  {
    typeAssertionImpl typeAssertion = new typeAssertionImpl();
    return typeAssertion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public arguments createarguments()
  {
    argumentsImpl arguments = new argumentsImpl();
    return arguments;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public methodExpr createmethodExpr()
  {
    methodExprImpl methodExpr = new methodExprImpl();
    return methodExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public receiverType createreceiverType()
  {
    receiverTypeImpl receiverType = new receiverTypeImpl();
    return receiverType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public expression createexpression()
  {
    expressionImpl expression = new expressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public expressionMatched createexpressionMatched()
  {
    expressionMatchedImpl expressionMatched = new expressionMatchedImpl();
    return expressionMatched;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public unaryExpr createunaryExpr()
  {
    unaryExprImpl unaryExpr = new unaryExprImpl();
    return unaryExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public conversion createconversion()
  {
    conversionImpl conversion = new conversionImpl();
    return conversion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GoPackage getGoPackage()
  {
    return (GoPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static GoPackage getPackage()
  {
    return GoPackage.eINSTANCE;
  }

} //GoFactoryImpl
