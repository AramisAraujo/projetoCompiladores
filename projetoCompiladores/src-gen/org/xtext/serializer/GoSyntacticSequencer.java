/*
 * generated by Xtext 2.14.0
 */
package org.xtext.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.services.GoGrammarAccess;

@SuppressWarnings("all")
public class GoSyntacticSequencer extends AbstractSyntacticSequencer {

	protected GoGrammarAccess grammarAccess;
	protected AbstractElementAlias match_anonymousField_AsteriskKeyword_0_q;
	protected AbstractElementAlias match_arguments_CommaKeyword_1_2_q;
	protected AbstractElementAlias match_arguments_FullStopFullStopFullStopKeyword_1_1_q;
	protected AbstractElementAlias match_channelType_ChanKeyword_0_0_or___ChanKeyword_0_1_0_LessThanSignHyphenMinusKeyword_0_1_1___or___LessThanSignHyphenMinusKeyword_0_2_0_ChanKeyword_0_2_1__;
	protected AbstractElementAlias match_conversion_CommaKeyword_3_q;
	protected AbstractElementAlias match_fieldDecl_STRING_LITTerminalRuleCall_1_q;
	protected AbstractElementAlias match_importSpec___FullStopKeyword_0_0_or_IDENTIFIERTerminalRuleCall_0_1__q;
	protected AbstractElementAlias match_incDecStmt_HyphenMinusHyphenMinusKeyword_1_1_or_PlusSignPlusSignKeyword_1_0;
	protected AbstractElementAlias match_literalValue_CommaKeyword_1_1_q;
	protected AbstractElementAlias match_parameterDecl_FullStopFullStopFullStopKeyword_1_q;
	protected AbstractElementAlias match_parameters_CommaKeyword_1_1_q;
	protected AbstractElementAlias match_sourceFile_EosParserRuleCall_1_q;
	protected AbstractElementAlias match_sourceFile_EosParserRuleCall_2_1_q;
	protected AbstractElementAlias match_unaryExpr_AmpersandKeyword_1_0_5_or_AsteriskKeyword_1_0_4_or_CircumflexAccentKeyword_1_0_3_or_ExclamationMarkKeyword_1_0_2_or_HyphenMinusKeyword_1_0_1_or_LessThanSignHyphenMinusKeyword_1_0_6_or_PlusSignKeyword_1_0_0;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (GoGrammarAccess) access;
		match_anonymousField_AsteriskKeyword_0_q = new TokenAlias(false, true, grammarAccess.getAnonymousFieldAccess().getAsteriskKeyword_0());
		match_arguments_CommaKeyword_1_2_q = new TokenAlias(false, true, grammarAccess.getArgumentsAccess().getCommaKeyword_1_2());
		match_arguments_FullStopFullStopFullStopKeyword_1_1_q = new TokenAlias(false, true, grammarAccess.getArgumentsAccess().getFullStopFullStopFullStopKeyword_1_1());
		match_channelType_ChanKeyword_0_0_or___ChanKeyword_0_1_0_LessThanSignHyphenMinusKeyword_0_1_1___or___LessThanSignHyphenMinusKeyword_0_2_0_ChanKeyword_0_2_1__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getChannelTypeAccess().getChanKeyword_0_1_0()), new TokenAlias(false, false, grammarAccess.getChannelTypeAccess().getLessThanSignHyphenMinusKeyword_0_1_1())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getChannelTypeAccess().getLessThanSignHyphenMinusKeyword_0_2_0()), new TokenAlias(false, false, grammarAccess.getChannelTypeAccess().getChanKeyword_0_2_1())), new TokenAlias(false, false, grammarAccess.getChannelTypeAccess().getChanKeyword_0_0()));
		match_conversion_CommaKeyword_3_q = new TokenAlias(false, true, grammarAccess.getConversionAccess().getCommaKeyword_3());
		match_fieldDecl_STRING_LITTerminalRuleCall_1_q = new TokenAlias(false, true, grammarAccess.getFieldDeclAccess().getSTRING_LITTerminalRuleCall_1());
		match_importSpec___FullStopKeyword_0_0_or_IDENTIFIERTerminalRuleCall_0_1__q = new AlternativeAlias(false, true, new TokenAlias(false, false, grammarAccess.getImportSpecAccess().getFullStopKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getImportSpecAccess().getIDENTIFIERTerminalRuleCall_0_1()));
		match_incDecStmt_HyphenMinusHyphenMinusKeyword_1_1_or_PlusSignPlusSignKeyword_1_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getIncDecStmtAccess().getHyphenMinusHyphenMinusKeyword_1_1()), new TokenAlias(false, false, grammarAccess.getIncDecStmtAccess().getPlusSignPlusSignKeyword_1_0()));
		match_literalValue_CommaKeyword_1_1_q = new TokenAlias(false, true, grammarAccess.getLiteralValueAccess().getCommaKeyword_1_1());
		match_parameterDecl_FullStopFullStopFullStopKeyword_1_q = new TokenAlias(false, true, grammarAccess.getParameterDeclAccess().getFullStopFullStopFullStopKeyword_1());
		match_parameters_CommaKeyword_1_1_q = new TokenAlias(false, true, grammarAccess.getParametersAccess().getCommaKeyword_1_1());
		match_sourceFile_EosParserRuleCall_1_q = new TokenAlias(false, true, grammarAccess.getSourceFileAccess().getEosParserRuleCall_1());
		match_sourceFile_EosParserRuleCall_2_1_q = new TokenAlias(false, true, grammarAccess.getSourceFileAccess().getEosParserRuleCall_2_1());
		match_unaryExpr_AmpersandKeyword_1_0_5_or_AsteriskKeyword_1_0_4_or_CircumflexAccentKeyword_1_0_3_or_ExclamationMarkKeyword_1_0_2_or_HyphenMinusKeyword_1_0_1_or_LessThanSignHyphenMinusKeyword_1_0_6_or_PlusSignKeyword_1_0_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getUnaryExprAccess().getAmpersandKeyword_1_0_5()), new TokenAlias(false, false, grammarAccess.getUnaryExprAccess().getAsteriskKeyword_1_0_4()), new TokenAlias(false, false, grammarAccess.getUnaryExprAccess().getCircumflexAccentKeyword_1_0_3()), new TokenAlias(false, false, grammarAccess.getUnaryExprAccess().getExclamationMarkKeyword_1_0_2()), new TokenAlias(false, false, grammarAccess.getUnaryExprAccess().getHyphenMinusKeyword_1_0_1()), new TokenAlias(false, false, grammarAccess.getUnaryExprAccess().getLessThanSignHyphenMinusKeyword_1_0_6()), new TokenAlias(false, false, grammarAccess.getUnaryExprAccess().getPlusSignKeyword_1_0_0()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getBINARY_OPRule())
			return getBINARY_OPToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getIDENTIFIERRule())
			return getIDENTIFIERToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getSTRING_LITRule())
			return getSTRING_LITToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getEosRule())
			return geteosToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal BINARY_OP:
	 * 	'||' | '&&' | REL_OP | ADD_OP | MUL_OP;
	 */
	protected String getBINARY_OPToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "||";
	}
	
	/**
	 * terminal IDENTIFIER:
	 * 	LETTER ( LETTER | DECIMAL_DIGIT )*;
	 */
	protected String getIDENTIFIERToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	/**
	 * terminal STRING_LIT:
	 * 	RAW_STRING_LIT | INTERPRETED_STRING_LIT;
	 */
	protected String getSTRING_LITToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\'\'";
	}
	
	/**
	 * eos: 
	 * 	(';');
	 */
	protected String geteosToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ";";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_anonymousField_AsteriskKeyword_0_q.equals(syntax))
				emit_anonymousField_AsteriskKeyword_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_arguments_CommaKeyword_1_2_q.equals(syntax))
				emit_arguments_CommaKeyword_1_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_arguments_FullStopFullStopFullStopKeyword_1_1_q.equals(syntax))
				emit_arguments_FullStopFullStopFullStopKeyword_1_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_channelType_ChanKeyword_0_0_or___ChanKeyword_0_1_0_LessThanSignHyphenMinusKeyword_0_1_1___or___LessThanSignHyphenMinusKeyword_0_2_0_ChanKeyword_0_2_1__.equals(syntax))
				emit_channelType_ChanKeyword_0_0_or___ChanKeyword_0_1_0_LessThanSignHyphenMinusKeyword_0_1_1___or___LessThanSignHyphenMinusKeyword_0_2_0_ChanKeyword_0_2_1__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_conversion_CommaKeyword_3_q.equals(syntax))
				emit_conversion_CommaKeyword_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_fieldDecl_STRING_LITTerminalRuleCall_1_q.equals(syntax))
				emit_fieldDecl_STRING_LITTerminalRuleCall_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_importSpec___FullStopKeyword_0_0_or_IDENTIFIERTerminalRuleCall_0_1__q.equals(syntax))
				emit_importSpec___FullStopKeyword_0_0_or_IDENTIFIERTerminalRuleCall_0_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_incDecStmt_HyphenMinusHyphenMinusKeyword_1_1_or_PlusSignPlusSignKeyword_1_0.equals(syntax))
				emit_incDecStmt_HyphenMinusHyphenMinusKeyword_1_1_or_PlusSignPlusSignKeyword_1_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_literalValue_CommaKeyword_1_1_q.equals(syntax))
				emit_literalValue_CommaKeyword_1_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_parameterDecl_FullStopFullStopFullStopKeyword_1_q.equals(syntax))
				emit_parameterDecl_FullStopFullStopFullStopKeyword_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_parameters_CommaKeyword_1_1_q.equals(syntax))
				emit_parameters_CommaKeyword_1_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_sourceFile_EosParserRuleCall_1_q.equals(syntax))
				emit_sourceFile_EosParserRuleCall_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_sourceFile_EosParserRuleCall_2_1_q.equals(syntax))
				emit_sourceFile_EosParserRuleCall_2_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_unaryExpr_AmpersandKeyword_1_0_5_or_AsteriskKeyword_1_0_4_or_CircumflexAccentKeyword_1_0_3_or_ExclamationMarkKeyword_1_0_2_or_HyphenMinusKeyword_1_0_1_or_LessThanSignHyphenMinusKeyword_1_0_6_or_PlusSignKeyword_1_0_0.equals(syntax))
				emit_unaryExpr_AmpersandKeyword_1_0_5_or_AsteriskKeyword_1_0_4_or_CircumflexAccentKeyword_1_0_3_or_ExclamationMarkKeyword_1_0_2_or_HyphenMinusKeyword_1_0_1_or_LessThanSignHyphenMinusKeyword_1_0_6_or_PlusSignKeyword_1_0_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     '*'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) typeName=typeName
	 */
	protected void emit_anonymousField_AsteriskKeyword_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     expressionList=expressionList '...'? (ambiguity) ')' (rule end)
	 *     type=type '...'? (ambiguity) ')' (rule end)
	 */
	protected void emit_arguments_CommaKeyword_1_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '...'?
	 *
	 * This ambiguous syntax occurs at:
	 *     expressionList=expressionList (ambiguity) ','? ')' (rule end)
	 *     type=type (ambiguity) ','? ')' (rule end)
	 */
	protected void emit_arguments_FullStopFullStopFullStopKeyword_1_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'chan' | ('chan' '<-') | ('<-' 'chan')
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) elemType=elementType
	 */
	protected void emit_channelType_ChanKeyword_0_0_or___ChanKeyword_0_1_0_LessThanSignHyphenMinusKeyword_0_1_1___or___LessThanSignHyphenMinusKeyword_0_2_0_ChanKeyword_0_2_1__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     expression=expression (ambiguity) ')' (rule end)
	 */
	protected void emit_conversion_CommaKeyword_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     STRING_LIT?
	 *
	 * This ambiguous syntax occurs at:
	 *     anonymousField=anonymousField (ambiguity) (rule end)
	 *     type=type (ambiguity) (rule end)
	 */
	protected void emit_fieldDecl_STRING_LITTerminalRuleCall_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('.' | IDENTIFIER)?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) path=importPath
	 */
	protected void emit_importSpec___FullStopKeyword_0_0_or_IDENTIFIERTerminalRuleCall_0_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '++' | '--'
	 *
	 * This ambiguous syntax occurs at:
	 *     expr=expression (ambiguity) (rule end)
	 */
	protected void emit_incDecStmt_HyphenMinusHyphenMinusKeyword_1_1_or_PlusSignPlusSignKeyword_1_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     elementList=elementList (ambiguity) '}' (rule end)
	 */
	protected void emit_literalValue_CommaKeyword_1_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '...'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) type=type
	 *     identifierList=identifierList (ambiguity) type=type
	 */
	protected void emit_parameterDecl_FullStopFullStopFullStopKeyword_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ','?
	 *
	 * This ambiguous syntax occurs at:
	 *     paramList+=parameterList (ambiguity) ')' (rule end)
	 */
	protected void emit_parameters_CommaKeyword_1_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     eos?
	 *
	 * This ambiguous syntax occurs at:
	 *     package=packageClause (ambiguity) (rule end)
	 *     package=packageClause (ambiguity) imports+=importDecl
	 *     package=packageClause (ambiguity) topLevelDecls+=topLevelDecl
	 */
	protected void emit_sourceFile_EosParserRuleCall_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     eos?
	 *
	 * This ambiguous syntax occurs at:
	 *     imports+=importDecl (ambiguity) (rule end)
	 *     imports+=importDecl (ambiguity) imports+=importDecl
	 *     imports+=importDecl (ambiguity) topLevelDecls+=topLevelDecl
	 */
	protected void emit_sourceFile_EosParserRuleCall_2_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (
	  *         '+' | 
	  *         '-' | 
	  *         '!' | 
	  *         '^' | 
	  *         '*' | 
	  *         '&' | 
	  *         '<-'
	  *     )
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) unaryExpr=unaryExpr
	 */
	protected void emit_unaryExpr_AmpersandKeyword_1_0_5_or_AsteriskKeyword_1_0_4_or_CircumflexAccentKeyword_1_0_3_or_ExclamationMarkKeyword_1_0_2_or_HyphenMinusKeyword_1_0_1_or_LessThanSignHyphenMinusKeyword_1_0_6_or_PlusSignKeyword_1_0_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
