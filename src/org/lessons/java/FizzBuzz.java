package org.lessons.java;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {

        int numberOfCycles;

        Scanner scan = new Scanner(System.in);
        
        System.out.print("Inserisci il numero di cicli: ");
        numberOfCycles = Integer.parseInt(scan.nextLine());

        scan.close();

        for (int i = 0; i < numberOfCycles; i++) {
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

    }
}
