package com.wisnu.cabglass.dao;

import com.wisnu.cabglass.exception.*;

/**
 * @author Wisnu Wardoyo
 */
public interface CabGlassDao {

	/**
	 * 
	 * @param entity
	 */
	Object insert(Object entity) throws DaoException;

	/**
	 * 
	 * @param entity
	 */
	Object update(Object entity) throws DaoException;

	/**
	 * 
	 * @param entity
	 */
	Object delete(Object entity) throws DaoException;

	java.sql.ResultSet select() throws DaoException;

	/**
	 * 
	 * @param entity
	 */
	java.sql.ResultSet select(Object entity) throws DaoException;

}