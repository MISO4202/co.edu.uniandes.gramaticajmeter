/**
 * generated by Xtext 2.9.1
 */
package co.edu.uniandes.gramaticajmeter;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see co.edu.uniandes.gramaticajmeter.GramaticajmeterPackage
 * @generated
 */
public interface GramaticajmeterFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  GramaticajmeterFactory eINSTANCE = co.edu.uniandes.gramaticajmeter.impl.GramaticajmeterFactoryImpl.init();

  /**
   * Returns a new object of class '<em>JMeter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>JMeter</em>'.
   * @generated
   */
  JMeter createJMeter();

  /**
   * Returns a new object of class '<em>Architecture Results</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Architecture Results</em>'.
   * @generated
   */
  ArchitectureResults createArchitectureResults();

  /**
   * Returns a new object of class '<em>Header</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Header</em>'.
   * @generated
   */
  Header createHeader();

  /**
   * Returns a new object of class '<em>Results</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Results</em>'.
   * @generated
   */
  Results createResults();

  /**
   * Returns a new object of class '<em>Result</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Result</em>'.
   * @generated
   */
  Result createResult();

  /**
   * Returns a new object of class '<em>Header JMeter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Header JMeter</em>'.
   * @generated
   */
  HeaderJMeter createHeaderJMeter();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  GramaticajmeterPackage getGramaticajmeterPackage();

} //GramaticajmeterFactory