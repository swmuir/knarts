/**
 */
package fhiRCore.resources;

import fhiRCore.dataTypes.BackboneElement;
import fhiRCore.dataTypes.DataType;
import fhiRCore.dataTypes.DateTime;
import fhiRCore.dataTypes.Decimal;
import fhiRCore.dataTypes.Identifier;
import fhiRCore.dataTypes.Money;
import fhiRCore.dataTypes.Quantity;
import fhiRCore.dataTypes.Reference;
import fhiRCore.dataTypes.UnsignedInt;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contract Term Contract Asset Valued Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fhiRCore.resources.ContractTermContractAssetValuedItem#getEntityx <em>Entityx</em>}</li>
 *   <li>{@link fhiRCore.resources.ContractTermContractAssetValuedItem#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link fhiRCore.resources.ContractTermContractAssetValuedItem#getEffectiveTime <em>Effective Time</em>}</li>
 *   <li>{@link fhiRCore.resources.ContractTermContractAssetValuedItem#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link fhiRCore.resources.ContractTermContractAssetValuedItem#getUnitPrice <em>Unit Price</em>}</li>
 *   <li>{@link fhiRCore.resources.ContractTermContractAssetValuedItem#getFactor <em>Factor</em>}</li>
 *   <li>{@link fhiRCore.resources.ContractTermContractAssetValuedItem#getPoints <em>Points</em>}</li>
 *   <li>{@link fhiRCore.resources.ContractTermContractAssetValuedItem#getNet <em>Net</em>}</li>
 *   <li>{@link fhiRCore.resources.ContractTermContractAssetValuedItem#getPayment <em>Payment</em>}</li>
 *   <li>{@link fhiRCore.resources.ContractTermContractAssetValuedItem#getPaymentDate <em>Payment Date</em>}</li>
 *   <li>{@link fhiRCore.resources.ContractTermContractAssetValuedItem#getResponsible <em>Responsible</em>}</li>
 *   <li>{@link fhiRCore.resources.ContractTermContractAssetValuedItem#getRecipient <em>Recipient</em>}</li>
 *   <li>{@link fhiRCore.resources.ContractTermContractAssetValuedItem#getLinkIds <em>Link Id</em>}</li>
 *   <li>{@link fhiRCore.resources.ContractTermContractAssetValuedItem#getSecurityLabelNumbers <em>Security Label Number</em>}</li>
 * </ul>
 *
 * @see fhiRCore.resources.ResourcesPackage#getContractTermContractAssetValuedItem()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ContractAsset_ValuedItem'"
 * @generated
 */
public interface ContractTermContractAssetValuedItem extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Entityx</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entityx</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entityx</em>' containment reference.
	 * @see #setEntityx(DataType)
	 * @see fhiRCore.resources.ResourcesPackage#getContractTermContractAssetValuedItem_Entityx()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='entity[x]'"
	 * @generated
	 */
	DataType getEntityx();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ContractTermContractAssetValuedItem#getEntityx <em>Entityx</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entityx</em>' containment reference.
	 * @see #getEntityx()
	 * @generated
	 */
	void setEntityx(DataType value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference.
	 * @see #setIdentifier(Identifier)
	 * @see fhiRCore.resources.ResourcesPackage#getContractTermContractAssetValuedItem_Identifier()
	 * @model containment="true"
	 * @generated
	 */
	Identifier getIdentifier();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ContractTermContractAssetValuedItem#getIdentifier <em>Identifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' containment reference.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(Identifier value);

	/**
	 * Returns the value of the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effective Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effective Time</em>' containment reference.
	 * @see #setEffectiveTime(DateTime)
	 * @see fhiRCore.resources.ResourcesPackage#getContractTermContractAssetValuedItem_EffectiveTime()
	 * @model containment="true"
	 * @generated
	 */
	DateTime getEffectiveTime();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ContractTermContractAssetValuedItem#getEffectiveTime <em>Effective Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effective Time</em>' containment reference.
	 * @see #getEffectiveTime()
	 * @generated
	 */
	void setEffectiveTime(DateTime value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' containment reference.
	 * @see #setQuantity(Quantity)
	 * @see fhiRCore.resources.ResourcesPackage#getContractTermContractAssetValuedItem_Quantity()
	 * @model containment="true"
	 * @generated
	 */
	Quantity getQuantity();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ContractTermContractAssetValuedItem#getQuantity <em>Quantity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' containment reference.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(Quantity value);

	/**
	 * Returns the value of the '<em><b>Unit Price</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit Price</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit Price</em>' containment reference.
	 * @see #setUnitPrice(Money)
	 * @see fhiRCore.resources.ResourcesPackage#getContractTermContractAssetValuedItem_UnitPrice()
	 * @model containment="true"
	 * @generated
	 */
	Money getUnitPrice();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ContractTermContractAssetValuedItem#getUnitPrice <em>Unit Price</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit Price</em>' containment reference.
	 * @see #getUnitPrice()
	 * @generated
	 */
	void setUnitPrice(Money value);

	/**
	 * Returns the value of the '<em><b>Factor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Factor</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Factor</em>' containment reference.
	 * @see #setFactor(Decimal)
	 * @see fhiRCore.resources.ResourcesPackage#getContractTermContractAssetValuedItem_Factor()
	 * @model containment="true"
	 * @generated
	 */
	Decimal getFactor();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ContractTermContractAssetValuedItem#getFactor <em>Factor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Factor</em>' containment reference.
	 * @see #getFactor()
	 * @generated
	 */
	void setFactor(Decimal value);

	/**
	 * Returns the value of the '<em><b>Points</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Points</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Points</em>' containment reference.
	 * @see #setPoints(Decimal)
	 * @see fhiRCore.resources.ResourcesPackage#getContractTermContractAssetValuedItem_Points()
	 * @model containment="true"
	 * @generated
	 */
	Decimal getPoints();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ContractTermContractAssetValuedItem#getPoints <em>Points</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Points</em>' containment reference.
	 * @see #getPoints()
	 * @generated
	 */
	void setPoints(Decimal value);

	/**
	 * Returns the value of the '<em><b>Net</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Net</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Net</em>' containment reference.
	 * @see #setNet(Money)
	 * @see fhiRCore.resources.ResourcesPackage#getContractTermContractAssetValuedItem_Net()
	 * @model containment="true"
	 * @generated
	 */
	Money getNet();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ContractTermContractAssetValuedItem#getNet <em>Net</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Net</em>' containment reference.
	 * @see #getNet()
	 * @generated
	 */
	void setNet(Money value);

	/**
	 * Returns the value of the '<em><b>Payment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment</em>' containment reference.
	 * @see #setPayment(fhiRCore.dataTypes.String)
	 * @see fhiRCore.resources.ResourcesPackage#getContractTermContractAssetValuedItem_Payment()
	 * @model containment="true"
	 * @generated
	 */
	fhiRCore.dataTypes.String getPayment();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ContractTermContractAssetValuedItem#getPayment <em>Payment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment</em>' containment reference.
	 * @see #getPayment()
	 * @generated
	 */
	void setPayment(fhiRCore.dataTypes.String value);

	/**
	 * Returns the value of the '<em><b>Payment Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment Date</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Date</em>' containment reference.
	 * @see #setPaymentDate(DateTime)
	 * @see fhiRCore.resources.ResourcesPackage#getContractTermContractAssetValuedItem_PaymentDate()
	 * @model containment="true"
	 * @generated
	 */
	DateTime getPaymentDate();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ContractTermContractAssetValuedItem#getPaymentDate <em>Payment Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Date</em>' containment reference.
	 * @see #getPaymentDate()
	 * @generated
	 */
	void setPaymentDate(DateTime value);

	/**
	 * Returns the value of the '<em><b>Responsible</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Responsible</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responsible</em>' containment reference.
	 * @see #setResponsible(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getContractTermContractAssetValuedItem_Responsible()
	 * @model containment="true"
	 * @generated
	 */
	Reference getResponsible();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ContractTermContractAssetValuedItem#getResponsible <em>Responsible</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responsible</em>' containment reference.
	 * @see #getResponsible()
	 * @generated
	 */
	void setResponsible(Reference value);

	/**
	 * Returns the value of the '<em><b>Recipient</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recipient</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recipient</em>' containment reference.
	 * @see #setRecipient(Reference)
	 * @see fhiRCore.resources.ResourcesPackage#getContractTermContractAssetValuedItem_Recipient()
	 * @model containment="true"
	 * @generated
	 */
	Reference getRecipient();

	/**
	 * Sets the value of the '{@link fhiRCore.resources.ContractTermContractAssetValuedItem#getRecipient <em>Recipient</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recipient</em>' containment reference.
	 * @see #getRecipient()
	 * @generated
	 */
	void setRecipient(Reference value);

	/**
	 * Returns the value of the '<em><b>Link Id</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link Id</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Id</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getContractTermContractAssetValuedItem_LinkId()
	 * @model containment="true"
	 * @generated
	 */
	EList<fhiRCore.dataTypes.String> getLinkIds();

	/**
	 * Returns the value of the '<em><b>Security Label Number</b></em>' containment reference list.
	 * The list contents are of type {@link fhiRCore.dataTypes.UnsignedInt}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security Label Number</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Label Number</em>' containment reference list.
	 * @see fhiRCore.resources.ResourcesPackage#getContractTermContractAssetValuedItem_SecurityLabelNumber()
	 * @model containment="true"
	 * @generated
	 */
	EList<UnsignedInt> getSecurityLabelNumbers();

} // ContractTermContractAssetValuedItem
