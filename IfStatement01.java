package day05ifstatement;

import java.util.Scanner;

public class IfStatement01 {

    public static void main(String[] args) {
        //kullanıcdan alınına sayınan tek mi çift mi olduğunu ekrana yazan kodu yazınız

        Scanner input = new Scanner(System.in);

        System.out.println("bir sayı giriniz");

        int s = input.nextInt();

        //1. Yol
        if (s % 2 == 0) {
            System.out.println("Çift Sayı");
        }

        if (s % 2 != 0) { // " != " eşit değildir demek

            System.out.println("Tek Sayı");
        }

        //2. Yol

        if (s % 2 == 0) {
            System.out.println("Çift Sayı");
        } else {
            System.out.println("Tek Sayı");
        }


        //ex: bir sayının negatif pozitif veya notr olduğunu söyleyen kodu yazınız

        System.out.println("Bir Sayıyı Giriniz");

        double d1 = input.nextDouble();

        if (d1 > 0) {
            System.out.println("Pozitif");
        } else if (d1 == 0) {
            System.out.println("Notr");
        } else {
            System.out.println("Negatif");
        }

    }

}