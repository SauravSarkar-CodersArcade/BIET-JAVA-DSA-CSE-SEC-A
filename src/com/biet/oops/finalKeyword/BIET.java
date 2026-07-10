package com.biet.oops.finalKeyword;
public class BIET {
    final int x;
    static final String s;
    // If a variable is final & not assigned any value,
    // where is the value assigned? => Constructor
    // If a variable is static, final & not assigned any value,
    // where is the value assigned? => static initializer block
    BIET(){
        x = 200;
    }
    static {
        s = "BIET";
    }
}
