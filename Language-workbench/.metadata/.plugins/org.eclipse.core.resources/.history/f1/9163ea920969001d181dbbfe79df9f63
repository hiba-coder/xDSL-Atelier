/**
 */
package productionlinesystem.abstractsyntax.runtimestate.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import productionlinesystem.abstractsyntax.runtimestate.ProductionLineElementState;
import productionlinesystem.abstractsyntax.runtimestate.SimulationState;
import productionlinesystem.abstractsyntax.runtimestate.runtimestatePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simulation State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link productionlinesystem.abstractsyntax.runtimestate.impl.SimulationStateImpl#getElementsState <em>Elements State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimulationStateImpl extends MinimalEObjectImpl.Container implements SimulationState {
	/**
	 * The cached value of the '{@link #getElementsState() <em>Elements State</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementsState()
	 * @generated
	 * @ordered
	 */
	protected EList<ProductionLineElementState> elementsState;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimulationStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return runtimestatePackage.Literals.SIMULATION_STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProductionLineElementState> getElementsState() {
		if (elementsState == null) {
			elementsState = new EObjectContainmentEList<ProductionLineElementState>(ProductionLineElementState.class,
					this, runtimestatePackage.SIMULATION_STATE__ELEMENTS_STATE);
		}
		return elementsState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case runtimestatePackage.SIMULATION_STATE__ELEMENTS_STATE:
			return ((InternalEList<?>) getElementsState()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case runtimestatePackage.SIMULATION_STATE__ELEMENTS_STATE:
			return getElementsState();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case runtimestatePackage.SIMULATION_STATE__ELEMENTS_STATE:
			getElementsState().clear();
			getElementsState().addAll((Collection<? extends ProductionLineElementState>) newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
		case runtimestatePackage.SIMULATION_STATE__ELEMENTS_STATE:
			getElementsState().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case runtimestatePackage.SIMULATION_STATE__ELEMENTS_STATE:
			return elementsState != null && !elementsState.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SimulationStateImpl
