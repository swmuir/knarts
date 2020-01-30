/**
 */
package fhiRCore.valueSets;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Container Materials</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fhiRCore.valueSets.ValueSetsPackage#getContainerMaterials()
 * @model
 * @generated
 */
public enum ContainerMaterials implements Enumerator {
	/**
	 * The '<em><b>32039001</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_32039001_VALUE
	 * @generated
	 * @ordered
	 */
	_32039001(0, "_32039001", "_32039001"),

	/**
	 * The '<em><b>61088005</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_61088005_VALUE
	 * @generated
	 * @ordered
	 */
	_61088005(1, "_61088005", "_61088005"),

	/**
	 * The '<em><b>425620007</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_425620007_VALUE
	 * @generated
	 * @ordered
	 */
	_425620007(2, "_425620007", "_425620007");

	/**
	 * The '<em><b>32039001</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>32039001</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #_32039001
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='32039001'"
	 * @generated
	 * @ordered
	 */
	public static final int _32039001_VALUE = 0;

	/**
	 * The '<em><b>61088005</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>61088005</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #_61088005
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='61088005'"
	 * @generated
	 * @ordered
	 */
	public static final int _61088005_VALUE = 1;

	/**
	 * The '<em><b>425620007</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>425620007</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #_425620007
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='425620007'"
	 * @generated
	 * @ordered
	 */
	public static final int _425620007_VALUE = 2;

	/**
	 * An array of all the '<em><b>Container Materials</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ContainerMaterials[] VALUES_ARRAY =
		new ContainerMaterials[] {
			_32039001,
			_61088005,
			_425620007,
		};

	/**
	 * A public read-only list of all the '<em><b>Container Materials</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ContainerMaterials> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Container Materials</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ContainerMaterials get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ContainerMaterials result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Container Materials</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ContainerMaterials getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ContainerMaterials result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Container Materials</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ContainerMaterials get(int value) {
		switch (value) {
			case _32039001_VALUE: return _32039001;
			case _61088005_VALUE: return _61088005;
			case _425620007_VALUE: return _425620007;
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
	private ContainerMaterials(int value, String name, String literal) {
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
	
} //ContainerMaterials
