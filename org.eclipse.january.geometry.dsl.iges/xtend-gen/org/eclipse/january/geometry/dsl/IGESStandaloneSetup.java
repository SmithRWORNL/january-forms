/**
 * generated by Xtext 2.10.0
 */
package org.eclipse.january.geometry.dsl;

import org.eclipse.january.geometry.dsl.IGESStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class IGESStandaloneSetup extends IGESStandaloneSetupGenerated {
  public static void doSetup() {
    new IGESStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}
