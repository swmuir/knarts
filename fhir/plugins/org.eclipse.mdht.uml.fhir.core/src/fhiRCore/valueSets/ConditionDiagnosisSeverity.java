/**
 */
package fhiRCore.valueSets;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Condition Diagnosis Severity</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fhiRCore.valueSets.ValueSetsPackage#getConditionDiagnosisSeverity()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Condition/DiagnosisSeverity'"
 * @generated
 */
public enum ConditionDiagnosisSeverity implements Enumerator {
	/**
	 * The '<em><b>24484000</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_24484000_VALUE
	 * @generated
	 * @ordered
	 */
	_24484000(0, "_24484000", "_24484000"),

	/**
	 * The '<em><b>6736007</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_6736007_VALUE
	 * @generated
	 * @ordered
	 */
	_6736007(1, "_6736007", "_6736007"),

	/**
	 * The '<em><b>255604002</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_255604002_VALUE
	 * @generated
	 * @ordered
	 */
	_255604002(2, "_255604002", "_255604002");

	/**
	 * The '<em><b>24484000</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>24484000</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #_24484000
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='24484000'"
	 * @generated
	 * @ordered
	 */
	public static final int _24484000_VALUE = 0;

	/**
	 * The '<em><b>6736007</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>6736007</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #_6736007
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='6736007'"
	 * @generated
	 * @ordered
	 */
	public static final int _6736007_VALUE = 1;

	/**
	 * The '<em><b>255604002</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>255604002</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #_255604002
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='255604002'"
	 * @generated
	 * @ordered
	 */
	public static final int _255604002_VALUE = 2;

	/**
	 * An array of all the '<em><b>Condition Diagnosis Severity</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ConditionDiagnosisSeverity[] VALUES_ARRAY =
		new ConditionDiagnosisSeverity[] {
			_24484000,
			_6736007,
			_255604002,
		};

	/**
	 * A public read-only list of all the '<em><b>Condition Diagnosis Severity</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ConditionDiagnosisSeverity> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Condition Diagnosis Severity</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConditionDiagnosisSeverity get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConditionDiagnosisSeverity result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Condition Diagnosis Severity</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConditionDiagnosisSeverity getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConditionDiagnosisSeverity result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Condition Diagnosis Severity</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConditionDiagnosisSeverity get(int value) {
		switch (value) {
			case _24484000_VALUE: return _24484000;
			case _6736007_VALUE: return _6736007;
			case _255604002_VALUE: return _255604002;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ConditionDiagnosisSeverity(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //ConditionDiagnosisSeverity
