/**
 */
package PNPL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Petri Net</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PNPL.PetriNet#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see PNPL.PNPLPackage#getPetriNet()
 * @model
 * @generated
 */
public interface PetriNet extends EObject {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link PNPL.Element}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see PNPL.PNPLPackage#getPetriNet_Elements()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Element> getElements();

} // PetriNet
