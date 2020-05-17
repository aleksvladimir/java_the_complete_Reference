package com.github.aleksvladimir.lambdaexpressions;

/*
Here is an important point about multiple parameters in a lambda expression: If you
need to explicitly declare the type of a parameter, then all of the parameters must have
declared types.
 */
interface NumericTest2 {
    boolean test(int n, int d);
}

public class LambdaDemo3 {
    static public void main(String[] arg) {
        NumericTest2 isFactor = (n, d) -> (n % d) == 0;

        if (isFactor.test(10, 2)) {
            System.out.println("2 is a factor of 10");
        }

        if (!isFactor.test(10, 3)) {
            System.out.println("3 is not a factor of 10");
        }
    }
}
