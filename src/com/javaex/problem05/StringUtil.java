package com.javaex.problem05;

public class StringUtil {
    
    public static String concatString(String[] strArray){
        String result ="";
        for(String s : strArray){
            result = result+s;
        }
        
        return result;
    }

}
