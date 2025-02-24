package com.bbva.wikj;

import com.bbva.wikj.dto.user.DtoIn;
import com.bbva.wikj.dto.user.DtoOut;
import com.bbva.wikj.lib.r888.WIKJR888;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * trx
 *
 */
public class WIKJT88801MXTransaction extends AbstractWIKJT88801MXTransaction {

	private static final Logger LOGGER = LoggerFactory.getLogger(WIKJT88801MXTransaction.class);

	/**
	 * The execute method...
	 */
	@Override
	public void execute() {
		WIKJR888 wikjR888 = this.getServiceLibrary(WIKJR888.class);
		DtoOut dtoOut = wikjR888.execute(this.getDtoin());
		this.setDtoout(dtoOut);
	}

}
