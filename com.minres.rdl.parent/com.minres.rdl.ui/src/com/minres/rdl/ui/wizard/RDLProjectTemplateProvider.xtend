/*
 * generated by Xtext 2.14.0
 */
package com.minres.rdl.ui.wizard

import org.eclipse.xtext.ui.XtextProjectHelper
import org.eclipse.xtext.ui.util.PluginProjectFactory
import org.eclipse.xtext.ui.wizard.template.IProjectGenerator
import org.eclipse.xtext.ui.wizard.template.IProjectTemplateProvider
import org.eclipse.xtext.ui.wizard.template.ProjectTemplate

/**
 * Create a list with all project templates to be shown in the template new project wizard.
 * 
 * Each template is able to generate one or more projects. Each project can be configured such that any number of files are included.
 */
class RDLProjectTemplateProvider implements IProjectTemplateProvider {
	override getProjectTemplates() {
		#[new RdlProject]
	}
}

@ProjectTemplate(
	label="RDL template",
	icon="project_template.png",
	description="<p><b>RDL</b></p><p>This is a simple project for RDL.</p>")
final class RdlProject {
//	val advanced = check("Advanced:", false)
//	val advancedGroup = group("Properties")
//	val name = combo("Name:", #["Xtext", "World", "Foo", "Bar"], "The name to say 'Hello' to", advancedGroup)
//	val path = text("Package:", "mydsl", "The package path to place the files in", advancedGroup)
//
//	override protected updateVariables() {
//		name.enabled = advanced.value
//		path.enabled = advanced.value
//		if (!advanced.value) {
//			name.value = "Xtext"
//			path.value = "rdl"
//		}
//	}
//
//	override protected validate() {
//		if (path.value.matches('[a-z][a-z0-9_]*(/[a-z][a-z0-9_]*)*'))
//			null
//		else
//			new Status(ERROR, "Wizard", "'" + path + "' is not a valid package name")
//	}

	override generateProjects(IProjectGenerator generator) {
		generator.generate(new PluginProjectFactory => [
			projectName = projectInfo.projectName
			location = projectInfo.locationPath
			projectNatures += XtextProjectHelper.NATURE_ID //#[JavaCore.NATURE_ID, "org.eclipse.pde.PluginNature", XtextProjectHelper.NATURE_ID]
			builderIds += XtextProjectHelper.BUILDER_ID //JavaCore.BUILDER_ID
			folders += "src"
			addFile('''src/Model.rdl''', '''
				enum ERRSLICE0_MISSIONERR_ENABLE_ERR25_enum{
				  DISABLE = 1'd0;
				  ENABLE = 1'd1;
				};
				addrmap  {
				    name = "foo registers";
				    desc = "this is a bunch of foo regs bla bla bla";
				    
				    regfile bar_regs  {
				        name = "bar registers";
				        desc = "this is a bunch of bar regs bla bla bla";
				        
					    reg {
				            field { name="field 1"; sw=rw; hw=rw; we; } fld1[9:0] = 10'd0;
				            field { name="field 2"; sw=rw; hw=r; } fld2[15:15];
				            field {encode=ERRSLICE0_MISSIONERR_ENABLE_ERR25_enum; sw=rw; hw=r; reset=1'h1;} ERR25[25:25];
					    } a_reg[2];	    
					    
				    } bar;
				    
				} foo;
			''')
		])
	}
}
