package ConditionalExample;

import java.util.Scanner;

public class ConditionalExample {

    // compile javac ConditinalExample.java
    // run java ConditionalExample SANTHYA
    public static void main(String args[]) {

        System.out.println("Enter the number to check for conditional expression");

        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();

        // If else-if and else statement
        if (num1 > 10) {
            System.out.println("Number is greater than 10");
        }
        else if (num1 < 10) {
            System.out.println("Number is less than 10");
        }
        else {
            System.out.println("Number is 10");
        }

        System.out.println("\n");


        // While statements [gets executed atleast once]
        int no_of_beers = 10;
        int beer_count = 1;
        while (no_of_beers != 0) {
            System.out.printf("I have %d beers to drink!", beer_count);
            System.out.println("\n");
            beer_count++;
            no_of_beers--;
        }

        System.out.println("\n");

        // For loop
        int myAge = 23;
        int yob = 1996;
        for(int i = 1; i<myAge; i++) {
            System.out.printf("I was %d years old in the year %d", i, yob);
            System.out.println("\n");
            yob++;
        }
    }
}
