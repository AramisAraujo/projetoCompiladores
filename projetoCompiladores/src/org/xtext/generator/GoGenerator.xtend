/*
 * generated by Xtext 2.13.0
 */
package org.xtext.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.xtext.go.*

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 * «»
 */
 
class GoGenerator implements IGenerator {
	Integer counter = 1;
	Integer variables = 1;
	
	Integer address = 0;
	
	override doGenerate(Resource input, IFileSystemAccess fsa) {
		counter = 1;
		for(e : input.allContents.toIterable.filter(ifStmt)) {
			fsa.generateFile("stmt" + counter + ".txt", e.compileIfStatement());
			counter++;
		}
	}
		
	def CharSequence compileIfStatement(ifStmt stmt) '''
		«address»: LD SP, 1000
		«nextAddress»
		«(stmt.simplStatement).compileSimpleStatement»
		«(stmt.expr).compileExpression»
		«(stmt.codeBlock).compileBlock»
	'''
		
	def compileExpression(expression expression) '''
		//TODO

	'''
	
	def compileBlock(block block) '''
		«block.statements.compileStatementList»
		//TODO
	'''
	
	def compileStatementList(statementList stmtList) '''
		«FOR stmt : stmtList.statements»
			«stmt.compileStatement»
		«ENDFOR»
	
	'''
	
	def compileDeclaration(declaration decl) '''
		//TODO
	'''
	
	def compileContinueStatement(continueStmt cntStmt) '''
	//TODO
	
	'''
	
	def compileStatement(statement stmt) '''
		«IF stmt.declaration !== null»
			«compileDeclaration(stmt.declaration)»
			
		«ELSEIF stmt.continueStmt !== null»
			«compileContinueStatement(stmt.continueStmt)»
			
		«ELSEIF stmt.labeledStmt !== null»
			«compileLabeledStatement(stmt.labeledStmt)»
			
		«ELSEIF stmt.simpleStmt !== null»
			«compileSimpleStatement(stmt.simpleStmt)»
			
		«ELSEIF stmt.goStmt !== null»
			«compileGoStatement(stmt.goStmt)»
			
		«ELSEIF stmt.returnStmt !== null»
			«compileReturnStatement(stmt.returnStmt)»
			
		«ELSEIF stmt.breakStmt !== null»
			«compileBreakStatement(stmt.breakStmt)»
			
		«ELSEIF stmt.fallthroughStmt !== null»
			«compileFallthroughStatement(stmt.fallthroughStmt)»
			
		«ELSEIF stmt.block !== null»
			«compileBlock(stmt.block)»
			
		«ELSEIF stmt.ifStmt !== null»
			«compileIfStatement(stmt.ifStmt)»
			
		«ELSEIF stmt.switchStmt !== null»
			«compileSwitchStatement(stmt.switchStmt)»
			
		«ELSEIF stmt.forStmt !== null»
			«compileForStatement(stmt.forStmt)»
			
		«ELSEIF stmt.selectStmt !== null»
			«compileSelectStatement(stmt.selectStmt)»
			
		«ELSEIF stmt.deferStmt !== null»
			«compileDeferStatement(stmt.deferStmt)»
			
		«ENDIF»
	'''
	
	def compileForStatement(forStmt stmt)'''
	
	//TODO
	'''
	
	def compileSelectStatement(selectStmt stmt)'''
	
	//TODO
	'''
	
	def compileDeferStatement(deferStmt stmt)'''
	
	//TODO
	'''
	
	def compileSwitchStatement(switchStmt stmt)'''
	
	//TODO
	'''
	
	def compileFallthroughStatement(fallthroughStmt stmt)'''
	//TODO
	
	'''
	def compileReturnStatement(returnStmt stmt)'''
	//TODO
	
	'''
	def compileBreakStatement(breakStmt stmt)'''
	//TODO
	
	'''
	
	def compileGoStatement(goStmt stmt) '''
	
	//TODO
	
	'''
	
	def compileLabeledStatement(labeledStmt lbstmt) '''
	
//TODO
	'''
	
	def compileSimpleStatement(simpleStmt stmt) '''
		«IF stmt.sendStmt !== null»
			«compileSendStmt(stmt.sendStmt)»
			
		«ELSEIF stmt.expressionStmt !== null»
			«compileExpressionStmt(stmt.expressionStmt)»
			
		«ELSEIF stmt.incDecStmt !== null»
			«compileIncDecStmt(stmt.incDecStmt)»
			
		«ELSEIF stmt.assignment !== null»
			«compileAssignment(stmt.assignment)»
			
		«ELSEIF stmt.shortVarDecl !== null»
			«compileShortVarDecl(stmt.shortVarDecl)»
			
		«ENDIF»
	'''
		
	def compileShortVarDecl(shortVarDecl decl) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	def compileAssignment(assignment assignment){
		for (i : 0 ..< assignment.exprList1.expr.size) {
			compileSingleAssignment(assignment.exprList1.expr.get(i), assignment.operation, assignment.exprList2.expr.get(i))
		}
	}
		
	def compileSingleAssignment(expression expression, String operator, expression expression2) '''
		«IF operator.equals("=")»
			«address.toString()»: LD R«variables.toString» «(expression).compileExpression»
			«nextAddress»
			«address.toString()»: LD R«variables.toString» «(expression2).compileExpression»
			«nextAddress»
			«address.toString()»: LD R«(variables-2).toString» R«(variables-2).toString»
			«nextAddress» // TODO: need create ST
		«ENDIF»
	'''
		
	
	def compileIncDecStmt(incDecStmt stmt) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	def compileExpressionStmt(expressionStmt stmt) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	def compileSendStmt(sendStmt stmt) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	def void nextAddress() {
		address = address + 8;
	}
	
	def void increment() {
		variables++;
	}
}
