/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wisnu.cabglass.database.impl;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import com.wisnu.cabglass.database.Database;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.sqlite.SQLiteConfig;

/**
 * 
 * @author Wisnu Wardoyo
 */
public class DefaultMySQL extends Database {

    private String ADDRESS;
    private String PORT;
    private String USER;
    private String PASSWORD;

    public DefaultMySQL(String ADDRESS, String PORT, String USER, String PASSWORD, String DBNAME) {
        this.ADDRESS = ADDRESS;
        this.PORT = PORT;
        this.USER = USER;
        this.PASSWORD = PASSWORD;
        this.DBName = DBNAME;

        connect();
    }

    public DefaultMySQL(MysqlDataSource source) {
        connect(source);
    }

    @Override
    protected final void connect() {
        if (USER != null && PASSWORD != null && ADDRESS != null && PORT != null) {
            try {
                MysqlDataSource dataSource = new MysqlDataSource();
                dataSource.setURL("jdbc:mysql://" + ADDRESS + ":" + PORT + "/" + DBName + "");
                dataSource.setUser(USER);
                dataSource.setPassword(PASSWORD);
                connection = dataSource.getConnection();

            } catch (SQLException ex) {
                Logger.getLogger(DefaultMySQL.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    protected void connect(SQLiteConfig config) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected final void connect(MysqlDataSource dataSource) {
        try {
            this.connection = dataSource.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(DefaultMySQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
