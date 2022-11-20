/**
 */
package productionlinesystem.abstractsyntax.runtimestate;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see productionlinesystem.abstractsyntax.runtimestate.runtimestatePackage
 * @generated
 */
public interface runtimestateFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	runtimestateFactory eINSTANCE = productionlinesystem.abstractsyntax.runtimestate.impl.runtimestateFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Simulation State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simulation State</em>'.
	 * @generated
	 */
	SimulationState createSimulationState();

	/**
	 * Returns a new object of class '<em>Production Line Element State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Production Line Element State</em>'.
	 * @generated
	 */
	ProductionLineElementState createProductionLineElementState();

	/**
	 * Returns a new object of class '<em>Container State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Container State</em>'.
	 * @generated
	 */
	ContainerState createContainerState();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	runtimestatePackage getruntimestatePackage();

} //runtimestateFactory
