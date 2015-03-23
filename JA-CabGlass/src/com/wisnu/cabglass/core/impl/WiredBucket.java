/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wisnu.cabglass.core.impl;

import com.wisnu.cabglass.core.Bucket;
import com.wisnu.cabglass.database.Database;
import java.util.Map;
import java.util.Set;

public class WiredBucket extends Bucket {

    public static int size() {
        return CHUMBUCKET.size();
    }

    public static boolean isEmpty() {
        return CHUMBUCKET.isEmpty();
    }

    public static Object get(String key) {
        synchronized (CHUMBUCKET) {
            return CHUMBUCKET.get(key);
        }
    }

    public static Object register(String key, Database value) {
        synchronized (CHUMBUCKET) {
            return CHUMBUCKET.put(key, value);
        }
    }

    public static void registerAll(Map<? extends String, ? extends Database> m) {
        synchronized (CHUMBUCKET) {
            CHUMBUCKET.putAll(m);
        }
    }

    public static Object erase(String key) {
        synchronized (CHUMBUCKET) {
            return CHUMBUCKET.remove(key);
        }
    }

    public static void eraseAll() {
        synchronized (CHUMBUCKET) {
            CHUMBUCKET.clear();
        }
    }

    public static boolean containsValue(Database value) {
        return CHUMBUCKET.containsValue(value);
    }

    public static Set<Map.Entry<String, Database>> entrySet() {
        synchronized (CHUMBUCKET) {
            return CHUMBUCKET.entrySet();
        }
    }

    public static Object registerIfAbsent(String key, Database value) {
        synchronized (CHUMBUCKET) {
            return CHUMBUCKET.putIfAbsent(key, value);
        }
    }

    public static Object replace(String key, Database value) {
        synchronized (CHUMBUCKET) {
            return CHUMBUCKET.replace(key, value);
        }
    }

}
