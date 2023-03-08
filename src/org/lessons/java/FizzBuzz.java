package org.lessons.java;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {

        int numberOfCycles;
        boolean invalidInput = true;
        Scanner scan = new Scanner(System.in);

        while (invalidInput) {

            System.out.print("Inserisci il numero di cicli (tra 1 e 1000): ");
            numberOfCycles = Integer.parseInt(scan.nextLine());


            if (numberOfCycles >= 1 && numberOfCycles <= 1000) {
                invalidInput = false;
                for (int i = 1; i <= numberOfCycles; i++) {
                    if ((i % 3 == 0) || (i % 5 == 0)) {
                        if (i % 3 == 0) {
                            System.out.println("Fizz");
                        }
                        if (i % 5 == 0) {
                            System.out.println("Buzz");
                        }
                    } else {
                        System.out.println(i);
                    }
                }
            } else {
                System.out.println("*** Inserire un input valido ***");
            }


        }

        scan.close();
    }
}
