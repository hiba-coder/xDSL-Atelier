/**
 */
package productionlinesystem.abstractsyntax.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import productionlinesystem.abstractsyntax.AbstractsyntaxPackage;
import productionlinesystem.abstractsyntax.ProductionLineElement;
import productionlinesystem.abstractsyntax.ProductionLineModel;

import productionlinesystem.abstractsyntax.runtimestate.SimulationState;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Production Line Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link productionlinesystem.abstractsyntax.impl.ProductionLineModelImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link productionlinesystem.abstractsyntax.impl.ProductionLineModelImpl#getSimulationstate <em>Simulationstate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProductionLineModelImpl extends MinimalEObjectImpl.Container implements ProductionLineModel {
	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<ProductionLineElement> elements;

	/**
	 * The cached value of the '{@link #getSimulationstate() <em>Simulationstate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimulationstate()
	 * @generated
	 * @ordered
	 */
	protected SimulationState simulationstate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductionLineModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AbstractsyntaxPackage.Literals.PRODUCTION_LINE_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProductionLineElement> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentWithInverseEList<ProductionLineElement>(ProductionLineElement.class, this,
					AbstractsyntaxPackage.PRODUCTION_LINE_MODEL__ELEMENTS,
					AbstractsyntaxPackage.PRODUCTION_LINE_ELEMENT__SYSTEM);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimulationState getSimulationstate() {
		return simulationstate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSimulationstate(SimulationState newSimulationstate, NotificationChain msgs) {
		SimulationState oldSimulationstate = simulationstate;
		simulationstate = newSimulationstate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					AbstractsyntaxPackage.PRODUCTION_LINE_MODEL__SIMULATIONSTATE, oldSimulationstate,
					newSimulationstate);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimulationstate(SimulationState newSimulationstate) {
		if (newSimulationstate != simulationstate) {
			NotificationChain msgs = null;
			if (simulationstate != null)
				msgs = ((InternalEObject) simulationstate).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - AbstractsyntaxPackage.PRODUCTION_LINE_MODEL__SIMULATIONSTATE, null,
						msgs);
			if (newSimulationstate != null)
				msgs = ((InternalEObject) newSimulationstate).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - AbstractsyntaxPackage.PRODUCTION_LINE_MODEL__SIMULATIONSTATE, null,
						msgs);
			msgs = basicSetSimulationstate(newSimulationstate, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					AbstractsyntaxPackage.PRODUCTION_LINE_MODEL__SIMULATIONSTATE, newSimulationstate,
					newSimulationstate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AbstractsyntaxPackage.PRODUCTION_LINE_MODEL__ELEMENTS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getElements()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case AbstractsyntaxPackage.PRODUCTION_LINE_MODEL__ELEMENTS:
			return ((InternalEList<?>) getElements()).basicRemove(otherEnd, msgs);
		case AbstractsyntaxPackage.PRODUCTION_LINE_MODEL__SIMULATIONSTATE:
			return basicSetSimulationstate(null, msgs);
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
		case AbstractsyntaxPackage.PRODUCTION_LINE_MODEL__ELEMENTS:
			return getElements();
		case AbstractsyntaxPackage.PRODUCTION_LINE_MODEL__SIMULATIONSTATE:
			return getSimulationstate();
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
		case AbstractsyntaxPackage.PRODUCTION_LINE_MODEL__ELEMENTS:
			getElements().clear();
			getElements().addAll((Collection<? extends ProductionLineElement>) newValue);
			return;
		case AbstractsyntaxPackage.PRODUCTION_LINE_MODEL__SIMULATIONSTATE:
			setSimulationstate((SimulationState) newValue);
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
		case AbstractsyntaxPackage.PRODUCTION_LINE_MODEL__ELEMENTS:
			getElements().clear();
			return;
		case AbstractsyntaxPackage.PRODUCTION_LINE_MODEL__SIMULATIONSTATE:
			setSimulationstate((SimulationState) null);
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
		case AbstractsyntaxPackage.PRODUCTION_LINE_MODEL__ELEMENTS:
			return elements != null && !elements.isEmpty();
		case AbstractsyntaxPackage.PRODUCTION_LINE_MODEL__SIMULATIONSTATE:
			return simulationstate != null;
		}
		return super.eIsSet(featureID);
	}

} //ProductionLineModelImpl
