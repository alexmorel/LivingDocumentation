/**
 */
package fr.obeo.intent.specification;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Generation Note</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.obeo.intent.specification.TestGenerationNote#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.obeo.intent.specification.SpecificationPackage#getTestGenerationNote()
 * @model
 * @generated
 */
public interface TestGenerationNote extends Note {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.obeo.intent.specification.TestType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see fr.obeo.intent.specification.TestType
	 * @see #setType(TestType)
	 * @see fr.obeo.intent.specification.SpecificationPackage#getTestGenerationNote_Type()
	 * @model
	 * @generated
	 */
	TestType getType();

	/**
	 * Sets the value of the '{@link fr.obeo.intent.specification.TestGenerationNote#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see fr.obeo.intent.specification.TestType
	 * @see #getType()
	 * @generated
	 */
	void setType(TestType value);

} // TestGenerationNote
