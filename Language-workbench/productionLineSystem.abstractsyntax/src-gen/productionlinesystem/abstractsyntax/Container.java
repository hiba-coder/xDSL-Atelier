/**
 */
package productionlinesystem.abstractsyntax;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link productionlinesystem.abstractsyntax.Container#getParts <em>Parts</em>}</li>
 * </ul>
 *
 * @see productionlinesystem.abstractsyntax.AbstractsyntaxPackage#getContainer()
 * @model abstract="true"
 * @generated
 */
public interface Container extends ProductionLineElement {

	/**
	 * Returns the value of the '<em><b>Parts</b></em>' containment reference list.
	 * The list contents are of type {@link productionlinesystem.abstractsyntax.Part}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parts</em>' containment reference list.
	 * @see productionlinesystem.abstractsyntax.AbstractsyntaxPackage#getContainer_Parts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Part> getParts();
} // Container
