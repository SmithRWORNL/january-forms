/*
 * generated by Xtext 2.10.0
 */
package org.eclipse.january.geometry.dsl.vtk


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class VTKStandaloneSetup extends org.eclipse.january.geometry.dsl.vtk.VTKStandaloneSetupGenerated {

	def static void doSetup() {
		new VTKStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
