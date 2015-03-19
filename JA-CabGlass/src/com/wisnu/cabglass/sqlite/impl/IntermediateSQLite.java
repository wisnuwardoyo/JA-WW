/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wisnu.cabglass.sqlite.impl;

import com.wisnu.cabglass.sqlite.SQLiteDatabase;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.sqlite.SQLiteConfig;

public class IntermediateSQLite extends SQLiteDatabase {

    public IntermediateSQLite(String dbName) {
        this.DBName = dbName;
        connect();
    }

    public IntermediateSQLite(String dbName, SQLiteConfig config) {
        this.DBName = dbName;
        connect(config);
    }

    public boolean runStatementQuery(String query) {
        synchronized (this.connection) {
            setAutoCommit(false);
            Statement statement = null;
            try {
                statement = this.connection.createStatement();
                statement.executeUpdate(query);
                if (commit()) {
                    return true;
                }
            } catch (SQLException ex) {
                rollBack();
                Logger.getLogger(IntermediateSQLite.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            } finally {
                if (statement != null) {
                    closeStatement(statement);
                }
            }
            setAutoCommit(true);
        }
        return false;
    }

    @Override
    protected final void connect() {
        if (DBName != null) {
            try {
                this.connection = DriverManager.getConnection("jdbc:sqlite:" + DBName);
            } catch (SQLException ex) {
                Logger.getLogger(IntermediateSQLite.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    protected final void connect(SQLiteConfig config) {
        if (DBName != null) {
            try {
                this.connection = DriverManager.getConnection("jdbc:sqlite:" + DBName, config.toProperties());
            } catch (SQLException ex) {
                Logger.getLogger(IntermediateSQLite.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static void main(String[] args) {
        IntermediateSQLite sqlite = new IntermediateSQLite("Test.db");
        String CREATETABLE = "CREATE TABLE IF NOT EXISTS `DATA`( `ID` INTEGER NOT NULL PRIMARY KEY autoincrement, "
                + "`ID_DEVICE` INTEGER,`NAME` VARCHAR(255), `STATUS` VARCHAR(4), `TIME_UP` DATETIME DEFAULT CURRENT_TIMESTAMP, `ISSEND` VARCHAR(1)"
                + " )";
        sqlite.runStatementQuery(CREATETABLE);
    }

}
