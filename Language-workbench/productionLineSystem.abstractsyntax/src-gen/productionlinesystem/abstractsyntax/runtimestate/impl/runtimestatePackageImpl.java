/**
 */
package productionlinesystem.abstractsyntax.runtimestate.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import productionlinesystem.abstractsyntax.AbstractsyntaxPackage;

import productionlinesystem.abstractsyntax.impl.AbstractsyntaxPackageImpl;

import productionlinesystem.abstractsyntax.runtimestate.ContainerState;
import productionlinesystem.abstractsyntax.runtimestate.ProductionLineElementState;
import productionlinesystem.abstractsyntax.runtimestate.SimulationState;
import productionlinesystem.abstractsyntax.runtimestate.runtimestateFactory;
import productionlinesystem.abstractsyntax.runtimestate.runtimestatePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class runtimestatePackageImpl extends EPackageImpl implements runtimestatePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simulationStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productionLineElementStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerStateEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see productionlinesystem.abstractsyntax.runtimestate.runtimestatePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private runtimestatePackageImpl() {
		super(eNS_URI, runtimestateFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link runtimestatePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static runtimestatePackage init() {
		if (isInited)
			return (runtimestatePackage) EPackage.Registry.INSTANCE.getEPackage(runtimestatePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredruntimestatePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		runtimestatePackageImpl theruntimestatePackage = registeredruntimestatePackage instanceof runtimestatePackageImpl
				? (runtimestatePackageImpl) registeredruntimestatePackage
				: new runtimestatePackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AbstractsyntaxPackage.eNS_URI);
		AbstractsyntaxPackageImpl theAbstractsyntaxPackage = (AbstractsyntaxPackageImpl) (registeredPackage instanceof AbstractsyntaxPackageImpl
				? registeredPackage
				: AbstractsyntaxPackage.eINSTANCE);

		// Create package meta-data objects
		theruntimestatePackage.createPackageContents();
		theAbstractsyntaxPackage.createPackageContents();

		// Initialize created meta-data
		theruntimestatePackage.initializePackageContents();
		theAbstractsyntaxPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theruntimestatePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(runtimestatePackage.eNS_URI, theruntimestatePackage);
		return theruntimestatePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimulationState() {
		return simulationStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimulationState_ElementsState() {
		return (EReference) simulationStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProductionLineElementState() {
		return productionLineElementStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProductionLineElementState_Productionlineelement() {
		return (EReference) productionLineElementStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainerState() {
		return containerStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public runtimestateFactory getruntimestateFactory() {
		return (runtimestateFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		simulationStateEClass = createEClass(SIMULATION_STATE);
		createEReference(simulationStateEClass, SIMULATION_STATE__ELEMENTS_STATE);

		productionLineElementStateEClass = createEClass(PRODUCTION_LINE_ELEMENT_STATE);
		createEReference(productionLineElementStateEClass, PRODUCTION_LINE_ELEMENT_STATE__PRODUCTIONLINEELEMENT);

		containerStateEClass = createEClass(CONTAINER_STATE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		AbstractsyntaxPackage theAbstractsyntaxPackage = (AbstractsyntaxPackage) EPackage.Registry.INSTANCE
				.getEPackage(AbstractsyntaxPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		containerStateEClass.getESuperTypes().add(this.getProductionLineElementState());

		// Initialize classes, features, and operations; add parameters
		initEClass(simulationStateEClass, SimulationState.class, "SimulationState", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimulationState_ElementsState(), this.getProductionLineElementState(), null, "elementsState",
				null, 1, -1, SimulationState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productionLineElementStateEClass, ProductionLineElementState.class, "ProductionLineElementState",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProductionLineElementState_Productionlineelement(),
				theAbstractsyntaxPackage.getProductionLineElement(), null, "productionlineelement", null, 1, 1,
				ProductionLineElementState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containerStateEClass, ContainerState.class, "ContainerState", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
	}

} //runtimestatePackageImpl
