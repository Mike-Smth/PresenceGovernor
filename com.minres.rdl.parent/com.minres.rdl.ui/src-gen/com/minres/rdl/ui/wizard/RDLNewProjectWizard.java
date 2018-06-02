/*
 * generated by Xtext 2.14.0
 */
package com.minres.rdl.ui.wizard;

import org.eclipse.xtext.ui.wizard.XtextNewProjectWizard;

import org.eclipse.xtext.ui.wizard.IExtendedProjectInfo;
import org.eclipse.xtext.ui.wizard.IProjectCreator;
import com.google.inject.Inject;

public class RDLNewProjectWizard extends XtextNewProjectWizard {

	private RDLWizardNewProjectCreationPage mainPage;

	@Inject
	public RDLNewProjectWizard(IProjectCreator projectCreator) {
		super(projectCreator);
		setWindowTitle("New RDL Project");
	}

	protected RDLWizardNewProjectCreationPage getMainPage() {
		return mainPage;
	}

	/**
	 * Use this method to add pages to the wizard.
	 * The one-time generated version of this class will add a default new project page to the wizard.
	 */
	@Override
	public void addPages() {
		mainPage = createMainPage("basicNewProjectPage");
		mainPage.setTitle("RDL Project");
		mainPage.setDescription("Create a new RDL project.");
		addPage(mainPage);
	}

	protected RDLWizardNewProjectCreationPage createMainPage(String pageName) {
		return new RDLWizardNewProjectCreationPage(pageName);
	}

	/**
	 * Use this method to read the project settings from the wizard pages and feed them into the project info class.
	 */
	@Override
	protected IExtendedProjectInfo getProjectInfo() {
		RDLProjectInfo projectInfo = new RDLProjectInfo();
		projectInfo.setProjectName(mainPage.getProjectName());
		if (!mainPage.useDefaults()) {
			projectInfo.setLocationPath(mainPage.getLocationPath());
		}
		return projectInfo;
	}

}
