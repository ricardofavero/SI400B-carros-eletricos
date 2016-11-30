/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.si400.recargacarro.view;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author Acer
 */
public final class Names {
        private static Locale local;
        private static ResourceBundle bundle;

    public static void setLanguage(String language){
        local = new Locale(language);
        bundle = ResourceBundle.getBundle("com.si400.recargacarro.resources.ui", local);
    }
    
    public static String get(String object_name){
        return bundle.getString(object_name);
    }    
    
}
