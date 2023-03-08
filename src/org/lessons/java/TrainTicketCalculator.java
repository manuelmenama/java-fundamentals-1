package org.lessons.java;

import java.util.Scanner;

public class TrainTicketCalculator {
    public static void main(String[] args) {
        double pricePerKm = 0.21;
        int inputKm;
        int inputAge;
        Scanner scan = new Scanner(System.in);

        System.out.print("Chilometri da percorrere: ");
        inputKm = Integer.parseInt(scan.nextLine());

        System.out.println("*************");

        System.out.print("Inserisci l'età: ");
        inputAge = Integer.parseInt(scan.nextLine());

        System.out.println("*************");
        System.out.println(inputAge);
        System.out.println(inputKm);

    }
}
