/**
 * generated by Xtext 2.10.0
 */
package org.eclipse.january.geometry.dsl.mTL.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.january.geometry.dsl.mTL.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MTLFactoryImpl extends EFactoryImpl implements MTLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MTLFactory init()
  {
    try
    {
      MTLFactory theMTLFactory = (MTLFactory)EPackage.Registry.INSTANCE.getEFactory(MTLPackage.eNS_URI);
      if (theMTLFactory != null)
      {
        return theMTLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new MTLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MTLFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case MTLPackage.MATERIAL_SOURCE: return createMaterialSource();
      case MTLPackage.MATERIAL: return createMaterial();
      case MTLPackage.PHONG_MATERIAL: return createPhongMaterial();
      case MTLPackage.TEXTURED_MATERIAL: return createTexturedMaterial();
      case MTLPackage.COLOR: return createColor();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MaterialSource createMaterialSource()
  {
    MaterialSourceImpl materialSource = new MaterialSourceImpl();
    return materialSource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Material createMaterial()
  {
    MaterialImpl material = new MaterialImpl();
    return material;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PhongMaterial createPhongMaterial()
  {
    PhongMaterialImpl phongMaterial = new PhongMaterialImpl();
    return phongMaterial;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TexturedMaterial createTexturedMaterial()
  {
    TexturedMaterialImpl texturedMaterial = new TexturedMaterialImpl();
    return texturedMaterial;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Color createColor()
  {
    ColorImpl color = new ColorImpl();
    return color;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MTLPackage getMTLPackage()
  {
    return (MTLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static MTLPackage getPackage()
  {
    return MTLPackage.eINSTANCE;
  }

} //MTLFactoryImpl
