/*
 * generated by Xtext 2.12.0
 */
package com.minres.rdl

import org.eclipse.xtext.conversion.IValueConverterService
import com.minres.rdl.converter.RdlTerminalConverters
import org.eclipse.xtext.scoping.IGlobalScopeProvider
import org.eclipse.xtext.naming.IQualifiedNameProvider

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
class RDLRuntimeModule extends AbstractRDLRuntimeModule {

	override Class<? extends IValueConverterService> bindIValueConverterService() {
        return typeof(RdlTerminalConverters);
    }
    // contributed by org.eclipse.xtext.generator.scoping.AbstractScopingFragment
	override void configureIScopeProviderDelegate(com.google.inject.Binder binder) {
		binder.bind(typeof(org.eclipse.xtext.scoping.IScopeProvider)).
		annotatedWith(com.google.inject.name.Names.named(org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider.NAMED_DELEGATE)).
		to(typeof(org.eclipse.xtext.scoping.impl.SimpleLocalScopeProvider));
	}
	// the following two are used to allow URI based include mechanism
	// contributed by org.eclipse.xtext.xtext.generator.scoping.ImportNamespacesScopingFragment2
	override Class<? extends IGlobalScopeProvider> bindIGlobalScopeProvider() {
		//return typeof(ResourceSetGlobalScopeProvider)
		return typeof(org.eclipse.xtext.scoping.impl.ImportUriGlobalScopeProvider)
	}
	// contributed by org.eclipse.xtext.generator.exporting.SimpleNamesFragment
	override Class<? extends IQualifiedNameProvider> bindIQualifiedNameProvider() {
		//return typeof(ResourceSetGlobalScopeProvider)
		return typeof(org.eclipse.xtext.naming.SimpleNameProvider)
	}

}
