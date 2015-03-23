/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wisnu.cabglass.dao;

import com.wisnu.cabglass.exception.DaoException;
import java.sql.ResultSet;

/**
 *
 * @author Wisnu Wardoyo
 */
public interface CabGlassDao {

    public Object insert(Object entity) throws DaoException;

    public Object update(Object entity) throws DaoException;

    public Object delete(Object entity) throws DaoException;

    public ResultSet select() throws DaoException;

    public ResultSet select(Object entity) throws DaoException;

}
