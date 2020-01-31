package com.techelevator;

public class NonStart {

    /*
     Given 2 strings, return their concatenation, except omit the first char of each. The strings will
     be at least length 1.
     GetPartialString("Hello", "There") → "ellohere"
     GetPartialString("java", "code") → "avaode"
     GetPartialString("shotl", "java") → "hotlava"
     */
    public String getPartialString(String a, String b) {
        String newSubString = a.substring(1).concat(b.substring(1));
    	if (a.length() == 1) {
            return b.substring(1);
        } else if (b.length() == 1) {
            return a.substring(1);
        } else {
            return newSubString;
        }
    }
}
