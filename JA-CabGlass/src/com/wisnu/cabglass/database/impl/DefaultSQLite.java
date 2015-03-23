/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wisnu.cabglass.database.impl;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import com.wisnu.cabglass.database.Database;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.sqlite.SQLiteConfig;

public class DefaultSQLite extends Database {

    public DefaultSQLite(String dbName) {
        this.DBName = dbName;
        connect();
    }

    public DefaultSQLite(String dbName, SQLiteConfig config) {
        this.DBName = dbName;
        connect(config);
    }

    @Override
    protected final void connect() {
        if (DBName != null) {
            try {
                Class.forName("org.sqlite.JDBC");
                this.connection = DriverManager.getConnection("jdbc:sqlite:" + DBName);
            } catch (SQLException ex) {
                Logger.getLogger(DefaultSQLite.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(DefaultSQLite.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    protected final void connect(SQLiteConfig config) {
        if (DBName != null) {
            try {
                Class.forName("org.sqlite.JDBC");
                this.connection = DriverManager.getConnection("jdbc:sqlite:" + DBName, config.toProperties());
            } catch (SQLException ex) {
                Logger.getLogger(DefaultSQLite.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(DefaultSQLite.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    protected void connect(MysqlDataSource dataSource) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void main(String[] args) {

    }

}
