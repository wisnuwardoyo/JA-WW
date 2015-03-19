/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wisnu.cabglass.sqlite;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Objects;
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

    protected abstract void connect();

    protected abstract void connect(SQLiteConfig config);

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
            System.out.println("Commit DB : True");
            return true;
        } catch (SQLException ex) {
            System.out.println("Commit DB : False");
            Logger.getLogger(SQLiteDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean rollBack() {
        try {
            connection.rollback();
            System.out.println("Connection Rollback : True");
            return true;
        } catch (SQLException ex) {
            System.out.println("Connection Rollback : False");
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

    public boolean disconnect() {
        try {
            connection.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(SQLiteDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean closeStatement(Statement statement) {
        try {
            statement.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(SQLiteDatabase.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean closeStatement(PreparedStatement statement) {
        try {
            statement.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(SQLiteDatabase.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.DBName);
        hash = 97 * hash + Objects.hashCode(this.connection);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final SQLiteDatabase other = (SQLiteDatabase) obj;
        if (!Objects.equals(this.DBName, other.DBName)) {
            return false;
        }
        return Objects.equals(this.connection, other.connection);
    }

    public String getDBName() {
        return DBName;
    }

    public Connection getConnection() {
        return connection;
    }

}
