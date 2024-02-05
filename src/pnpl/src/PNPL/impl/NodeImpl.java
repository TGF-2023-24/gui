/**
 */
package PNPL.impl;

import PNPL.Node;
import PNPL.PNPLPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PNPL.impl.NodeImpl#getName <em>Name</em>}</li>
 *   <li>{@link PNPL.impl.NodeImpl#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link PNPL.impl.NodeImpl#isMandatory <em>Mandatory</em>}</li>
 *   <li>{@link PNPL.impl.NodeImpl#getExclude <em>Exclude</em>}</li>
 *   <li>{@link PNPL.impl.NodeImpl#getRequires <em>Requires</em>}</li>
 *   <li>{@link PNPL.impl.NodeImpl#isSelect <em>Select</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeImpl extends MinimalEObjectImpl.Container implements Node {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean abstract_ = ABSTRACT_EDEFAULT;

	/**
	 * The default value of the '{@link #isMandatory() <em>Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMandatory()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MANDATORY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMandatory() <em>Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMandatory()
	 * @generated
	 * @ordered
	 */
	protected boolean mandatory = MANDATORY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExclude() <em>Exclude</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExclude()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> exclude;

	/**
	 * The cached value of the '{@link #getRequires() <em>Requires</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequires()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> requires;

	/**
	 * The default value of the '{@link #isSelect() <em>Select</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSelect()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SELECT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSelect() <em>Select</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSelect()
	 * @generated
	 * @ordered
	 */
	protected boolean select = SELECT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PNPLPackage.Literals.NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PNPLPackage.NODE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAbstract() {
		return abstract_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAbstract(boolean newAbstract) {
		boolean oldAbstract = abstract_;
		abstract_ = newAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PNPLPackage.NODE__ABSTRACT, oldAbstract, abstract_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isMandatory() {
		return mandatory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMandatory(boolean newMandatory) {
		boolean oldMandatory = mandatory;
		mandatory = newMandatory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PNPLPackage.NODE__MANDATORY, oldMandatory, mandatory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Node> getExclude() {
		if (exclude == null) {
			exclude = new EObjectResolvingEList<Node>(Node.class, this, PNPLPackage.NODE__EXCLUDE);
		}
		return exclude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Node> getRequires() {
		if (requires == null) {
			requires = new EObjectResolvingEList<Node>(Node.class, this, PNPLPackage.NODE__REQUIRES);
		}
		return requires;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSelect() {
		return select;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSelect(boolean newSelect) {
		boolean oldSelect = select;
		select = newSelect;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PNPLPackage.NODE__SELECT, oldSelect, select));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PNPLPackage.NODE__NAME:
				return getName();
			case PNPLPackage.NODE__ABSTRACT:
				return isAbstract();
			case PNPLPackage.NODE__MANDATORY:
				return isMandatory();
			case PNPLPackage.NODE__EXCLUDE:
				return getExclude();
			case PNPLPackage.NODE__REQUIRES:
				return getRequires();
			case PNPLPackage.NODE__SELECT:
				return isSelect();
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
			case PNPLPackage.NODE__NAME:
				setName((String)newValue);
				return;
			case PNPLPackage.NODE__ABSTRACT:
				setAbstract((Boolean)newValue);
				return;
			case PNPLPackage.NODE__MANDATORY:
				setMandatory((Boolean)newValue);
				return;
			case PNPLPackage.NODE__EXCLUDE:
				getExclude().clear();
				getExclude().addAll((Collection<? extends Node>)newValue);
				return;
			case PNPLPackage.NODE__REQUIRES:
				getRequires().clear();
				getRequires().addAll((Collection<? extends Node>)newValue);
				return;
			case PNPLPackage.NODE__SELECT:
				setSelect((Boolean)newValue);
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
			case PNPLPackage.NODE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PNPLPackage.NODE__ABSTRACT:
				setAbstract(ABSTRACT_EDEFAULT);
				return;
			case PNPLPackage.NODE__MANDATORY:
				setMandatory(MANDATORY_EDEFAULT);
				return;
			case PNPLPackage.NODE__EXCLUDE:
				getExclude().clear();
				return;
			case PNPLPackage.NODE__REQUIRES:
				getRequires().clear();
				return;
			case PNPLPackage.NODE__SELECT:
				setSelect(SELECT_EDEFAULT);
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
			case PNPLPackage.NODE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PNPLPackage.NODE__ABSTRACT:
				return abstract_ != ABSTRACT_EDEFAULT;
			case PNPLPackage.NODE__MANDATORY:
				return mandatory != MANDATORY_EDEFAULT;
			case PNPLPackage.NODE__EXCLUDE:
				return exclude != null && !exclude.isEmpty();
			case PNPLPackage.NODE__REQUIRES:
				return requires != null && !requires.isEmpty();
			case PNPLPackage.NODE__SELECT:
				return select != SELECT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", abstract: ");
		result.append(abstract_);
		result.append(", mandatory: ");
		result.append(mandatory);
		result.append(", select: ");
		result.append(select);
		result.append(')');
		return result.toString();
	}

} //NodeImpl
