package com.bbva.wikj.lib.r888.impl;

import com.bbva.apx.exception.db.NoResultException;
import com.bbva.wikj.dto.user.DtoIn;
import com.bbva.wikj.dto.user.DtoOut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

public class WIKJR888Impl extends WIKJR888Abstract {


	@Override
	public DtoOut execute(DtoIn dtoIn) {
		DtoOut dtoOut = new DtoOut();
		Map<String, Object> args = new HashMap<>();

		args.put("id", dtoIn.getId());
		args.put("nuip", dtoIn.getNuip());
		args.put("full_name", dtoIn.getFullname());
		args.put("phone", dtoIn.getPhone());
		args.put("address", dtoIn.getAddress());



		Map<String, Object> response = null;
		try {
			response = this.wikjR889.executedSelect(dtoIn.getNuip());
			if(response==null ){
				int result = this.wikjR889.executedInsert(args);
				if(result==1) {
					response = this.wikjR889.executedSelect(dtoIn.getNuip());
					map(dtoOut, response);
				}
			}
		} catch (NoResultException e) {
			return null;
		}
		return dtoOut;
	}
	public DtoOut map(DtoOut dtoOut, Map<String, Object> entrada){

		dtoOut.setId(entrada.get("id").toString());
		dtoOut.setNuip(entrada.get("nuip").toString());
		dtoOut.setFullname(entrada.get("full_name").toString());
		dtoOut.setPhone(entrada.get("phone").toString());
		dtoOut.setAddress(entrada.get("address").toString());

		return dtoOut;

	}

	
}

