/*
 * generated by Xtext 2.13.0
 */
package org.xtext.validation

import org.eclipse.xtext.validation.Check
import org.xtext.go.ifStmt
import org.eclipse.xtend.lib.macro.expression.Expression

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class GoValidator extends AbstractGoValidator {
	
	@Check
	def checkUniqueId(ifStmt stmt) {
		if(stmt.simpleStmt !== null) {
			var simpleStmt = stmt.simpleStmt;
			
			if(simpleStmt.sendStmt !== null) {
				var sendStmt = simpleStmt.sendStmt;
				
				if(sendStmt.expressionLeft !== null) {
					if(sendStmt.expressionRight === null) {
						error("Invalid send statement");
					}
					
					checkExpression(sendStmt.expressionLeft);
					checkExpression(sendStmt.expressionRight);
				}
			}
		}
	}
	
	def checkExpression(Expression expression) {
		
	}
	
	
	
//	public static val INVALID_NAME = 'invalidName'
//
//	@Check
//	def checkGreetingStartsWithCapital(Greeting greeting) {
//		if (!Character.isUpperCase(greeting.name.charAt(0))) {
//			warning('Name should start with a capital', 
//					GoPackage.Literals.GREETING__NAME,
//					INVALID_NAME)
//		}
//	}
	
}
