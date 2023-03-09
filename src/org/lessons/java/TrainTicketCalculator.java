package org.lessons.java;

import java.text.DecimalFormat;
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

        scan.close();

        System.out.println("*************");

        double totalPrice = (double) inputKm * pricePerKm;

        String euroPattern = "0.00";
        DecimalFormat decimalFormat = new DecimalFormat(euroPattern);

        String format;
        format = decimalFormat.format(totalPrice);

        System.out.println("Prezzo intero: " + format + " €");

        System.out.println("*************");


        if (inputAge >= 65) {
            totalPrice = totalPrice - totalPrice * silverDiscount;
            format = decimalFormat.format(totalPrice);
            System.out.print("Prezzo per gli over 65: " + format + " €");
        } else if (inputAge < 18) {
            totalPrice = totalPrice - totalPrice * youngDiscount;
            format = decimalFormat.format(totalPrice);
            System.out.println("Prezzo per i minorenni: " + format + " €");
        } else {
            System.out.println("Nessuno sconto applicato");
        }


    }
}
