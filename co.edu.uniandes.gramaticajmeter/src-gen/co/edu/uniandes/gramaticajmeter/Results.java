/**
 * generated by Xtext 2.9.1
 */
package co.edu.uniandes.gramaticajmeter;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Results</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link co.edu.uniandes.gramaticajmeter.Results#getResult <em>Result</em>}</li>
 * </ul>
 * </p>
 *
 * @see co.edu.uniandes.gramaticajmeter.GramaticajmeterPackage#getResults()
 * @model
 * @generated
 */
public interface Results extends EObject
{
  /**
   * Returns the value of the '<em><b>Result</b></em>' containment reference list.
   * The list contents are of type {@link co.edu.uniandes.gramaticajmeter.Result}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Result</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Result</em>' containment reference list.
   * @see co.edu.uniandes.gramaticajmeter.GramaticajmeterPackage#getResults_Result()
   * @model containment="true"
   * @generated
   */
  EList<Result> getResult();

} // Results
