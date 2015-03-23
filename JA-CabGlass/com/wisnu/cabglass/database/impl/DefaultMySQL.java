package com.wisnu.cabglass.database.impl;

import com.wisnu.cabglass.database.*;

/**
 * @author Wisnu Wardoyo
 */
public class DefaultMySQL extends Database {

	private String ADDRESS;
	private String PORT;
	private String USER;
	private String PASSWORD;

	/**
	 * 
	 * @param ADDRESS
	 * @param PORT
	 * @param USER
	 * @param PASSWORD
	 * @param DBNAME
	 */
	public DefaultMySQL(String ADDRESS, String PORT, String USER, String PASSWORD, String DBNAME) {
		// TODO - implement DefaultMySQL.DefaultMySQL
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param source
	 */
	public DefaultMySQL(com.mysql.jdbc.jdbc2.optional.MysqlDataSource source) {
		// TODO - implement DefaultMySQL.DefaultMySQL
		throw new UnsupportedOperationException();
	}

	@Override
	protected final void connect() {
		// TODO - implement DefaultMySQL.connect
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param config
	 */
	@Override
	protected void connect(org.sqlite.SQLiteConfig config) {
		// TODO - implement DefaultMySQL.connect
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param dataSource
	 */
	@Override
	protected final void connect(com.mysql.jdbc.jdbc2.optional.MysqlDataSource dataSource) {
		// TODO - implement DefaultMySQL.connect
		throw new UnsupportedOperationException();
	}

}