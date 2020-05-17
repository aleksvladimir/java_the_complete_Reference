package com.github.aleksvladimir.lambdaexpressions;
/*
Notice that the type of n is not specified. Rather, its type is inferred from the context.
In this case, its type is inferred from the parameter type of test( ) as
defined by the NumericTest interface, which is int.

This program demonstrates another important point about lambda expressions: A
functional interface reference can be used to execute any lambda expression that is
compatible with it.

 Notice that the program defines two different lambda expressions that
are compatible with the test( ) method of the functional interface NumericTest. The first,
called isEven, determines if a value is even. The second, called isNonNeg, checks if a value
is non-negative. In each case, the value of the parameter n is tested. Because each lambda
expression is compatible with test( ), each can be executed through a NumericTest reference.
 */

// Demonstrate a lambda expression that takes a parameter.

// Another functional interface.
interface NumericTest {
    boolean test(int n);
}

class LambdaDemo2 {
    public static void main(String[] arg) {
        // A lambda expression that tests if a number is even.
        NumericTest isEven = (n) -> (n % 2) == 0;
        if (isEven.test(10)) {
            System.out.println("10 is even");
        }
        if (!isEven.test(9)) {
            System.out.println("9 is not even");
        }
        // Now, use a lambda expression that tests if a number
        // is non-negative.
        NumericTest isNonNeg = (n) -> n >= 0;
        if (isNonNeg.test(1)) {
            System.out.println("1 is non-negative");
        }
        if (!isNonNeg.test(-1)) {
            System.out.println("-1 is negative");
        }
    }
}
