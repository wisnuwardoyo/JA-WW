/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wisnu.cabglass.core;

import java.util.Map;
import java.util.Set;

/**
 *
 * @author Wisnu Wardoyo
 */
public class Cable extends Glass {

    public static int size() {
        return GLASS.size();
    }

    public static boolean isEmpty() {
        return GLASS.isEmpty();
    }

    public static Object get(String key) {
        synchronized (GLASS) {
            return GLASS.get(key);
        }
    }

    public static Object register(String key, Object value) {
        synchronized (GLASS) {
            return GLASS.put(key, value);
        }
    }

    public static void registerAll(Map<? extends String, ? extends Object> m) {
        synchronized (GLASS) {
            GLASS.putAll(m);
        }
    }

    public static Object erase(String key) {
        synchronized (GLASS) {
            return GLASS.remove(key);
        }
    }

    public static void eraseAll() {
        synchronized (GLASS) {
            GLASS.clear();
        }
    }

    public static boolean containsValue(Object value) {
        return GLASS.containsValue(value);
    }

    public static Set<Map.Entry<String, Object>> entrySet() {
        synchronized (GLASS) {
            return GLASS.entrySet();
        }
    }

    public static Object registerIfAbsent(String key, Object value) {
        synchronized (GLASS) {
            return GLASS.putIfAbsent(key, value);
        }
    }

    public static Object replace(String key, Object value) {
        synchronized (GLASS) {
            return GLASS.replace(key, value);
        }
    }

}
