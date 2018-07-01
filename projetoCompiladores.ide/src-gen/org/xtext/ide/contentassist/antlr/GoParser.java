/*
 * generated by Xtext 2.13.0
 */
package org.xtext.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.ide.contentassist.antlr.internal.InternalGoParser;
import org.xtext.services.GoGrammarAccess;

public class GoParser extends AbstractContentAssistParser {

	@Inject
	private GoGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalGoParser createParser() {
		InternalGoParser result = new InternalGoParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getProgramAccess().getAlternatives(), "rule__Program__Alternatives");
					put(grammarAccess.getOPERATORSAccess().getAlternatives(), "rule__OPERATORS__Alternatives");
					put(grammarAccess.getInt_litAccess().getAlternatives(), "rule__Int_lit__Alternatives");
					put(grammarAccess.getFloat_litAccess().getAlternatives_1(), "rule__Float_lit__Alternatives_1");
					put(grammarAccess.getExponentAccess().getAlternatives_0(), "rule__Exponent__Alternatives_0");
					put(grammarAccess.getExponentAccess().getAlternatives_1(), "rule__Exponent__Alternatives_1");
					put(grammarAccess.getImaginary_litAccess().getAlternatives_0(), "rule__Imaginary_lit__Alternatives_0");
					put(grammarAccess.getRune_litAccess().getAlternatives_1(), "rule__Rune_lit__Alternatives_1");
					put(grammarAccess.getByte_valueAccess().getAlternatives(), "rule__Byte_value__Alternatives");
					put(grammarAccess.getString_litAccess().getAlternatives(), "rule__String_lit__Alternatives");
					put(grammarAccess.getInterpreted_string_litAccess().getAlternatives_1(), "rule__Interpreted_string_lit__Alternatives_1");
					put(grammarAccess.getLiteralsAccess().getAlternatives(), "rule__Literals__Alternatives");
					put(grammarAccess.getTokenAccess().getAlternatives(), "rule__Token__Alternatives");
					put(grammarAccess.getTypeAccess().getAlternatives(), "rule__Type__Alternatives");
					put(grammarAccess.getType_nameAccess().getAlternatives(), "rule__Type_name__Alternatives");
					put(grammarAccess.getType_litAccess().getAlternatives(), "rule__Type_lit__Alternatives");
					put(grammarAccess.getField_declAccess().getAlternatives_0(), "rule__Field_decl__Alternatives_0");
					put(grammarAccess.getResultAccess().getAlternatives(), "rule__Result__Alternatives");
					put(grammarAccess.getMethod_specAccess().getAlternatives(), "rule__Method_spec__Alternatives");
					put(grammarAccess.getChannel_typeAccess().getAlternatives_0(), "rule__Channel_type__Alternatives_0");
					put(grammarAccess.getConst_declAccess().getAlternatives(), "rule__Const_decl__Alternatives");
					put(grammarAccess.getOperandAccess().getAlternatives(), "rule__Operand__Alternatives");
					put(grammarAccess.getBasic_litAccess().getAlternatives(), "rule__Basic_lit__Alternatives");
					put(grammarAccess.getOperand_nameAccess().getAlternatives(), "rule__Operand_name__Alternatives");
					put(grammarAccess.getUnary_exprAccess().getAlternatives(), "rule__Unary_expr__Alternatives");
					put(grammarAccess.getStatementAccess().getAlternatives(), "rule__Statement__Alternatives");
					put(grammarAccess.getSimple_stmtAccess().getAlternatives(), "rule__Simple_stmt__Alternatives");
					put(grammarAccess.getIf_stmtAccess().getAlternatives_4_1(), "rule__If_stmt__Alternatives_4_1");
					put(grammarAccess.getImport_declAccess().getAlternatives_1(), "rule__Import_decl__Alternatives_1");
					put(grammarAccess.getImport_specAccess().getAlternatives_0(), "rule__Import_spec__Alternatives_0");
					put(grammarAccess.getFloat_litAccess().getGroup(), "rule__Float_lit__Group__0");
					put(grammarAccess.getFloat_litAccess().getGroup_1_0(), "rule__Float_lit__Group_1_0__0");
					put(grammarAccess.getExponentAccess().getGroup(), "rule__Exponent__Group__0");
					put(grammarAccess.getImaginary_litAccess().getGroup(), "rule__Imaginary_lit__Group__0");
					put(grammarAccess.getRune_litAccess().getGroup(), "rule__Rune_lit__Group__0");
					put(grammarAccess.getInterpreted_string_litAccess().getGroup(), "rule__Interpreted_string_lit__Group__0");
					put(grammarAccess.getTypeAccess().getGroup_2(), "rule__Type__Group_2__0");
					put(grammarAccess.getArray_typeAccess().getGroup(), "rule__Array_type__Group__0");
					put(grammarAccess.getStruct_typeAccess().getGroup(), "rule__Struct_type__Group__0");
					put(grammarAccess.getStruct_typeAccess().getGroup_2(), "rule__Struct_type__Group_2__0");
					put(grammarAccess.getField_declAccess().getGroup(), "rule__Field_decl__Group__0");
					put(grammarAccess.getField_declAccess().getGroup_0_0(), "rule__Field_decl__Group_0_0__0");
					put(grammarAccess.getEmbedded_fieldAccess().getGroup(), "rule__Embedded_field__Group__0");
					put(grammarAccess.getPointer_typeAccess().getGroup(), "rule__Pointer_type__Group__0");
					put(grammarAccess.getFunction_typeAccess().getGroup(), "rule__Function_type__Group__0");
					put(grammarAccess.getSignatureAccess().getGroup(), "rule__Signature__Group__0");
					put(grammarAccess.getParametersAccess().getGroup(), "rule__Parameters__Group__0");
					put(grammarAccess.getParametersAccess().getGroup_1(), "rule__Parameters__Group_1__0");
					put(grammarAccess.getParameter_listAccess().getGroup(), "rule__Parameter_list__Group__0");
					put(grammarAccess.getParameter_listAccess().getGroup_1(), "rule__Parameter_list__Group_1__0");
					put(grammarAccess.getParameter_listAccess().getGroup_1_0(), "rule__Parameter_list__Group_1_0__0");
					put(grammarAccess.getParameter_declAccess().getGroup(), "rule__Parameter_decl__Group__0");
					put(grammarAccess.getParameter_declAccess().getGroup_0(), "rule__Parameter_decl__Group_0__0");
					put(grammarAccess.getIdentifier_listAccess().getGroup(), "rule__Identifier_list__Group__0");
					put(grammarAccess.getIdentifier_listAccess().getGroup_1(), "rule__Identifier_list__Group_1__0");
					put(grammarAccess.getInterface_typeAccess().getGroup(), "rule__Interface_type__Group__0");
					put(grammarAccess.getInterface_typeAccess().getGroup_2(), "rule__Interface_type__Group_2__0");
					put(grammarAccess.getMethod_specAccess().getGroup_0(), "rule__Method_spec__Group_0__0");
					put(grammarAccess.getSlice_typeAccess().getGroup(), "rule__Slice_type__Group__0");
					put(grammarAccess.getMap_typeAccess().getGroup(), "rule__Map_type__Group__0");
					put(grammarAccess.getChannel_typeAccess().getGroup(), "rule__Channel_type__Group__0");
					put(grammarAccess.getBlockAccess().getGroup(), "rule__Block__Group__0");
					put(grammarAccess.getStatement_listAccess().getGroup(), "rule__Statement_list__Group__0");
					put(grammarAccess.getConst_declAccess().getGroup_0(), "rule__Const_decl__Group_0__0");
					put(grammarAccess.getConst_declAccess().getGroup_1(), "rule__Const_decl__Group_1__0");
					put(grammarAccess.getConst_declAccess().getGroup_1_1(), "rule__Const_decl__Group_1_1__0");
					put(grammarAccess.getConst_specAccess().getGroup(), "rule__Const_spec__Group__0");
					put(grammarAccess.getConst_specAccess().getGroup_1(), "rule__Const_spec__Group_1__0");
					put(grammarAccess.getExpression_listAccess().getGroup(), "rule__Expression_list__Group__0");
					put(grammarAccess.getExpression_listAccess().getGroup_1(), "rule__Expression_list__Group_1__0");
					put(grammarAccess.getFunction_declAccess().getGroup(), "rule__Function_decl__Group__0");
					put(grammarAccess.getOperandAccess().getGroup_2(), "rule__Operand__Group_2__0");
					put(grammarAccess.getQualified_identAccess().getGroup(), "rule__Qualified_ident__Group__0");
					put(grammarAccess.getSelectorAccess().getGroup(), "rule__Selector__Group__0");
					put(grammarAccess.getType_assertionAccess().getGroup(), "rule__Type_assertion__Group__0");
					put(grammarAccess.getExpressionAccess().getGroup(), "rule__Expression__Group__0");
					put(grammarAccess.getExpression_lineAccess().getGroup(), "rule__Expression_line__Group__0");
					put(grammarAccess.getLabeled_stmtAccess().getGroup(), "rule__Labeled_stmt__Group__0");
					put(grammarAccess.getIf_stmtAccess().getGroup(), "rule__If_stmt__Group__0");
					put(grammarAccess.getIf_stmtAccess().getGroup_1(), "rule__If_stmt__Group_1__0");
					put(grammarAccess.getIf_stmtAccess().getGroup_4(), "rule__If_stmt__Group_4__0");
					put(grammarAccess.getGo_stmtAccess().getGroup(), "rule__Go_stmt__Group__0");
					put(grammarAccess.getReturn_stmtAccess().getGroup(), "rule__Return_stmt__Group__0");
					put(grammarAccess.getBreak_stmtAccess().getGroup(), "rule__Break_stmt__Group__0");
					put(grammarAccess.getContinue_stmtAccess().getGroup(), "rule__Continue_stmt__Group__0");
					put(grammarAccess.getGoto_stmtAccess().getGroup(), "rule__Goto_stmt__Group__0");
					put(grammarAccess.getDefer_stmtAccess().getGroup(), "rule__Defer_stmt__Group__0");
					put(grammarAccess.getPackage_clauseAccess().getGroup(), "rule__Package_clause__Group__0");
					put(grammarAccess.getImport_declAccess().getGroup(), "rule__Import_decl__Group__0");
					put(grammarAccess.getImport_declAccess().getGroup_1_1(), "rule__Import_decl__Group_1_1__0");
					put(grammarAccess.getImport_declAccess().getGroup_1_1_1(), "rule__Import_decl__Group_1_1_1__0");
					put(grammarAccess.getImport_specAccess().getGroup(), "rule__Import_spec__Group__0");
					put(grammarAccess.getModelAccess().getGreetingsAssignment(), "rule__Model__GreetingsAssignment");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public GoGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(GoGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
