/**
 * generated by Xtext 2.13.0
 */
package org.xtext;

import org.xtext.GoStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class GoStandaloneSetup extends GoStandaloneSetupGenerated {
  public static void doSetup() {
    new GoStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}
