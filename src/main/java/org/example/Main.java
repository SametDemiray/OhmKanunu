package org.example;

import java.util.Scanner;
// Bir iletkenin direnciyle içinden geçen akımı girildiğinde uçlarındaki gerilimi hesaplayan program
public class Main {
    public static void main(String[] args) {

        double direnc;
        double akim;
        double gerilim;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Direnç değerini giriniz (ohm): ");
        direnc = scanner.nextDouble();

        System.out.print("Akım değerini giriniz (amper): ");
        akim = scanner.nextDouble();

        // Gerilimi Ohm'un Yasası'na göre hesaplıyoruz: V = IR
        gerilim = direnc * akim;

        System.out.println("\nUçlarındaki Gerilim: " + gerilim + " volt.");
    }
}