/**
 * generated by Xtext 2.9.1
 */
package co.edu.uniandes.gramaticajmeter.impl;

import co.edu.uniandes.gramaticajmeter.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GramaticajmeterFactoryImpl extends EFactoryImpl implements GramaticajmeterFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static GramaticajmeterFactory init()
  {
    try
    {
      GramaticajmeterFactory theGramaticajmeterFactory = (GramaticajmeterFactory)EPackage.Registry.INSTANCE.getEFactory(GramaticajmeterPackage.eNS_URI);
      if (theGramaticajmeterFactory != null)
      {
        return theGramaticajmeterFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new GramaticajmeterFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GramaticajmeterFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case GramaticajmeterPackage.JMETER: return createJMeter();
      case GramaticajmeterPackage.ARCHITECTURE_RESULTS: return createArchitectureResults();
      case GramaticajmeterPackage.HEADER: return createHeader();
      case GramaticajmeterPackage.RESULTS: return createResults();
      case GramaticajmeterPackage.RESULT: return createResult();
      case GramaticajmeterPackage.HEADER_JMETER: return createHeaderJMeter();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JMeter createJMeter()
  {
    JMeterImpl jMeter = new JMeterImpl();
    return jMeter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArchitectureResults createArchitectureResults()
  {
    ArchitectureResultsImpl architectureResults = new ArchitectureResultsImpl();
    return architectureResults;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Header createHeader()
  {
    HeaderImpl header = new HeaderImpl();
    return header;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Results createResults()
  {
    ResultsImpl results = new ResultsImpl();
    return results;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Result createResult()
  {
    ResultImpl result = new ResultImpl();
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HeaderJMeter createHeaderJMeter()
  {
    HeaderJMeterImpl headerJMeter = new HeaderJMeterImpl();
    return headerJMeter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GramaticajmeterPackage getGramaticajmeterPackage()
  {
    return (GramaticajmeterPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static GramaticajmeterPackage getPackage()
  {
    return GramaticajmeterPackage.eINSTANCE;
  }

} //GramaticajmeterFactoryImpl
