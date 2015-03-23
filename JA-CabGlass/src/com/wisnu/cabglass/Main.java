/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wisnu.cabglass;

import com.wisnu.cabglass.dao.CabGlassDao;
import com.wisnu.cabglass.database.impl.IntermediateSQLite;
import com.wisnu.cabglass.exception.DaoException;
import java.sql.Connection;
import java.sql.ResultSet;

/**
 *
 * @author Wisnu Wardoyo
 */
public class Main extends IntermediateSQLite implements CabGlassDao {

    public Main(Connection connection) {
        super(connection);
    }

    @Override
    public Object insert(Object entity) throws DaoException {
        return null;
    }

    @Override
    public Object update(Object entity) throws DaoException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object delete(Object entity) throws DaoException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResultSet select() throws DaoException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResultSet select(Object entity) throws DaoException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
