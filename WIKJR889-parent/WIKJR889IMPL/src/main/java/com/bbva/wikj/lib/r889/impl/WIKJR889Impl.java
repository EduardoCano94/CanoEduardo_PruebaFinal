package com.bbva.wikj.lib.r889.impl;

import com.bbva.apx.exception.db.NoResultException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collections;
import java.util.Map;

/**
 * The WIKJR889Impl class...
 */
public class WIKJR889Impl extends WIKJR889Abstract {

	@Override
	public Map<String, Object> executedSelect(String nuip) {
		try {
			return this.jdbcUtils.queryForMap("query.query2", nuip);
		}catch (NoResultException e){
			System.out.println("ExecuteSelect");
			return null;
		}catch (Exception e) {
			System.out.println("Error inesperado al ejecutar la consulta: " + e.getMessage());
			return null;
		}


	}

	@Override
	public int executedInsert(Map<String, Object> args) {
		try {
			return this.jdbcUtils.update("query.query1", args);
		} catch (Exception e) {
			System.out.println("Error inesperado al ejecutar la actualización: " + e.getMessage());
			throw new RuntimeException("Error inesperado en la inserción",e);
		}
	}
}
