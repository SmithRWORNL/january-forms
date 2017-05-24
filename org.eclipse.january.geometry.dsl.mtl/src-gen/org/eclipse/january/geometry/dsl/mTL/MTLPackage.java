/**
 * generated by Xtext 2.10.0
 */
package org.eclipse.january.geometry.dsl.mTL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.january.geometry.dsl.mTL.MTLFactory
 * @model kind="package"
 * @generated
 */
public interface MTLPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "mTL";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.eclipse.org/january/gometry/xtext/MTL";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "mTL";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MTLPackage eINSTANCE = org.eclipse.january.geometry.dsl.mTL.impl.MTLPackageImpl.init();

  /**
   * The meta object id for the '{@link org.eclipse.january.geometry.dsl.mTL.impl.MaterialSourceImpl <em>Material Source</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.january.geometry.dsl.mTL.impl.MaterialSourceImpl
   * @see org.eclipse.january.geometry.dsl.mTL.impl.MTLPackageImpl#getMaterialSource()
   * @generated
   */
  int MATERIAL_SOURCE = 0;

  /**
   * The feature id for the '<em><b>Materials</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATERIAL_SOURCE__MATERIALS = 0;

  /**
   * The number of structural features of the '<em>Material Source</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATERIAL_SOURCE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.january.geometry.dsl.mTL.impl.MaterialImpl <em>Material</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.january.geometry.dsl.mTL.impl.MaterialImpl
   * @see org.eclipse.january.geometry.dsl.mTL.impl.MTLPackageImpl#getMaterial()
   * @generated
   */
  int MATERIAL = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATERIAL__NAME = 0;

  /**
   * The feature id for the '<em><b>Ambient</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATERIAL__AMBIENT = 1;

  /**
   * The feature id for the '<em><b>Diffuse</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATERIAL__DIFFUSE = 2;

  /**
   * The feature id for the '<em><b>Specular</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATERIAL__SPECULAR = 3;

  /**
   * The feature id for the '<em><b>Specular Exponent</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATERIAL__SPECULAR_EXPONENT = 4;

  /**
   * The feature id for the '<em><b>Opaque</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATERIAL__OPAQUE = 5;

  /**
   * The feature id for the '<em><b>Transparent</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATERIAL__TRANSPARENT = 6;

  /**
   * The feature id for the '<em><b>Illumination</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATERIAL__ILLUMINATION = 7;

  /**
   * The number of structural features of the '<em>Material</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MATERIAL_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link org.eclipse.january.geometry.dsl.mTL.impl.PhongMaterialImpl <em>Phong Material</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.january.geometry.dsl.mTL.impl.PhongMaterialImpl
   * @see org.eclipse.january.geometry.dsl.mTL.impl.MTLPackageImpl#getPhongMaterial()
   * @generated
   */
  int PHONG_MATERIAL = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHONG_MATERIAL__NAME = MATERIAL__NAME;

  /**
   * The feature id for the '<em><b>Ambient</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHONG_MATERIAL__AMBIENT = MATERIAL__AMBIENT;

  /**
   * The feature id for the '<em><b>Diffuse</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHONG_MATERIAL__DIFFUSE = MATERIAL__DIFFUSE;

  /**
   * The feature id for the '<em><b>Specular</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHONG_MATERIAL__SPECULAR = MATERIAL__SPECULAR;

  /**
   * The feature id for the '<em><b>Specular Exponent</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHONG_MATERIAL__SPECULAR_EXPONENT = MATERIAL__SPECULAR_EXPONENT;

  /**
   * The feature id for the '<em><b>Opaque</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHONG_MATERIAL__OPAQUE = MATERIAL__OPAQUE;

  /**
   * The feature id for the '<em><b>Transparent</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHONG_MATERIAL__TRANSPARENT = MATERIAL__TRANSPARENT;

  /**
   * The feature id for the '<em><b>Illumination</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHONG_MATERIAL__ILLUMINATION = MATERIAL__ILLUMINATION;

  /**
   * The number of structural features of the '<em>Phong Material</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHONG_MATERIAL_FEATURE_COUNT = MATERIAL_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.eclipse.january.geometry.dsl.mTL.impl.TexturedMaterialImpl <em>Textured Material</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.january.geometry.dsl.mTL.impl.TexturedMaterialImpl
   * @see org.eclipse.january.geometry.dsl.mTL.impl.MTLPackageImpl#getTexturedMaterial()
   * @generated
   */
  int TEXTURED_MATERIAL = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXTURED_MATERIAL__NAME = MATERIAL__NAME;

  /**
   * The feature id for the '<em><b>Ambient</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXTURED_MATERIAL__AMBIENT = MATERIAL__AMBIENT;

  /**
   * The feature id for the '<em><b>Diffuse</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXTURED_MATERIAL__DIFFUSE = MATERIAL__DIFFUSE;

  /**
   * The feature id for the '<em><b>Specular</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXTURED_MATERIAL__SPECULAR = MATERIAL__SPECULAR;

  /**
   * The feature id for the '<em><b>Specular Exponent</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXTURED_MATERIAL__SPECULAR_EXPONENT = MATERIAL__SPECULAR_EXPONENT;

  /**
   * The feature id for the '<em><b>Opaque</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXTURED_MATERIAL__OPAQUE = MATERIAL__OPAQUE;

  /**
   * The feature id for the '<em><b>Transparent</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXTURED_MATERIAL__TRANSPARENT = MATERIAL__TRANSPARENT;

  /**
   * The feature id for the '<em><b>Illumination</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXTURED_MATERIAL__ILLUMINATION = MATERIAL__ILLUMINATION;

  /**
   * The feature id for the '<em><b>Ambient Map</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXTURED_MATERIAL__AMBIENT_MAP = MATERIAL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Diffuse Map</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXTURED_MATERIAL__DIFFUSE_MAP = MATERIAL_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Specular Map</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXTURED_MATERIAL__SPECULAR_MAP = MATERIAL_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Specular Highlight Map</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXTURED_MATERIAL__SPECULAR_HIGHLIGHT_MAP = MATERIAL_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Alpha Map</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXTURED_MATERIAL__ALPHA_MAP = MATERIAL_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Bump Map</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXTURED_MATERIAL__BUMP_MAP = MATERIAL_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Textured Material</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXTURED_MATERIAL_FEATURE_COUNT = MATERIAL_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link org.eclipse.january.geometry.dsl.mTL.impl.ColorImpl <em>Color</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.january.geometry.dsl.mTL.impl.ColorImpl
   * @see org.eclipse.january.geometry.dsl.mTL.impl.MTLPackageImpl#getColor()
   * @generated
   */
  int COLOR = 4;

  /**
   * The feature id for the '<em><b>Red</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR__RED = 0;

  /**
   * The feature id for the '<em><b>Green</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR__GREEN = 1;

  /**
   * The feature id for the '<em><b>Blue</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR__BLUE = 2;

  /**
   * The number of structural features of the '<em>Color</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR_FEATURE_COUNT = 3;


  /**
   * Returns the meta object for class '{@link org.eclipse.january.geometry.dsl.mTL.MaterialSource <em>Material Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Material Source</em>'.
   * @see org.eclipse.january.geometry.dsl.mTL.MaterialSource
   * @generated
   */
  EClass getMaterialSource();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.january.geometry.dsl.mTL.MaterialSource#getMaterials <em>Materials</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Materials</em>'.
   * @see org.eclipse.january.geometry.dsl.mTL.MaterialSource#getMaterials()
   * @see #getMaterialSource()
   * @generated
   */
  EReference getMaterialSource_Materials();

  /**
   * Returns the meta object for class '{@link org.eclipse.january.geometry.dsl.mTL.Material <em>Material</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Material</em>'.
   * @see org.eclipse.january.geometry.dsl.mTL.Material
   * @generated
   */
  EClass getMaterial();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.january.geometry.dsl.mTL.Material#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.january.geometry.dsl.mTL.Material#getName()
   * @see #getMaterial()
   * @generated
   */
  EAttribute getMaterial_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.january.geometry.dsl.mTL.Material#getAmbient <em>Ambient</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ambient</em>'.
   * @see org.eclipse.january.geometry.dsl.mTL.Material#getAmbient()
   * @see #getMaterial()
   * @generated
   */
  EReference getMaterial_Ambient();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.january.geometry.dsl.mTL.Material#getDiffuse <em>Diffuse</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Diffuse</em>'.
   * @see org.eclipse.january.geometry.dsl.mTL.Material#getDiffuse()
   * @see #getMaterial()
   * @generated
   */
  EReference getMaterial_Diffuse();

  /**
   * Returns the meta object for the containment reference '{@link org.eclipse.january.geometry.dsl.mTL.Material#getSpecular <em>Specular</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Specular</em>'.
   * @see org.eclipse.january.geometry.dsl.mTL.Material#getSpecular()
   * @see #getMaterial()
   * @generated
   */
  EReference getMaterial_Specular();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.january.geometry.dsl.mTL.Material#getSpecularExponent <em>Specular Exponent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Specular Exponent</em>'.
   * @see org.eclipse.january.geometry.dsl.mTL.Material#getSpecularExponent()
   * @see #getMaterial()
   * @generated
   */
  EAttribute getMaterial_SpecularExponent();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.january.geometry.dsl.mTL.Material#getOpaque <em>Opaque</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Opaque</em>'.
   * @see org.eclipse.january.geometry.dsl.mTL.Material#getOpaque()
   * @see #getMaterial()
   * @generated
   */
  EAttribute getMaterial_Opaque();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.january.geometry.dsl.mTL.Material#getTransparent <em>Transparent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Transparent</em>'.
   * @see org.eclipse.january.geometry.dsl.mTL.Material#getTransparent()
   * @see #getMaterial()
   * @generated
   */
  EAttribute getMaterial_Transparent();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.january.geometry.dsl.mTL.Material#getIllumination <em>Illumination</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Illumination</em>'.
   * @see org.eclipse.january.geometry.dsl.mTL.Material#getIllumination()
   * @see #getMaterial()
   * @generated
   */
  EAttribute getMaterial_Illumination();

  /**
   * Returns the meta object for class '{@link org.eclipse.january.geometry.dsl.mTL.PhongMaterial <em>Phong Material</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Phong Material</em>'.
   * @see org.eclipse.january.geometry.dsl.mTL.PhongMaterial
   * @generated
   */
  EClass getPhongMaterial();

  /**
   * Returns the meta object for class '{@link org.eclipse.january.geometry.dsl.mTL.TexturedMaterial <em>Textured Material</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Textured Material</em>'.
   * @see org.eclipse.january.geometry.dsl.mTL.TexturedMaterial
   * @generated
   */
  EClass getTexturedMaterial();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.january.geometry.dsl.mTL.TexturedMaterial#getAmbientMap <em>Ambient Map</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ambient Map</em>'.
   * @see org.eclipse.january.geometry.dsl.mTL.TexturedMaterial#getAmbientMap()
   * @see #getTexturedMaterial()
   * @generated
   */
  EAttribute getTexturedMaterial_AmbientMap();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.january.geometry.dsl.mTL.TexturedMaterial#getDiffuseMap <em>Diffuse Map</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Diffuse Map</em>'.
   * @see org.eclipse.january.geometry.dsl.mTL.TexturedMaterial#getDiffuseMap()
   * @see #getTexturedMaterial()
   * @generated
   */
  EAttribute getTexturedMaterial_DiffuseMap();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.january.geometry.dsl.mTL.TexturedMaterial#getSpecularMap <em>Specular Map</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Specular Map</em>'.
   * @see org.eclipse.january.geometry.dsl.mTL.TexturedMaterial#getSpecularMap()
   * @see #getTexturedMaterial()
   * @generated
   */
  EAttribute getTexturedMaterial_SpecularMap();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.january.geometry.dsl.mTL.TexturedMaterial#getSpecularHighlightMap <em>Specular Highlight Map</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Specular Highlight Map</em>'.
   * @see org.eclipse.january.geometry.dsl.mTL.TexturedMaterial#getSpecularHighlightMap()
   * @see #getTexturedMaterial()
   * @generated
   */
  EAttribute getTexturedMaterial_SpecularHighlightMap();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.january.geometry.dsl.mTL.TexturedMaterial#getAlphaMap <em>Alpha Map</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Alpha Map</em>'.
   * @see org.eclipse.january.geometry.dsl.mTL.TexturedMaterial#getAlphaMap()
   * @see #getTexturedMaterial()
   * @generated
   */
  EAttribute getTexturedMaterial_AlphaMap();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.january.geometry.dsl.mTL.TexturedMaterial#getBumpMap <em>Bump Map</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Bump Map</em>'.
   * @see org.eclipse.january.geometry.dsl.mTL.TexturedMaterial#getBumpMap()
   * @see #getTexturedMaterial()
   * @generated
   */
  EAttribute getTexturedMaterial_BumpMap();

  /**
   * Returns the meta object for class '{@link org.eclipse.january.geometry.dsl.mTL.Color <em>Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Color</em>'.
   * @see org.eclipse.january.geometry.dsl.mTL.Color
   * @generated
   */
  EClass getColor();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.january.geometry.dsl.mTL.Color#getRed <em>Red</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Red</em>'.
   * @see org.eclipse.january.geometry.dsl.mTL.Color#getRed()
   * @see #getColor()
   * @generated
   */
  EAttribute getColor_Red();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.january.geometry.dsl.mTL.Color#getGreen <em>Green</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Green</em>'.
   * @see org.eclipse.january.geometry.dsl.mTL.Color#getGreen()
   * @see #getColor()
   * @generated
   */
  EAttribute getColor_Green();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.january.geometry.dsl.mTL.Color#getBlue <em>Blue</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Blue</em>'.
   * @see org.eclipse.january.geometry.dsl.mTL.Color#getBlue()
   * @see #getColor()
   * @generated
   */
  EAttribute getColor_Blue();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MTLFactory getMTLFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.eclipse.january.geometry.dsl.mTL.impl.MaterialSourceImpl <em>Material Source</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.january.geometry.dsl.mTL.impl.MaterialSourceImpl
     * @see org.eclipse.january.geometry.dsl.mTL.impl.MTLPackageImpl#getMaterialSource()
     * @generated
     */
    EClass MATERIAL_SOURCE = eINSTANCE.getMaterialSource();

    /**
     * The meta object literal for the '<em><b>Materials</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MATERIAL_SOURCE__MATERIALS = eINSTANCE.getMaterialSource_Materials();

    /**
     * The meta object literal for the '{@link org.eclipse.january.geometry.dsl.mTL.impl.MaterialImpl <em>Material</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.january.geometry.dsl.mTL.impl.MaterialImpl
     * @see org.eclipse.january.geometry.dsl.mTL.impl.MTLPackageImpl#getMaterial()
     * @generated
     */
    EClass MATERIAL = eINSTANCE.getMaterial();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MATERIAL__NAME = eINSTANCE.getMaterial_Name();

    /**
     * The meta object literal for the '<em><b>Ambient</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MATERIAL__AMBIENT = eINSTANCE.getMaterial_Ambient();

    /**
     * The meta object literal for the '<em><b>Diffuse</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MATERIAL__DIFFUSE = eINSTANCE.getMaterial_Diffuse();

    /**
     * The meta object literal for the '<em><b>Specular</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MATERIAL__SPECULAR = eINSTANCE.getMaterial_Specular();

    /**
     * The meta object literal for the '<em><b>Specular Exponent</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MATERIAL__SPECULAR_EXPONENT = eINSTANCE.getMaterial_SpecularExponent();

    /**
     * The meta object literal for the '<em><b>Opaque</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MATERIAL__OPAQUE = eINSTANCE.getMaterial_Opaque();

    /**
     * The meta object literal for the '<em><b>Transparent</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MATERIAL__TRANSPARENT = eINSTANCE.getMaterial_Transparent();

    /**
     * The meta object literal for the '<em><b>Illumination</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MATERIAL__ILLUMINATION = eINSTANCE.getMaterial_Illumination();

    /**
     * The meta object literal for the '{@link org.eclipse.january.geometry.dsl.mTL.impl.PhongMaterialImpl <em>Phong Material</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.january.geometry.dsl.mTL.impl.PhongMaterialImpl
     * @see org.eclipse.january.geometry.dsl.mTL.impl.MTLPackageImpl#getPhongMaterial()
     * @generated
     */
    EClass PHONG_MATERIAL = eINSTANCE.getPhongMaterial();

    /**
     * The meta object literal for the '{@link org.eclipse.january.geometry.dsl.mTL.impl.TexturedMaterialImpl <em>Textured Material</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.january.geometry.dsl.mTL.impl.TexturedMaterialImpl
     * @see org.eclipse.january.geometry.dsl.mTL.impl.MTLPackageImpl#getTexturedMaterial()
     * @generated
     */
    EClass TEXTURED_MATERIAL = eINSTANCE.getTexturedMaterial();

    /**
     * The meta object literal for the '<em><b>Ambient Map</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEXTURED_MATERIAL__AMBIENT_MAP = eINSTANCE.getTexturedMaterial_AmbientMap();

    /**
     * The meta object literal for the '<em><b>Diffuse Map</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEXTURED_MATERIAL__DIFFUSE_MAP = eINSTANCE.getTexturedMaterial_DiffuseMap();

    /**
     * The meta object literal for the '<em><b>Specular Map</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEXTURED_MATERIAL__SPECULAR_MAP = eINSTANCE.getTexturedMaterial_SpecularMap();

    /**
     * The meta object literal for the '<em><b>Specular Highlight Map</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEXTURED_MATERIAL__SPECULAR_HIGHLIGHT_MAP = eINSTANCE.getTexturedMaterial_SpecularHighlightMap();

    /**
     * The meta object literal for the '<em><b>Alpha Map</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEXTURED_MATERIAL__ALPHA_MAP = eINSTANCE.getTexturedMaterial_AlphaMap();

    /**
     * The meta object literal for the '<em><b>Bump Map</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEXTURED_MATERIAL__BUMP_MAP = eINSTANCE.getTexturedMaterial_BumpMap();

    /**
     * The meta object literal for the '{@link org.eclipse.january.geometry.dsl.mTL.impl.ColorImpl <em>Color</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.january.geometry.dsl.mTL.impl.ColorImpl
     * @see org.eclipse.january.geometry.dsl.mTL.impl.MTLPackageImpl#getColor()
     * @generated
     */
    EClass COLOR = eINSTANCE.getColor();

    /**
     * The meta object literal for the '<em><b>Red</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLOR__RED = eINSTANCE.getColor_Red();

    /**
     * The meta object literal for the '<em><b>Green</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLOR__GREEN = eINSTANCE.getColor_Green();

    /**
     * The meta object literal for the '<em><b>Blue</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLOR__BLUE = eINSTANCE.getColor_Blue();

  }

} //MTLPackage
