/**
 * generated by Xtext 2.9.1
 */
package co.edu.uniandes.gramaticajmeter.impl;

import co.edu.uniandes.gramaticajmeter.ArchitectureResults;
import co.edu.uniandes.gramaticajmeter.GramaticajmeterPackage;
import co.edu.uniandes.gramaticajmeter.JMeter;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>JMeter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link co.edu.uniandes.gramaticajmeter.impl.JMeterImpl#getArchitectureResults <em>Architecture Results</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JMeterImpl extends MinimalEObjectImpl.Container implements JMeter
{
  /**
   * The cached value of the '{@link #getArchitectureResults() <em>Architecture Results</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArchitectureResults()
   * @generated
   * @ordered
   */
  protected EList<ArchitectureResults> architectureResults;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected JMeterImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return GramaticajmeterPackage.Literals.JMETER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ArchitectureResults> getArchitectureResults()
  {
    if (architectureResults == null)
    {
      architectureResults = new EObjectContainmentEList<ArchitectureResults>(ArchitectureResults.class, this, GramaticajmeterPackage.JMETER__ARCHITECTURE_RESULTS);
    }
    return architectureResults;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case GramaticajmeterPackage.JMETER__ARCHITECTURE_RESULTS:
        return ((InternalEList<?>)getArchitectureResults()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case GramaticajmeterPackage.JMETER__ARCHITECTURE_RESULTS:
        return getArchitectureResults();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GramaticajmeterPackage.JMETER__ARCHITECTURE_RESULTS:
        getArchitectureResults().clear();
        getArchitectureResults().addAll((Collection<? extends ArchitectureResults>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case GramaticajmeterPackage.JMETER__ARCHITECTURE_RESULTS:
        getArchitectureResults().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case GramaticajmeterPackage.JMETER__ARCHITECTURE_RESULTS:
        return architectureResults != null && !architectureResults.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //JMeterImpl
