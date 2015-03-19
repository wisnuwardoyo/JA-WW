/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wisnu.cabglass.sqlite.impl;

import com.wisnu.cabglass.sqlite.SQLiteDatabase;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.sqlite.SQLiteConfig;

public class DefaultSQLite extends SQLiteDatabase {

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
                this.connection = DriverManager.getConnection("jdbc:sqlite:" + DBName);
            } catch (SQLException ex) {
                Logger.getLogger(DefaultSQLite.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    protected final void connect(SQLiteConfig config) {
        if (DBName != null) {
            try {
                this.connection = DriverManager.getConnection("jdbc:sqlite:" + DBName, config.toProperties());
            } catch (SQLException ex) {
                Logger.getLogger(DefaultSQLite.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static void main(String[] args) {

    }    

}
