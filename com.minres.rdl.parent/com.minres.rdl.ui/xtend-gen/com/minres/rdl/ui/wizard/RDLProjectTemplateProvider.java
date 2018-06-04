/**
 * generated by Xtext 2.14.0
 */
package com.minres.rdl.ui.wizard;

import com.minres.rdl.ui.wizard.HelloWorldProject;
import org.eclipse.xtext.ui.wizard.template.AbstractProjectTemplate;
import org.eclipse.xtext.ui.wizard.template.IProjectTemplateProvider;

/**
 * Create a list with all project templates to be shown in the template new project wizard.
 * 
 * Each template is able to generate one or more projects. Each project can be configured such that any number of files are included.
 */
@SuppressWarnings("all")
public class RDLProjectTemplateProvider implements IProjectTemplateProvider {
  @Override
  public AbstractProjectTemplate[] getProjectTemplates() {
    HelloWorldProject _helloWorldProject = new HelloWorldProject();
    return new AbstractProjectTemplate[] { _helloWorldProject };
  }
}
