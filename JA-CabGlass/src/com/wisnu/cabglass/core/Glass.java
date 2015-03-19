/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wisnu.cabglass.core;

import com.wisnu.cabglass.sqlite.SQLiteDatabase;
import java.util.HashMap;

/**
 *
 * @author Wisnu Wardoyo
 */
public abstract class Glass {

    protected static final HashMap<String, Object> GLASS = new HashMap<>();
    
    protected static final HashMap<String, SQLiteDatabase> WINEGLASS = new HashMap<>();
    
    
}
