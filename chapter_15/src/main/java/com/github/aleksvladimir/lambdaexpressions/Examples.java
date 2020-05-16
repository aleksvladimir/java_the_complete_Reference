package com.github.aleksvladimir.lambdaexpressions;

interface MyNumber {
    double getValue();
}

public class Examples {
    static public void main(String[] arg) {
        // Create a reference to a MyNumber instance.
        MyNumber myNum;
        // Use a lambda in an assignment context.
        myNum = () -> 123.45;
        /*
        When a lambda expression occurs in a target type context, an instance of a class is
        automatically created that implements the functional interface, with the lambda expression
        defining the behavior of the abstract method declared by the functional interface.
         */
        // Call getValue(), which is implemented by the previously assigned
        // lambda expression.
        System.out.println(myNum.getValue());
    }
}
