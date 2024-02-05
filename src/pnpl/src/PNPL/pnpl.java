/**
 */
package PNPL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>pnpl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PNPL.pnpl#getPn_150 <em>Pn 150</em>}</li>
 *   <li>{@link PNPL.pnpl#getFeaturemodel <em>Featuremodel</em>}</li>
 *   <li>{@link PNPL.pnpl#getPresencecondition <em>Presencecondition</em>}</li>
 * </ul>
 *
 * @see PNPL.PNPLPackage#getpnpl()
 * @model
 * @generated
 */
public interface pnpl extends EObject {
	/**
	 * Returns the value of the '<em><b>Pn 150</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pn 150</em>' containment reference.
	 * @see #setPn_150(PetriNet)
	 * @see PNPL.PNPLPackage#getpnpl_Pn_150()
	 * @model containment="true" required="true"
	 * @generated
	 */
	PetriNet getPn_150();

	/**
	 * Sets the value of the '{@link PNPL.pnpl#getPn_150 <em>Pn 150</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pn 150</em>' containment reference.
	 * @see #getPn_150()
	 * @generated
	 */
	void setPn_150(PetriNet value);

	/**
	 * Returns the value of the '<em><b>Featuremodel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Featuremodel</em>' containment reference.
	 * @see #setFeaturemodel(FeatureModel)
	 * @see PNPL.PNPLPackage#getpnpl_Featuremodel()
	 * @model containment="true" required="true"
	 * @generated
	 */
	FeatureModel getFeaturemodel();

	/**
	 * Sets the value of the '{@link PNPL.pnpl#getFeaturemodel <em>Featuremodel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Featuremodel</em>' containment reference.
	 * @see #getFeaturemodel()
	 * @generated
	 */
	void setFeaturemodel(FeatureModel value);

	/**
	 * Returns the value of the '<em><b>Presencecondition</b></em>' containment reference list.
	 * The list contents are of type {@link PNPL.PresenceCondition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Presencecondition</em>' containment reference list.
	 * @see PNPL.PNPLPackage#getpnpl_Presencecondition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<PresenceCondition> getPresencecondition();

} // pnpl
