package com.wisnu.cabglass.database.impl;

import com.wisnu.cabglass.database.*;

/**
 * @author Wisnu Wardoyo
 */
public class IntermediateMySQL extends Database {

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
	public IntermediateMySQL(String ADDRESS, String PORT, String USER, String PASSWORD, String DBNAME) {
		// TODO - implement IntermediateMySQL.IntermediateMySQL
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param source
	 */
	public IntermediateMySQL(com.mysql.jdbc.jdbc2.optional.MysqlDataSource source) {
		// TODO - implement IntermediateMySQL.IntermediateMySQL
		throw new UnsupportedOperationException();
	}

	@Override
	protected final void connect() {
		// TODO - implement IntermediateMySQL.connect
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param config
	 */
	@Override
	protected void connect(org.sqlite.SQLiteConfig config) {
		// TODO - implement IntermediateMySQL.connect
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param dataSource
	 */
	@Override
	protected final void connect(com.mysql.jdbc.jdbc2.optional.MysqlDataSource dataSource) {
		// TODO - implement IntermediateMySQL.connect
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param query
	 */
	public boolean executeUpdateQuery(String query) {
		// TODO - implement IntermediateMySQL.executeUpdateQuery
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param query
	 */
	public java.sql.ResultSet executeQuery(String query) {
		// TODO - implement IntermediateMySQL.executeQuery
		throw new UnsupportedOperationException();
	}

}