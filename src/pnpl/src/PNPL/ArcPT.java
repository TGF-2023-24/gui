/**
 */
package PNPL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arc PT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PNPL.ArcPT#getSource <em>Source</em>}</li>
 *   <li>{@link PNPL.ArcPT#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see PNPL.PNPLPackage#getArcPT()
 * @model
 * @generated
 */
public interface ArcPT extends Arc {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Place)
	 * @see PNPL.PNPLPackage#getArcPT_Source()
	 * @model required="true"
	 * @generated
	 */
	Place getSource();

	/**
	 * Sets the value of the '{@link PNPL.ArcPT#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Place value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Transition)
	 * @see PNPL.PNPLPackage#getArcPT_Target()
	 * @model required="true"
	 * @generated
	 */
	Transition getTarget();

	/**
	 * Sets the value of the '{@link PNPL.ArcPT#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Transition value);

} // ArcPT
