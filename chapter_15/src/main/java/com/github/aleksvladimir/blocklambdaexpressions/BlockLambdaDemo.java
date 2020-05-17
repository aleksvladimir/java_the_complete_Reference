package com.github.aleksvladimir.blocklambdaexpressions;

interface NumericFunc {
    int func(int n);
}

public class BlockLambdaDemo {
    static public void main(String[] arg) {
        NumericFunc factorial = n -> {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result = i * result;
            }
            return result;
        };
        System.out.println("The factorial of 3 is " + factorial.func(3));
        System.out.println("The factorial of 5 is " + factorial.func(5));
    }
}
