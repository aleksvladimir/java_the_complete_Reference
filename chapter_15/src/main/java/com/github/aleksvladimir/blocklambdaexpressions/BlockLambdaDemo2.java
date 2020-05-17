package com.github.aleksvladimir.blocklambdaexpressions;

/*
Notice that the charAt( )
method is called on str. This is legal because of the inference that str is of type String.
 */

interface StringFunc {
    String func(String n);
}

public class BlockLambdaDemo2 {
    static public void main(String[] arg) {
        StringFunc reverse = s -> {
            String result = "";
            for (int i = s.length() - 1; i >= 0; i--) {
                result += s.charAt(i);
            }
            return result;
        };
        System.out.println("Lambda reversed is " + reverse.func("Lambda"));
        System.out.println("Expression reversed is " + reverse.func("Expression"));
    }
}
