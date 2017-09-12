/*
 * generated by Xtext 2.12.0
 */
package com.minres.rdl.scoping

import com.minres.rdl.rdl.ComponentDefinition
import com.minres.rdl.rdl.ComponentInstance
import com.minres.rdl.rdl.EnumDefinition
import com.minres.rdl.rdl.InstanceRef
import com.minres.rdl.rdl.NamedInstantiation
import com.minres.rdl.rdl.Root
import java.util.ArrayList
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.Scopes
import org.eclipse.emf.ecore.resource.Resource
import java.util.List

/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation.html#scoping
 * on how and when to use it 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 *
 */

class RDLScopeProvider extends AbstractRDLScopeProvider { //AbstractDeclarativeScopeProvider {

//	override IScope getScope(EObject context, EReference reference){
////		println("scope_"+reference.EContainingClass.name+"_"+reference.name+"("+context.eClass.name+",..)")
//		switch(context){
//			InstanceRef:{
//				var definition = context.componentDefinition
//				val parent = context.eContainer()
//				if (parent instanceof InstanceRef)
//					definition = parent.instance.componentDefinition
//				if (definition !== null)
//					return getScopeWithInstancesAndEnums(definition)
//				return IScope.NULLSCOPE			
//			}
//			NamedInstantiation:{
//					val  componentDef =  context.componentDefinition
//					if(componentDef!==null)
//			        	return getScopeWithComponentDefinition(componentDef)
//					else
//			        	return getScopeWithComponentDefinition(context.root)
//			}
//		}
//		super.getScope(context, reference)
//	}
	
	dispatch def IScope getScopeWithComponentDefinition(ComponentDefinition componentDef){
    	return Scopes.scopeFor(componentDef.componentDefinitions, getScopeWithComponentDefinition(componentDef.eContainer))
	}
	
	dispatch def IScope getScopeWithComponentDefinition(Root root){
		var compDefs = root.componentDefinitions
		for (incl : root.includes) {
			var resource = EcoreUtil2.getResource(root.eResource, incl.importURI);
			val r = resource.contents.head as Root
			compDefs+=r.componentDefinitions
		}
		return Scopes.scopeFor(compDefs)
	}
	
	dispatch def IScope getScopeWithInstancesAndEnums(ComponentDefinition componentDef){
 		var res = new ArrayList<ComponentInstance>()
 		for(NamedInstantiation inst:componentDef.namedInstantiations)
 			if(inst.componentInstances.size>0) res.addAll(inst.componentInstances)
 		for(ComponentDefinition definition:componentDef.componentDefinitions)
 			if(definition.immediateInstantiation!==null && definition.immediateInstantiation.componentInstances.size>0)
 				res.addAll(definition.immediateInstantiation.componentInstances)
 		return Scopes.scopeFor(res+componentDef.enumDefinitions, getScopeWithInstancesAndEnums(componentDef.eContainer))		
	}
	
	dispatch def IScope getScopeWithInstancesAndEnums(Root root){
 		var res = new ArrayList<ComponentInstance>()
		for(instantiation: root.namedInstantiations)
			if(instantiation.componentInstances.size>0)
				res.addAll(instantiation.componentInstances)
 		for(ComponentDefinition definition:root.componentDefinitions)
 			if(definition.immediateInstantiation!==null && definition.immediateInstantiation.componentInstances.size>0)
				res.addAll(definition.immediateInstantiation.componentInstances)
		var enums =  EcoreUtil2.getAllContentsOfType(root, EnumDefinition)
		for (incl : root.includes) {
			val resource = EcoreUtil2.getResource(root.eResource, incl.importURI);
			enums+=EcoreUtil2.getAllContentsOfType(resource.contents.head as Root, EnumDefinition)
		}
		return Scopes.scopeFor(res+enums)		
	}
	
	private def Root root(EObject definition){
		var container = definition.eContainer
		while(!(container instanceof Root))	container=container.eContainer
		return container as Root
	}
	
	private def ComponentDefinition componentDefinition(EObject obj){
		var container = obj.eContainer
		while(!(container instanceof Root)){
			if(container instanceof NamedInstantiation) return container.component
			if(container instanceof ComponentDefinition) return container
			container=container.eContainer
		}
		return null		
	}
	
//	dispatch def Iterable<ComponentDefinition>  allComponentDefinitions(ComponentDefinition definition){
//		return definition.componentDefinitions + definition.eContainer.allComponentDefinitions
//	}
//	
//	dispatch def Iterable<? extends ComponentDefinition> allComponentDefinitions(Root root){
//		var compDefs = root.componentDefinitions
//		for (incl : root.includes) {
//			var resource = EcoreUtil2.getResource(root.eResource, incl.importURI);
//			val r = resource.contents.head as Root
//			compDefs+=r.allComponentDefinitions
//		}
//		return compDefs 		
//	}
	
// 	dispatch def Iterable<EnumDefinition> allEnumDefinitions(ComponentDefinition componentDefinition){
// 		return componentDefinition.enumDefinitions + componentDefinition.eContainer.allEnumDefinitions
// 	}
//
// 	dispatch def Iterable<EnumDefinition> allEnumDefinitions(Root root){
// 		var List<Resource> res1=newArrayList()
// 		res1+=root.eResource
//		var enums =  EcoreUtil2.getAllContentsOfType(root, EnumDefinition)
//		for (incl : root.includes) {
//			val resource = EcoreUtil2.getResource(root.eResource, incl.importURI);
//			enums+=(resource.contents.head as Root).allEnumDefinitions
//		}
//		return enums 		
// 	}
//
// 	private def Iterable<ComponentInstance> allInstances(ComponentDefinition componentDefinition){
// 		var res = new ArrayList<ComponentInstance>()
// 		for(NamedInstantiation inst:componentDefinition.namedInstantiations)
// 			if(inst.componentInstances.size>0) res.addAll(inst.componentInstances)
// 		for(ComponentDefinition definition:componentDefinition.componentDefinitions)
// 			if(definition.immediateInstantiation!==null && definition.immediateInstantiation.componentInstances.size>0)
// 				res.addAll(definition.immediateInstantiation.componentInstances)
// 		if(componentDefinition.eContainer instanceof ComponentDefinition) {
// 			res.addAll((componentDefinition.eContainer as ComponentDefinition).allInstances)
// 		} else if(componentDefinition.eContainer instanceof Root){
// 			var root = componentDefinition.eContainer as Root
// 			for(instantiation: root.namedInstantiations)
// 				if(instantiation.componentInstances.size>0)
//					res.addAll(instantiation.componentInstances)
//	 		for(ComponentDefinition definition:root.componentDefinitions)
//	 			if(definition.immediateInstantiation!==null && definition.immediateInstantiation.componentInstances.size>0)
//					res.addAll(definition.immediateInstantiation.componentInstances)
// 		}
// 		return res
// 	}
 	
}
