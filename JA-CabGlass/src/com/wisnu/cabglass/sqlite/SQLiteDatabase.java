/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wisnu.cabglass.sqlite;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.sqlite.SQLiteConfig;

/**
 *
 * @author Wisnu Wardoyo
 */
public abstract class SQLiteDatabase {

    protected String DBName = new String();
    protected Connection connection;
    
    protected abstract void connect(String dbname);

    protected abstract void connect(String dbname, SQLiteConfig config);

    public SQLiteDatabase() {
        try {
            Class.forName("org.sqlite.JDBC");              
        } catch (ClassNotFoundException ex) {
            System.out.println("Class Not Found Exception : " + ex.getMessage());
            Logger.getLogger(SQLiteDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean commit() {
        try {
            connection.commit();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(SQLiteDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean rollBack() {
        try {
            connection.rollback();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(SQLiteDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean setAutoCommit(boolean auto) {
        try {
            connection.setAutoCommit(auto);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(SQLiteDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public boolean disconnect(){
        try {
            connection.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(SQLiteDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
}
