package org.lessons.java;

import java.util.Scanner;

public class TrainTicketCalculator {
    public static void main(String[] args) {
        double pricePerKm = 0.21;
        double youngDiscount = 0.2;
        double silverDiscount = 0.4;

        int inputKm;
        int inputAge;
        Scanner scan = new Scanner(System.in);

        System.out.print("Inserisci i chilometri da percorrere: ");
        inputKm = Integer.parseInt(scan.nextLine());

        System.out.println("*************");

        System.out.print("Inserisci l'età: ");
        inputAge = Integer.parseInt(scan.nextLine());

        System.out.println("*************");

        double totalPrice = (double) inputKm * pricePerKm;

        System.out.println("Prezzo intero: " + totalPrice);

        System.out.println("*************");

        if (inputAge >= 65) {
            totalPrice = totalPrice - totalPrice * silverDiscount;
            System.out.print("Prezzo per gli over 65: " + totalPrice);
        } else if (inputAge < 18) {
            totalPrice = totalPrice - totalPrice * youngDiscount;
            System.out.println("Prezzo per i minorenni: " + totalPrice);
        } else {
            System.out.println("Nessuno sconto applicato");
        }


    }
}
