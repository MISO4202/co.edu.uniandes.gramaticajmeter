/*
 * generated by Xtext 2.9.1
 */
package co.edu.uniandes.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class GramaticajmeterAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("co/edu/uniandes/parser/antlr/internal/InternalGramaticajmeter.tokens");
	}
}
