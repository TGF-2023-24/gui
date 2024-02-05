/**
 */
package PNPL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PNPL.Relation#getParent <em>Parent</em>}</li>
 *   <li>{@link PNPL.Relation#getChilds <em>Childs</em>}</li>
 *   <li>{@link PNPL.Relation#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see PNPL.PNPLPackage#getRelation()
 * @model
 * @generated
 */
public interface Relation extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(Node)
	 * @see PNPL.PNPLPackage#getRelation_Parent()
	 * @model required="true"
	 * @generated
	 */
	Node getParent();

	/**
	 * Sets the value of the '{@link PNPL.Relation#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(Node value);

	/**
	 * Returns the value of the '<em><b>Childs</b></em>' reference list.
	 * The list contents are of type {@link PNPL.Node}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Childs</em>' reference list.
	 * @see PNPL.PNPLPackage#getRelation_Childs()
	 * @model required="true"
	 * @generated
	 */
	EList<Node> getChilds();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link PNPL.RelationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see PNPL.RelationType
	 * @see #setType(RelationType)
	 * @see PNPL.PNPLPackage#getRelation_Type()
	 * @model required="true"
	 * @generated
	 */
	RelationType getType();

	/**
	 * Sets the value of the '{@link PNPL.Relation#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see PNPL.RelationType
	 * @see #getType()
	 * @generated
	 */
	void setType(RelationType value);

} // Relation
