package com.wisnu.cabglass.database;

/**
 * @author Wisnu Wardoyo
 */
public abstract class Database {

	protected String DBName = new String();
	protected java.sql.Connection connection;

	public String getDBName() {
		return this.DBName;
	}

	public java.sql.Connection getConnection() {
		return this.connection;
	}

	/**
	 * <p>
	 * Initialize connection as default without any configuration
	 * </p>
	 * @see #connect(org.sqlite.SQLiteConfig)
	 */
	protected abstract void connect();

	/**
	 * 
	 * @param config
	 */
	protected abstract void connect(org.sqlite.SQLiteConfig config);

	/**
	 * 
	 * @param dataSource
	 */
	protected abstract void connect(com.mysql.jdbc.jdbc2.optional.MysqlDataSource dataSource);

	public boolean commit() {
		// TODO - implement Database.commit
		throw new UnsupportedOperationException();
	}

	public boolean rollBack() {
		// TODO - implement Database.rollBack
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param auto
	 */
	public boolean setAutoCommit(boolean auto) {
		// TODO - implement Database.setAutoCommit
		throw new UnsupportedOperationException();
	}

	public boolean disconnect() {
		// TODO - implement Database.disconnect
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param statement
	 */
	public boolean closeStatement(java.sql.Statement statement) {
		// TODO - implement Database.closeStatement
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param statement
	 */
	public boolean closeStatement(java.sql.PreparedStatement statement) {
		// TODO - implement Database.closeStatement
		throw new UnsupportedOperationException();
	}

	@Override
	public int hashCode() {
		// TODO - implement Database.hashCode
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param obj
	 */
	@Override
	public boolean equals(Object obj) {
		// TODO - implement Database.equals
		throw new UnsupportedOperationException();
	}

}