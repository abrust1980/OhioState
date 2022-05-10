package com.lis;

public class OhioState {
    //    Write a program, in a language of your choice, that prints the numbers from 1 to 100.
//    But for multiples of three print “Ohio” instead of the number
//    and for the multiples of five print “State”.
//    For numbers which are multiples of both three and five print “OhioState”.
    public static void main(String[] args) {
        printOhioState(100);
        //Entering "100" for the argument allows the program to run from 1 to 100
    }

    public static void printOhioState(int n){

        for (int i = 1; i <= n; i++) {
            //Starting at 1 and stopping at 100, this code will loop through each value.
            if ((i % 3 == 0) && (i % 5 == 0)) {
                //If a number is evenly divisible by both 3 and 5, "OhioState" will be printed to the terminal.
                System.out.println("OhioState");
            } else if (i % 3 == 0) {
                //If a number is not divisible by both 3 and 5 but is divisible by 3, "Ohio" will be printed.
                System.out.println("Ohio");
            } else if (i % 5 == 0) {
                //If a number is not divisible by both 3 and 5 but is divisible by 5, "State" will be printed.
                System.out.println("State");
            } else {
                //If a number is not divisible by 3 or 5, the number is printed.
                System.out.println(i);
            }

            //Since it was requested for this program to cover simply the numbers 1 to 100, I did not incorporate
            //efforts to check for nulls, negative numbers, non-integer data types, or any other edge cases. If I
            //was unable to control the value of n, these measures would need to be added.

        }


    }
}
