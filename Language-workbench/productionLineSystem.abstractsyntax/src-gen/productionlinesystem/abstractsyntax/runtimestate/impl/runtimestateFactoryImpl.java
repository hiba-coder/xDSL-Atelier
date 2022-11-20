/**
 */
package productionlinesystem.abstractsyntax.runtimestate.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import productionlinesystem.abstractsyntax.runtimestate.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class runtimestateFactoryImpl extends EFactoryImpl implements runtimestateFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static runtimestateFactory init() {
		try {
			runtimestateFactory theruntimestateFactory = (runtimestateFactory) EPackage.Registry.INSTANCE
					.getEFactory(runtimestatePackage.eNS_URI);
			if (theruntimestateFactory != null) {
				return theruntimestateFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new runtimestateFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public runtimestateFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case runtimestatePackage.SIMULATION_STATE:
			return createSimulationState();
		case runtimestatePackage.PRODUCTION_LINE_ELEMENT_STATE:
			return createProductionLineElementState();
		case runtimestatePackage.CONTAINER_STATE:
			return createContainerState();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimulationState createSimulationState() {
		SimulationStateImpl simulationState = new SimulationStateImpl();
		return simulationState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductionLineElementState createProductionLineElementState() {
		ProductionLineElementStateImpl productionLineElementState = new ProductionLineElementStateImpl();
		return productionLineElementState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerState createContainerState() {
		ContainerStateImpl containerState = new ContainerStateImpl();
		return containerState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public runtimestatePackage getruntimestatePackage() {
		return (runtimestatePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static runtimestatePackage getPackage() {
		return runtimestatePackage.eINSTANCE;
	}

} //runtimestateFactoryImpl
