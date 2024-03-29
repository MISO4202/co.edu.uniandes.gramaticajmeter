/*
 * generated by Xtext 2.9.1
 */
package co.edu.uniandes.ide.contentassist.antlr;

import co.edu.uniandes.ide.contentassist.antlr.internal.InternalGramaticajmeterParser;
import co.edu.uniandes.services.GramaticajmeterGrammarAccess;
import com.google.inject.Inject;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

public class GramaticajmeterParser extends AbstractContentAssistParser {

	@Inject
	private GramaticajmeterGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalGramaticajmeterParser createParser() {
		InternalGramaticajmeterParser result = new InternalGramaticajmeterParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getColumnHeaderAccess().getAlternatives(), "rule__ColumnHeader__Alternatives");
					put(grammarAccess.getColumnHeaderJMeterAccess().getAlternatives(), "rule__ColumnHeaderJMeter__Alternatives");
					put(grammarAccess.getJMeterAccess().getGroup(), "rule__JMeter__Group__0");
					put(grammarAccess.getJMeterAccess().getGroup_1(), "rule__JMeter__Group_1__0");
					put(grammarAccess.getArchitectureResultsAccess().getGroup(), "rule__ArchitectureResults__Group__0");
					put(grammarAccess.getArchitectureResultsAccess().getGroup_6(), "rule__ArchitectureResults__Group_6__0");
					put(grammarAccess.getArchitectureResultsAccess().getGroup_11(), "rule__ArchitectureResults__Group_11__0");
					put(grammarAccess.getHeaderAccess().getGroup(), "rule__Header__Group__0");
					put(grammarAccess.getHeaderAccess().getGroup_1(), "rule__Header__Group_1__0");
					put(grammarAccess.getResultsAccess().getGroup(), "rule__Results__Group__0");
					put(grammarAccess.getResultsAccess().getGroup_1(), "rule__Results__Group_1__0");
					put(grammarAccess.getHeaderJMeterAccess().getGroup(), "rule__HeaderJMeter__Group__0");
					put(grammarAccess.getHeaderJMeterAccess().getGroup_1(), "rule__HeaderJMeter__Group_1__0");
					put(grammarAccess.getJMeterAccess().getArchitectureResultsAssignment_0(), "rule__JMeter__ArchitectureResultsAssignment_0");
					put(grammarAccess.getJMeterAccess().getArchitectureResultsAssignment_1_1(), "rule__JMeter__ArchitectureResultsAssignment_1_1");
					put(grammarAccess.getArchitectureResultsAccess().getArchitectureAssignment_1(), "rule__ArchitectureResults__ArchitectureAssignment_1");
					put(grammarAccess.getArchitectureResultsAccess().getHeaderAssignment_3(), "rule__ArchitectureResults__HeaderAssignment_3");
					put(grammarAccess.getArchitectureResultsAccess().getResultsAssignment_5(), "rule__ArchitectureResults__ResultsAssignment_5");
					put(grammarAccess.getArchitectureResultsAccess().getResultsAssignment_6_1(), "rule__ArchitectureResults__ResultsAssignment_6_1");
					put(grammarAccess.getArchitectureResultsAccess().getHeaderJMeterAssignment_8(), "rule__ArchitectureResults__HeaderJMeterAssignment_8");
					put(grammarAccess.getArchitectureResultsAccess().getResultsJMeterAssignment_10(), "rule__ArchitectureResults__ResultsJMeterAssignment_10");
					put(grammarAccess.getArchitectureResultsAccess().getResultsJMeterAssignment_11_1(), "rule__ArchitectureResults__ResultsJMeterAssignment_11_1");
					put(grammarAccess.getHeaderAccess().getHeaderAssignment_0(), "rule__Header__HeaderAssignment_0");
					put(grammarAccess.getHeaderAccess().getHeaderAssignment_1_1(), "rule__Header__HeaderAssignment_1_1");
					put(grammarAccess.getResultsAccess().getResultAssignment_0(), "rule__Results__ResultAssignment_0");
					put(grammarAccess.getResultsAccess().getResultAssignment_1_1(), "rule__Results__ResultAssignment_1_1");
					put(grammarAccess.getResultAccess().getValueAssignment(), "rule__Result__ValueAssignment");
					put(grammarAccess.getHeaderJMeterAccess().getHeaderAssignment_0(), "rule__HeaderJMeter__HeaderAssignment_0");
					put(grammarAccess.getHeaderJMeterAccess().getHeaderAssignment_1_1(), "rule__HeaderJMeter__HeaderAssignment_1_1");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalGramaticajmeterParser typedParser = (InternalGramaticajmeterParser) parser;
			typedParser.entryRuleJMeter();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public GramaticajmeterGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(GramaticajmeterGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
