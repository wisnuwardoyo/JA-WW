/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wisnu.cabglass.sqlite.impl;

import com.wisnu.cabglass.sqlite.SQLiteDatabase;
import org.sqlite.SQLiteConfig;

public class DefaultSQLite extends SQLiteDatabase {

    public DefaultSQLite(String dbName) {
        System.out.println("Default");
    }

    @Override
    protected void connect(String dbname) {
        if (DBName != null) {

        }
    }

    @Override
    protected void connect(String dbname, SQLiteConfig config) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void main(String[] args) {
        
    }

}
