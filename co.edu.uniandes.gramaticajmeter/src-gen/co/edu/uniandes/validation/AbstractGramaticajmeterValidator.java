/*
 * generated by Xtext 2.9.1
 */
package co.edu.uniandes.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractGramaticajmeterValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(co.edu.uniandes.gramaticajmeter.GramaticajmeterPackage.eINSTANCE);
		return result;
	}
	
}
