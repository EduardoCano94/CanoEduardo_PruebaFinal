package com.bbva.wikj;

import com.bbva.elara.transaction.AbstractTransaction;
import com.bbva.wikj.dto.user.DtoIn;
import com.bbva.wikj.dto.user.DtoOut;

/**
 * In this class, the input and output data is defined automatically through the setters and getters.
 */
public abstract class AbstractWIKJT88801MXTransaction extends AbstractTransaction {

	public AbstractWIKJT88801MXTransaction(){
	}


	/**
	 * Return value for input parameter dtoIn
	 */
	protected DtoIn getDtoin(){
		return (DtoIn)this.getParameter("dtoIn");
	}

	/**
	 * Set value for DtoOut output parameter dtoOut
	 */
	protected void setDtoout(final DtoOut field){
		this.addParameter("dtoOut", field);
	}
}
