package org.math;

public class Main {
    public static void main(String[] args) {
        int temp = 32;
        if (temp > 30){
            System.out.println("It's a hot day");
            System.out.println("Drink plenty of water");
        }
        else if (temp > 20)
            System.out.println("It's a nice day");
        // braces are required if we have multiple statements;
        else
            System.out.println("It's cold");

        //SIMPLIFYING IF STATEMENTS:

        int income = 120_000;
        boolean hasHighIncome = false;
        if (income > 100_000)
            hasHighIncome = true;
        else
            hasHighIncome = false;

        //Instead of all the above code
        hasHighIncome = (income > 100_000);

        /*
         1-initialize the boolean var;
         2-if you want to declare a var inside an if ST add the braces;
         3-you can't declare a variable inside if ST and use it outside;
         */

        //THE TERNARY OPERATOR:
         String className = "Economy";
         if (income > 100_000)
             className = "First";
       //Instead of the above code
        className = income > 100_000 ? "First" : "Economy"; // In this case you haven't to initialize this var
    }
}