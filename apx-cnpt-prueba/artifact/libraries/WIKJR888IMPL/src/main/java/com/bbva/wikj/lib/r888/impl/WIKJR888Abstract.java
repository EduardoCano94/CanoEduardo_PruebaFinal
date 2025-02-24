package com.bbva.wikj.lib.r888.impl;

import com.bbva.elara.configuration.manager.application.ApplicationConfigurationService;
import com.bbva.elara.library.AbstractLibrary;
import com.bbva.wikj.lib.r888.WIKJR888;
import com.bbva.wikj.lib.r889.WIKJR889;

/**
 * This class automatically defines the libraries and utilities that it will use.
 */
public abstract class WIKJR888Abstract extends AbstractLibrary implements WIKJR888 {

	protected ApplicationConfigurationService applicationConfigurationService;

	protected WIKJR889 wikjR889;


	/**
	* @param applicationConfigurationService the this.applicationConfigurationService to set
	*/
	public void setApplicationConfigurationService(ApplicationConfigurationService applicationConfigurationService) {
		this.applicationConfigurationService = applicationConfigurationService;
	}

	/**
	* @param wikjR889 the this.wikjR889 to set
	*/
	public void setWikjR889(WIKJR889 wikjR889) {
		this.wikjR889 = wikjR889;
	}

}