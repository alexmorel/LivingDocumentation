/*
* generated by Xtext
*/

package fr.obeo.intent.specification.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class SpecificationGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class SpecificationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Specification");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSpecificationKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cRolesKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cRolesAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cRolesRoleParserRuleCall_2_1_0 = (RuleCall)cRolesAssignment_2_1.eContents().get(0);
		private final Group cGroup_2_2 = (Group)cGroup_2.eContents().get(2);
		private final Keyword cCommaKeyword_2_2_0 = (Keyword)cGroup_2_2.eContents().get(0);
		private final Assignment cRolesAssignment_2_2_1 = (Assignment)cGroup_2_2.eContents().get(1);
		private final RuleCall cRolesRoleParserRuleCall_2_2_1_0 = (RuleCall)cRolesAssignment_2_2_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_2_3 = (Keyword)cGroup_2.eContents().get(3);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cCapabilitiesKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cCapabilitiesAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cCapabilitiesCapabilityParserRuleCall_3_1_0 = (RuleCall)cCapabilitiesAssignment_3_1.eContents().get(0);
		private final Group cGroup_3_2 = (Group)cGroup_3.eContents().get(2);
		private final Keyword cCommaKeyword_3_2_0 = (Keyword)cGroup_3_2.eContents().get(0);
		private final Assignment cCapabilitiesAssignment_3_2_1 = (Assignment)cGroup_3_2.eContents().get(1);
		private final RuleCall cCapabilitiesCapabilityParserRuleCall_3_2_1_0 = (RuleCall)cCapabilitiesAssignment_3_2_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_3_3 = (Keyword)cGroup_3.eContents().get(3);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cBenefitsKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cBenefitsAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cBenefitsBenefitParserRuleCall_4_1_0 = (RuleCall)cBenefitsAssignment_4_1.eContents().get(0);
		private final Group cGroup_4_2 = (Group)cGroup_4.eContents().get(2);
		private final Keyword cCommaKeyword_4_2_0 = (Keyword)cGroup_4_2.eContents().get(0);
		private final Assignment cCapabilitiesAssignment_4_2_1 = (Assignment)cGroup_4_2.eContents().get(1);
		private final RuleCall cCapabilitiesCapabilityParserRuleCall_4_2_1_0 = (RuleCall)cCapabilitiesAssignment_4_2_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_4_3 = (Keyword)cGroup_4.eContents().get(3);
		private final Assignment cAutomationLayerAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cAutomationLayerAutomationLayerParserRuleCall_5_0 = (RuleCall)cAutomationLayerAssignment_5.eContents().get(0);
		private final Assignment cFeaturesAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cFeaturesFeatureParserRuleCall_6_0 = (RuleCall)cFeaturesAssignment_6.eContents().get(0);
		private final Assignment cStoriesAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cStoriesStoryParserRuleCall_7_0 = (RuleCall)cStoriesAssignment_7.eContents().get(0);
		
		//Specification:
		//	"Specification:" name=ID ("Roles (" roles+=Role ("," roles+=Role)* ")")? ("Capabilities (" capabilities+=Capability
		//	("," capabilities+=Capability)* ")")? ("Benefits (" benefits+=Benefit ("," capabilities+=Capability)* ")")?
		//	automationLayer=AutomationLayer? features+=Feature* stories+=Story*;
		public ParserRule getRule() { return rule; }

		//"Specification:" name=ID ("Roles (" roles+=Role ("," roles+=Role)* ")")? ("Capabilities (" capabilities+=Capability (","
		//capabilities+=Capability)* ")")? ("Benefits (" benefits+=Benefit ("," capabilities+=Capability)* ")")?
		//automationLayer=AutomationLayer? features+=Feature* stories+=Story*
		public Group getGroup() { return cGroup; }

		//"Specification:"
		public Keyword getSpecificationKeyword_0() { return cSpecificationKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//("Roles (" roles+=Role ("," roles+=Role)* ")")?
		public Group getGroup_2() { return cGroup_2; }

		//"Roles ("
		public Keyword getRolesKeyword_2_0() { return cRolesKeyword_2_0; }

		//roles+=Role
		public Assignment getRolesAssignment_2_1() { return cRolesAssignment_2_1; }

		//Role
		public RuleCall getRolesRoleParserRuleCall_2_1_0() { return cRolesRoleParserRuleCall_2_1_0; }

		//("," roles+=Role)*
		public Group getGroup_2_2() { return cGroup_2_2; }

		//","
		public Keyword getCommaKeyword_2_2_0() { return cCommaKeyword_2_2_0; }

		//roles+=Role
		public Assignment getRolesAssignment_2_2_1() { return cRolesAssignment_2_2_1; }

		//Role
		public RuleCall getRolesRoleParserRuleCall_2_2_1_0() { return cRolesRoleParserRuleCall_2_2_1_0; }

		//")"
		public Keyword getRightParenthesisKeyword_2_3() { return cRightParenthesisKeyword_2_3; }

		//("Capabilities (" capabilities+=Capability ("," capabilities+=Capability)* ")")?
		public Group getGroup_3() { return cGroup_3; }

		//"Capabilities ("
		public Keyword getCapabilitiesKeyword_3_0() { return cCapabilitiesKeyword_3_0; }

		//capabilities+=Capability
		public Assignment getCapabilitiesAssignment_3_1() { return cCapabilitiesAssignment_3_1; }

		//Capability
		public RuleCall getCapabilitiesCapabilityParserRuleCall_3_1_0() { return cCapabilitiesCapabilityParserRuleCall_3_1_0; }

		//("," capabilities+=Capability)*
		public Group getGroup_3_2() { return cGroup_3_2; }

		//","
		public Keyword getCommaKeyword_3_2_0() { return cCommaKeyword_3_2_0; }

		//capabilities+=Capability
		public Assignment getCapabilitiesAssignment_3_2_1() { return cCapabilitiesAssignment_3_2_1; }

		//Capability
		public RuleCall getCapabilitiesCapabilityParserRuleCall_3_2_1_0() { return cCapabilitiesCapabilityParserRuleCall_3_2_1_0; }

		//")"
		public Keyword getRightParenthesisKeyword_3_3() { return cRightParenthesisKeyword_3_3; }

		//("Benefits (" benefits+=Benefit ("," capabilities+=Capability)* ")")?
		public Group getGroup_4() { return cGroup_4; }

		//"Benefits ("
		public Keyword getBenefitsKeyword_4_0() { return cBenefitsKeyword_4_0; }

		//benefits+=Benefit
		public Assignment getBenefitsAssignment_4_1() { return cBenefitsAssignment_4_1; }

		//Benefit
		public RuleCall getBenefitsBenefitParserRuleCall_4_1_0() { return cBenefitsBenefitParserRuleCall_4_1_0; }

		//("," capabilities+=Capability)*
		public Group getGroup_4_2() { return cGroup_4_2; }

		//","
		public Keyword getCommaKeyword_4_2_0() { return cCommaKeyword_4_2_0; }

		//capabilities+=Capability
		public Assignment getCapabilitiesAssignment_4_2_1() { return cCapabilitiesAssignment_4_2_1; }

		//Capability
		public RuleCall getCapabilitiesCapabilityParserRuleCall_4_2_1_0() { return cCapabilitiesCapabilityParserRuleCall_4_2_1_0; }

		//")"
		public Keyword getRightParenthesisKeyword_4_3() { return cRightParenthesisKeyword_4_3; }

		//automationLayer=AutomationLayer?
		public Assignment getAutomationLayerAssignment_5() { return cAutomationLayerAssignment_5; }

		//AutomationLayer
		public RuleCall getAutomationLayerAutomationLayerParserRuleCall_5_0() { return cAutomationLayerAutomationLayerParserRuleCall_5_0; }

		//features+=Feature*
		public Assignment getFeaturesAssignment_6() { return cFeaturesAssignment_6; }

		//Feature
		public RuleCall getFeaturesFeatureParserRuleCall_6_0() { return cFeaturesFeatureParserRuleCall_6_0; }

		//stories+=Story*
		public Assignment getStoriesAssignment_7() { return cStoriesAssignment_7; }

		//Story
		public RuleCall getStoriesStoryParserRuleCall_7_0() { return cStoriesStoryParserRuleCall_7_0; }
	}

	public class AutomationLayerElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "AutomationLayer");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cContextsKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cContextAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cContextContextParserRuleCall_1_0 = (RuleCall)cContextAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cCommaKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cContextAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cContextContextParserRuleCall_2_1_0 = (RuleCall)cContextAssignment_2_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cActionsKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cActionsAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cActionsActionParserRuleCall_5_0 = (RuleCall)cActionsAssignment_5.eContents().get(0);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cCommaKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Assignment cActionsAssignment_6_1 = (Assignment)cGroup_6.eContents().get(1);
		private final RuleCall cActionsActionParserRuleCall_6_1_0 = (RuleCall)cActionsAssignment_6_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Keyword cBehaviorsKeyword_8 = (Keyword)cGroup.eContents().get(8);
		private final Assignment cBehavioursAssignment_9 = (Assignment)cGroup.eContents().get(9);
		private final RuleCall cBehavioursBehaviourParserRuleCall_9_0 = (RuleCall)cBehavioursAssignment_9.eContents().get(0);
		private final Group cGroup_10 = (Group)cGroup.eContents().get(10);
		private final Keyword cCommaKeyword_10_0 = (Keyword)cGroup_10.eContents().get(0);
		private final Assignment cBehavioursAssignment_10_1 = (Assignment)cGroup_10.eContents().get(1);
		private final RuleCall cBehavioursBehaviourParserRuleCall_10_1_0 = (RuleCall)cBehavioursAssignment_10_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_11 = (Keyword)cGroup.eContents().get(11);
		
		//AutomationLayer:
		//	"Contexts (" context+=Context ("," context+=Context)* ")" "Actions (" actions+=Action ("," actions+=Action)* ")"
		//	"Behaviors (" behaviours+=Behaviour ("," behaviours+=Behaviour)* ")";
		public ParserRule getRule() { return rule; }

		//"Contexts (" context+=Context ("," context+=Context)* ")" "Actions (" actions+=Action ("," actions+=Action)* ")"
		//"Behaviors (" behaviours+=Behaviour ("," behaviours+=Behaviour)* ")"
		public Group getGroup() { return cGroup; }

		//"Contexts ("
		public Keyword getContextsKeyword_0() { return cContextsKeyword_0; }

		//context+=Context
		public Assignment getContextAssignment_1() { return cContextAssignment_1; }

		//Context
		public RuleCall getContextContextParserRuleCall_1_0() { return cContextContextParserRuleCall_1_0; }

		//("," context+=Context)*
		public Group getGroup_2() { return cGroup_2; }

		//","
		public Keyword getCommaKeyword_2_0() { return cCommaKeyword_2_0; }

		//context+=Context
		public Assignment getContextAssignment_2_1() { return cContextAssignment_2_1; }

		//Context
		public RuleCall getContextContextParserRuleCall_2_1_0() { return cContextContextParserRuleCall_2_1_0; }

		//")"
		public Keyword getRightParenthesisKeyword_3() { return cRightParenthesisKeyword_3; }

		//"Actions ("
		public Keyword getActionsKeyword_4() { return cActionsKeyword_4; }

		//actions+=Action
		public Assignment getActionsAssignment_5() { return cActionsAssignment_5; }

		//Action
		public RuleCall getActionsActionParserRuleCall_5_0() { return cActionsActionParserRuleCall_5_0; }

		//("," actions+=Action)*
		public Group getGroup_6() { return cGroup_6; }

		//","
		public Keyword getCommaKeyword_6_0() { return cCommaKeyword_6_0; }

		//actions+=Action
		public Assignment getActionsAssignment_6_1() { return cActionsAssignment_6_1; }

		//Action
		public RuleCall getActionsActionParserRuleCall_6_1_0() { return cActionsActionParserRuleCall_6_1_0; }

		//")"
		public Keyword getRightParenthesisKeyword_7() { return cRightParenthesisKeyword_7; }

		//"Behaviors ("
		public Keyword getBehaviorsKeyword_8() { return cBehaviorsKeyword_8; }

		//behaviours+=Behaviour
		public Assignment getBehavioursAssignment_9() { return cBehavioursAssignment_9; }

		//Behaviour
		public RuleCall getBehavioursBehaviourParserRuleCall_9_0() { return cBehavioursBehaviourParserRuleCall_9_0; }

		//("," behaviours+=Behaviour)*
		public Group getGroup_10() { return cGroup_10; }

		//","
		public Keyword getCommaKeyword_10_0() { return cCommaKeyword_10_0; }

		//behaviours+=Behaviour
		public Assignment getBehavioursAssignment_10_1() { return cBehavioursAssignment_10_1; }

		//Behaviour
		public RuleCall getBehavioursBehaviourParserRuleCall_10_1_0() { return cBehavioursBehaviourParserRuleCall_10_1_0; }

		//")"
		public Keyword getRightParenthesisKeyword_11() { return cRightParenthesisKeyword_11; }
	}

	public class ContextElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Context");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_0 = (RuleCall)cNameAssignment.eContents().get(0);
		
		//Context:
		//	name=ID;
		public ParserRule getRule() { return rule; }

		//name=ID
		public Assignment getNameAssignment() { return cNameAssignment; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_0() { return cNameIDTerminalRuleCall_0; }
	}

	public class ActionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Action");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_0 = (RuleCall)cNameAssignment.eContents().get(0);
		
		//Action:
		//	name=ID;
		public ParserRule getRule() { return rule; }

		//name=ID
		public Assignment getNameAssignment() { return cNameAssignment; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_0() { return cNameIDTerminalRuleCall_0; }
	}

	public class BehaviourElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Behaviour");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_0 = (RuleCall)cNameAssignment.eContents().get(0);
		
		//Behaviour:
		//	name=ID;
		public ParserRule getRule() { return rule; }

		//name=ID
		public Assignment getNameAssignment() { return cNameAssignment; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_0() { return cNameIDTerminalRuleCall_0; }
	}

	public class FeatureElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Feature");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cFeatureKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cLinkedToKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cRefFeaturesAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final CrossReference cRefFeaturesFeatureCrossReference_2_1_0 = (CrossReference)cRefFeaturesAssignment_2_1.eContents().get(0);
		private final RuleCall cRefFeaturesFeatureIDTerminalRuleCall_2_1_0_1 = (RuleCall)cRefFeaturesFeatureCrossReference_2_1_0.eContents().get(1);
		private final Assignment cStoriesAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cStoriesStoryCrossReference_3_0 = (CrossReference)cStoriesAssignment_3.eContents().get(0);
		private final RuleCall cStoriesStoryIDTerminalRuleCall_3_0_1 = (RuleCall)cStoriesStoryCrossReference_3_0.eContents().get(1);
		
		//Feature:
		//	"Feature:" name=ID ("linked to " refFeatures+=[Feature]*)? stories+=[Story]*;
		public ParserRule getRule() { return rule; }

		//"Feature:" name=ID ("linked to " refFeatures+=[Feature]*)? stories+=[Story]*
		public Group getGroup() { return cGroup; }

		//"Feature:"
		public Keyword getFeatureKeyword_0() { return cFeatureKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//("linked to " refFeatures+=[Feature]*)?
		public Group getGroup_2() { return cGroup_2; }

		//"linked to "
		public Keyword getLinkedToKeyword_2_0() { return cLinkedToKeyword_2_0; }

		//refFeatures+=[Feature]*
		public Assignment getRefFeaturesAssignment_2_1() { return cRefFeaturesAssignment_2_1; }

		//[Feature]
		public CrossReference getRefFeaturesFeatureCrossReference_2_1_0() { return cRefFeaturesFeatureCrossReference_2_1_0; }

		//ID
		public RuleCall getRefFeaturesFeatureIDTerminalRuleCall_2_1_0_1() { return cRefFeaturesFeatureIDTerminalRuleCall_2_1_0_1; }

		//stories+=[Story]*
		public Assignment getStoriesAssignment_3() { return cStoriesAssignment_3; }

		//[Story]
		public CrossReference getStoriesStoryCrossReference_3_0() { return cStoriesStoryCrossReference_3_0; }

		//ID
		public RuleCall getStoriesStoryIDTerminalRuleCall_3_0_1() { return cStoriesStoryIDTerminalRuleCall_3_0_1; }
	}

	public class StoryElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Story");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cStoryKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cAsKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cAsAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final CrossReference cAsRoleCrossReference_2_1_0 = (CrossReference)cAsAssignment_2_1.eContents().get(0);
		private final RuleCall cAsRoleIDTerminalRuleCall_2_1_0_1 = (RuleCall)cAsRoleCrossReference_2_1_0.eContents().get(1);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cIWantKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cIWantAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final CrossReference cIWantCapabilityCrossReference_3_1_0 = (CrossReference)cIWantAssignment_3_1.eContents().get(0);
		private final RuleCall cIWantCapabilityIDTerminalRuleCall_3_1_0_1 = (RuleCall)cIWantCapabilityCrossReference_3_1_0.eContents().get(1);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cSoThatKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cSoThatAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final CrossReference cSoThatBenefitCrossReference_4_1_0 = (CrossReference)cSoThatAssignment_4_1.eContents().get(0);
		private final RuleCall cSoThatBenefitIDTerminalRuleCall_4_1_0_1 = (RuleCall)cSoThatBenefitCrossReference_4_1_0.eContents().get(1);
		private final Assignment cScenariosAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cScenariosScenarioParserRuleCall_5_0 = (RuleCall)cScenariosAssignment_5.eContents().get(0);
		
		//Story:
		//	"Story:" name=ID ("As " As=[Role])? ("I want " iWant=[Capability])? ("So that " soThat=[Benefit])?
		//	scenarios+=Scenario*;
		public ParserRule getRule() { return rule; }

		//"Story:" name=ID ("As " As=[Role])? ("I want " iWant=[Capability])? ("So that " soThat=[Benefit])? scenarios+=Scenario*
		public Group getGroup() { return cGroup; }

		//"Story:"
		public Keyword getStoryKeyword_0() { return cStoryKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//("As " As=[Role])?
		public Group getGroup_2() { return cGroup_2; }

		//"As "
		public Keyword getAsKeyword_2_0() { return cAsKeyword_2_0; }

		//As=[Role]
		public Assignment getAsAssignment_2_1() { return cAsAssignment_2_1; }

		//[Role]
		public CrossReference getAsRoleCrossReference_2_1_0() { return cAsRoleCrossReference_2_1_0; }

		//ID
		public RuleCall getAsRoleIDTerminalRuleCall_2_1_0_1() { return cAsRoleIDTerminalRuleCall_2_1_0_1; }

		//("I want " iWant=[Capability])?
		public Group getGroup_3() { return cGroup_3; }

		//"I want "
		public Keyword getIWantKeyword_3_0() { return cIWantKeyword_3_0; }

		//iWant=[Capability]
		public Assignment getIWantAssignment_3_1() { return cIWantAssignment_3_1; }

		//[Capability]
		public CrossReference getIWantCapabilityCrossReference_3_1_0() { return cIWantCapabilityCrossReference_3_1_0; }

		//ID
		public RuleCall getIWantCapabilityIDTerminalRuleCall_3_1_0_1() { return cIWantCapabilityIDTerminalRuleCall_3_1_0_1; }

		//("So that " soThat=[Benefit])?
		public Group getGroup_4() { return cGroup_4; }

		//"So that "
		public Keyword getSoThatKeyword_4_0() { return cSoThatKeyword_4_0; }

		//soThat=[Benefit]
		public Assignment getSoThatAssignment_4_1() { return cSoThatAssignment_4_1; }

		//[Benefit]
		public CrossReference getSoThatBenefitCrossReference_4_1_0() { return cSoThatBenefitCrossReference_4_1_0; }

		//ID
		public RuleCall getSoThatBenefitIDTerminalRuleCall_4_1_0_1() { return cSoThatBenefitIDTerminalRuleCall_4_1_0_1; }

		//scenarios+=Scenario*
		public Assignment getScenariosAssignment_5() { return cScenariosAssignment_5; }

		//Scenario
		public RuleCall getScenariosScenarioParserRuleCall_5_0() { return cScenariosScenarioParserRuleCall_5_0; }
	}

	public class ScenarioElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Scenario");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cScenarioKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cGivenKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cGivenAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final CrossReference cGivenContextCrossReference_2_1_0 = (CrossReference)cGivenAssignment_2_1.eContents().get(0);
		private final RuleCall cGivenContextIDTerminalRuleCall_2_1_0_1 = (RuleCall)cGivenContextCrossReference_2_1_0.eContents().get(1);
		private final Group cGroup_2_2 = (Group)cGroup_2.eContents().get(2);
		private final Keyword cCommaKeyword_2_2_0 = (Keyword)cGroup_2_2.eContents().get(0);
		private final Assignment cGivenAssignment_2_2_1 = (Assignment)cGroup_2_2.eContents().get(1);
		private final CrossReference cGivenContextCrossReference_2_2_1_0 = (CrossReference)cGivenAssignment_2_2_1.eContents().get(0);
		private final RuleCall cGivenContextIDTerminalRuleCall_2_2_1_0_1 = (RuleCall)cGivenContextCrossReference_2_2_1_0.eContents().get(1);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cWhenKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cWhenAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final CrossReference cWhenActionCrossReference_3_1_0 = (CrossReference)cWhenAssignment_3_1.eContents().get(0);
		private final RuleCall cWhenActionIDTerminalRuleCall_3_1_0_1 = (RuleCall)cWhenActionCrossReference_3_1_0.eContents().get(1);
		private final Group cGroup_3_2 = (Group)cGroup_3.eContents().get(2);
		private final Keyword cCommaKeyword_3_2_0 = (Keyword)cGroup_3_2.eContents().get(0);
		private final Assignment cWhenAssignment_3_2_1 = (Assignment)cGroup_3_2.eContents().get(1);
		private final CrossReference cWhenActionCrossReference_3_2_1_0 = (CrossReference)cWhenAssignment_3_2_1.eContents().get(0);
		private final RuleCall cWhenActionIDTerminalRuleCall_3_2_1_0_1 = (RuleCall)cWhenActionCrossReference_3_2_1_0.eContents().get(1);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cThenKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cThenAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final CrossReference cThenBehaviourCrossReference_4_1_0 = (CrossReference)cThenAssignment_4_1.eContents().get(0);
		private final RuleCall cThenBehaviourIDTerminalRuleCall_4_1_0_1 = (RuleCall)cThenBehaviourCrossReference_4_1_0.eContents().get(1);
		private final Group cGroup_4_2 = (Group)cGroup_4.eContents().get(2);
		private final Keyword cCommaKeyword_4_2_0 = (Keyword)cGroup_4_2.eContents().get(0);
		private final Assignment cThenAssignment_4_2_1 = (Assignment)cGroup_4_2.eContents().get(1);
		private final CrossReference cThenBehaviourCrossReference_4_2_1_0 = (CrossReference)cThenAssignment_4_2_1.eContents().get(0);
		private final RuleCall cThenBehaviourIDTerminalRuleCall_4_2_1_0_1 = (RuleCall)cThenBehaviourCrossReference_4_2_1_0.eContents().get(1);
		
		//Scenario:
		//	"Scenario:" name=ID ("Given " given+=[Context] ("," given+=[Context])*)? ("When " when+=[Action] (","
		//	when+=[Action])*)? ("Then " then+=[Behaviour] ("," then+=[Behaviour])*)?;
		public ParserRule getRule() { return rule; }

		//"Scenario:" name=ID ("Given " given+=[Context] ("," given+=[Context])*)? ("When " when+=[Action] ("," when+=[Action])*)?
		//("Then " then+=[Behaviour] ("," then+=[Behaviour])*)?
		public Group getGroup() { return cGroup; }

		//"Scenario:"
		public Keyword getScenarioKeyword_0() { return cScenarioKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//("Given " given+=[Context] ("," given+=[Context])*)?
		public Group getGroup_2() { return cGroup_2; }

		//"Given "
		public Keyword getGivenKeyword_2_0() { return cGivenKeyword_2_0; }

		//given+=[Context]
		public Assignment getGivenAssignment_2_1() { return cGivenAssignment_2_1; }

		//[Context]
		public CrossReference getGivenContextCrossReference_2_1_0() { return cGivenContextCrossReference_2_1_0; }

		//ID
		public RuleCall getGivenContextIDTerminalRuleCall_2_1_0_1() { return cGivenContextIDTerminalRuleCall_2_1_0_1; }

		//("," given+=[Context])*
		public Group getGroup_2_2() { return cGroup_2_2; }

		//","
		public Keyword getCommaKeyword_2_2_0() { return cCommaKeyword_2_2_0; }

		//given+=[Context]
		public Assignment getGivenAssignment_2_2_1() { return cGivenAssignment_2_2_1; }

		//[Context]
		public CrossReference getGivenContextCrossReference_2_2_1_0() { return cGivenContextCrossReference_2_2_1_0; }

		//ID
		public RuleCall getGivenContextIDTerminalRuleCall_2_2_1_0_1() { return cGivenContextIDTerminalRuleCall_2_2_1_0_1; }

		//("When " when+=[Action] ("," when+=[Action])*)?
		public Group getGroup_3() { return cGroup_3; }

		//"When "
		public Keyword getWhenKeyword_3_0() { return cWhenKeyword_3_0; }

		//when+=[Action]
		public Assignment getWhenAssignment_3_1() { return cWhenAssignment_3_1; }

		//[Action]
		public CrossReference getWhenActionCrossReference_3_1_0() { return cWhenActionCrossReference_3_1_0; }

		//ID
		public RuleCall getWhenActionIDTerminalRuleCall_3_1_0_1() { return cWhenActionIDTerminalRuleCall_3_1_0_1; }

		//("," when+=[Action])*
		public Group getGroup_3_2() { return cGroup_3_2; }

		//","
		public Keyword getCommaKeyword_3_2_0() { return cCommaKeyword_3_2_0; }

		//when+=[Action]
		public Assignment getWhenAssignment_3_2_1() { return cWhenAssignment_3_2_1; }

		//[Action]
		public CrossReference getWhenActionCrossReference_3_2_1_0() { return cWhenActionCrossReference_3_2_1_0; }

		//ID
		public RuleCall getWhenActionIDTerminalRuleCall_3_2_1_0_1() { return cWhenActionIDTerminalRuleCall_3_2_1_0_1; }

		//("Then " then+=[Behaviour] ("," then+=[Behaviour])*)?
		public Group getGroup_4() { return cGroup_4; }

		//"Then "
		public Keyword getThenKeyword_4_0() { return cThenKeyword_4_0; }

		//then+=[Behaviour]
		public Assignment getThenAssignment_4_1() { return cThenAssignment_4_1; }

		//[Behaviour]
		public CrossReference getThenBehaviourCrossReference_4_1_0() { return cThenBehaviourCrossReference_4_1_0; }

		//ID
		public RuleCall getThenBehaviourIDTerminalRuleCall_4_1_0_1() { return cThenBehaviourIDTerminalRuleCall_4_1_0_1; }

		//("," then+=[Behaviour])*
		public Group getGroup_4_2() { return cGroup_4_2; }

		//","
		public Keyword getCommaKeyword_4_2_0() { return cCommaKeyword_4_2_0; }

		//then+=[Behaviour]
		public Assignment getThenAssignment_4_2_1() { return cThenAssignment_4_2_1; }

		//[Behaviour]
		public CrossReference getThenBehaviourCrossReference_4_2_1_0() { return cThenBehaviourCrossReference_4_2_1_0; }

		//ID
		public RuleCall getThenBehaviourIDTerminalRuleCall_4_2_1_0_1() { return cThenBehaviourIDTerminalRuleCall_4_2_1_0_1; }
	}

	public class RoleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Role");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_0 = (RuleCall)cNameAssignment.eContents().get(0);
		
		//Role:
		//	name=ID;
		public ParserRule getRule() { return rule; }

		//name=ID
		public Assignment getNameAssignment() { return cNameAssignment; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_0() { return cNameIDTerminalRuleCall_0; }
	}

	public class CapabilityElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Capability");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_0 = (RuleCall)cNameAssignment.eContents().get(0);
		
		//Capability:
		//	name=ID;
		public ParserRule getRule() { return rule; }

		//name=ID
		public Assignment getNameAssignment() { return cNameAssignment; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_0() { return cNameIDTerminalRuleCall_0; }
	}

	public class BenefitElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Benefit");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_0 = (RuleCall)cNameAssignment.eContents().get(0);
		
		//Benefit:
		//	name=ID;
		public ParserRule getRule() { return rule; }

		//name=ID
		public Assignment getNameAssignment() { return cNameAssignment; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_0() { return cNameIDTerminalRuleCall_0; }
	}
	
	
	private SpecificationElements pSpecification;
	private AutomationLayerElements pAutomationLayer;
	private ContextElements pContext;
	private ActionElements pAction;
	private BehaviourElements pBehaviour;
	private FeatureElements pFeature;
	private StoryElements pStory;
	private ScenarioElements pScenario;
	private RoleElements pRole;
	private CapabilityElements pCapability;
	private BenefitElements pBenefit;
	
	private final Grammar grammar;

	private TerminalsGrammarAccess gaTerminals;

	@Inject
	public SpecificationGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("fr.obeo.intent.specification.Specification".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Specification:
	//	"Specification:" name=ID ("Roles (" roles+=Role ("," roles+=Role)* ")")? ("Capabilities (" capabilities+=Capability
	//	("," capabilities+=Capability)* ")")? ("Benefits (" benefits+=Benefit ("," capabilities+=Capability)* ")")?
	//	automationLayer=AutomationLayer? features+=Feature* stories+=Story*;
	public SpecificationElements getSpecificationAccess() {
		return (pSpecification != null) ? pSpecification : (pSpecification = new SpecificationElements());
	}
	
	public ParserRule getSpecificationRule() {
		return getSpecificationAccess().getRule();
	}

	//AutomationLayer:
	//	"Contexts (" context+=Context ("," context+=Context)* ")" "Actions (" actions+=Action ("," actions+=Action)* ")"
	//	"Behaviors (" behaviours+=Behaviour ("," behaviours+=Behaviour)* ")";
	public AutomationLayerElements getAutomationLayerAccess() {
		return (pAutomationLayer != null) ? pAutomationLayer : (pAutomationLayer = new AutomationLayerElements());
	}
	
	public ParserRule getAutomationLayerRule() {
		return getAutomationLayerAccess().getRule();
	}

	//Context:
	//	name=ID;
	public ContextElements getContextAccess() {
		return (pContext != null) ? pContext : (pContext = new ContextElements());
	}
	
	public ParserRule getContextRule() {
		return getContextAccess().getRule();
	}

	//Action:
	//	name=ID;
	public ActionElements getActionAccess() {
		return (pAction != null) ? pAction : (pAction = new ActionElements());
	}
	
	public ParserRule getActionRule() {
		return getActionAccess().getRule();
	}

	//Behaviour:
	//	name=ID;
	public BehaviourElements getBehaviourAccess() {
		return (pBehaviour != null) ? pBehaviour : (pBehaviour = new BehaviourElements());
	}
	
	public ParserRule getBehaviourRule() {
		return getBehaviourAccess().getRule();
	}

	//Feature:
	//	"Feature:" name=ID ("linked to " refFeatures+=[Feature]*)? stories+=[Story]*;
	public FeatureElements getFeatureAccess() {
		return (pFeature != null) ? pFeature : (pFeature = new FeatureElements());
	}
	
	public ParserRule getFeatureRule() {
		return getFeatureAccess().getRule();
	}

	//Story:
	//	"Story:" name=ID ("As " As=[Role])? ("I want " iWant=[Capability])? ("So that " soThat=[Benefit])?
	//	scenarios+=Scenario*;
	public StoryElements getStoryAccess() {
		return (pStory != null) ? pStory : (pStory = new StoryElements());
	}
	
	public ParserRule getStoryRule() {
		return getStoryAccess().getRule();
	}

	//Scenario:
	//	"Scenario:" name=ID ("Given " given+=[Context] ("," given+=[Context])*)? ("When " when+=[Action] (","
	//	when+=[Action])*)? ("Then " then+=[Behaviour] ("," then+=[Behaviour])*)?;
	public ScenarioElements getScenarioAccess() {
		return (pScenario != null) ? pScenario : (pScenario = new ScenarioElements());
	}
	
	public ParserRule getScenarioRule() {
		return getScenarioAccess().getRule();
	}

	//Role:
	//	name=ID;
	public RoleElements getRoleAccess() {
		return (pRole != null) ? pRole : (pRole = new RoleElements());
	}
	
	public ParserRule getRoleRule() {
		return getRoleAccess().getRule();
	}

	//Capability:
	//	name=ID;
	public CapabilityElements getCapabilityAccess() {
		return (pCapability != null) ? pCapability : (pCapability = new CapabilityElements());
	}
	
	public ParserRule getCapabilityRule() {
		return getCapabilityAccess().getRule();
	}

	//Benefit:
	//	name=ID;
	public BenefitElements getBenefitAccess() {
		return (pBenefit != null) ? pBenefit : (pBenefit = new BenefitElements());
	}
	
	public ParserRule getBenefitRule() {
		return getBenefitAccess().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" ("b" | "t" | "n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\""))* "\"" | "\'" ("\\" ("b" | "t" |
	//	"n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}