/*
 * generated by Xtext 2.12.0
 */
package com.minres.rdl.serializer;

import com.google.inject.Inject;
import com.minres.rdl.services.RDLGrammarAccess;
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

@SuppressWarnings("all")
public class RDLSyntacticSequencer extends AbstractSyntacticSequencer {

	protected RDLGrammarAccess grammarAccess;
	protected AbstractElementAlias match_DefaultProperyAssignment_DefaultKeyword_0_q;
	protected AbstractElementAlias match_EnumEntry___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (RDLGrammarAccess) access;
		match_DefaultProperyAssignment_DefaultKeyword_0_q = new TokenAlias(false, true, grammarAccess.getDefaultProperyAssignmentAccess().getDefaultKeyword_0());
		match_EnumEntry___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getEnumEntryAccess().getLeftCurlyBracketKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getEnumEntryAccess().getRightCurlyBracketKeyword_3_2()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_DefaultProperyAssignment_DefaultKeyword_0_q.equals(syntax))
				emit_DefaultProperyAssignment_DefaultKeyword_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_EnumEntry___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q.equals(syntax))
				emit_EnumEntry___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     'default'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) modifier=PropertyModifier
	 *     (rule start) (ambiguity) name=Property
	 */
	protected void emit_DefaultProperyAssignment_DefaultKeyword_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('{' '}')?
	 *
	 * This ambiguous syntax occurs at:
	 *     index=NUM (ambiguity) ';' (rule end)
	 */
	protected void emit_EnumEntry___LeftCurlyBracketKeyword_3_0_RightCurlyBracketKeyword_3_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
