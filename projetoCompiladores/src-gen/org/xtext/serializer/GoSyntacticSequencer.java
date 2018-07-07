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
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.services.GoGrammarAccess;

@SuppressWarnings("all")
public class GoSyntacticSequencer extends AbstractSyntacticSequencer {

	protected GoGrammarAccess grammarAccess;
	protected AbstractElementAlias match_sourceFile___ImportDeclParserRuleCall_1_0_SemicolonKeyword_1_1__a;
	protected AbstractElementAlias match_sourceFile___TopLevelDeclParserRuleCall_2_0_SemicolonKeyword_2_1__a;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (GoGrammarAccess) access;
		match_sourceFile___ImportDeclParserRuleCall_1_0_SemicolonKeyword_1_1__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getSourceFileAccess().getImportDeclParserRuleCall_1_0()), new TokenAlias(false, false, grammarAccess.getSourceFileAccess().getSemicolonKeyword_1_1()));
		match_sourceFile___TopLevelDeclParserRuleCall_2_0_SemicolonKeyword_2_1__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getSourceFileAccess().getTopLevelDeclParserRuleCall_2_0()), new TokenAlias(false, false, grammarAccess.getSourceFileAccess().getSemicolonKeyword_2_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getImportDeclRule())
			return getimportDeclToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getTopLevelDeclRule())
			return gettopLevelDeclToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * importDecl: 
	 * 	'import' ( importSpec | '(' ( importSpec 	 )* ')' );
	 */
	protected String getimportDeclToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "import\'\'";
	}
	
	/**
	 * topLevelDecl: 
	 * 	declaration
	 *     | functionDecl
	 *     | methodDecl;
	 */
	protected String gettopLevelDeclToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "const";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_sourceFile___ImportDeclParserRuleCall_1_0_SemicolonKeyword_1_1__a.equals(syntax))
				emit_sourceFile___ImportDeclParserRuleCall_1_0_SemicolonKeyword_1_1__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_sourceFile___TopLevelDeclParserRuleCall_2_0_SemicolonKeyword_2_1__a.equals(syntax))
				emit_sourceFile___TopLevelDeclParserRuleCall_2_0_SemicolonKeyword_2_1__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     (importDecl ';')*
	 *
	 * This ambiguous syntax occurs at:
	 *     packageClause=packageClause (ambiguity) (topLevelDecl ';')* (rule end)
	 */
	protected void emit_sourceFile___ImportDeclParserRuleCall_1_0_SemicolonKeyword_1_1__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (topLevelDecl ';')*
	 *
	 * This ambiguous syntax occurs at:
	 *     packageClause=packageClause (importDecl ';')* (ambiguity) (rule end)
	 */
	protected void emit_sourceFile___TopLevelDeclParserRuleCall_2_0_SemicolonKeyword_2_1__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
