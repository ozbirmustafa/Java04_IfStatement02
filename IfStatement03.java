package day05ifstatement;


import java.util.Scanner;

public class IfStatement03 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Bir gün ismi giriniz");
        String gun = input.next();

        /*
      Iki tane String'in birbirine esit olup olmadigini anlamak icin "==" degil, "equals()" kullaniniz.
      Iki tane String'in birbirine esit olup olmadigini kontrol etmek icin iki tane method kullanilabilir
        i)equals() ==> Buyuk harf ve kucuk harfi onemser. "A" ile "a" farklidir
        ii)equalsIgnoreCase() ==> Buyuk harf kucuk harfi onemsemez. "A" ile "a" aynidir.
         */

//        if (gun.equalsIgnoreCase("Pazar")) {System.out.println("Hafta Sonu");}
//        else if (gun.equalsIgnoreCase("Pazartesi")) {System.out.println("Hafta İçi");}
//        else if (gun.equalsIgnoreCase("Salı")) {System.out.println("Hafta İçi");}
//        else if (gun.equalsIgnoreCase("Çarşamba")) {System.out.println("Hafta İçi");}
//        else if (gun.equalsIgnoreCase("Perşembe")) {System.out.println("Hafta İçi");}
//        else if (gun.equalsIgnoreCase("Cuma")) {System.out.println("Hafta İçi");}
//        else if (gun.equalsIgnoreCase("Cumartesi")) {System.out.println("Hafta İçi");}
//        else {System.out.println("Lütfen Geçerli Bir Gün İsmi Gİriniz");}

        //2.Yol

//        if (gun.equalsIgnoreCase("Pazar") || gun.equalsIgnoreCase("Cumartesi")){
//            System.out.println("Hafta Sonu");
//        } else if (gun.equalsIgnoreCase("Pazartesi") ||
//                   gun.equalsIgnoreCase("Salı") ||
//                   gun.equalsIgnoreCase("Çarşamba") ||
//                   gun.equalsIgnoreCase("Perşembe") ||
//                   gun.equalsIgnoreCase("Cuma")) {
//            System.out.println("Hafta İçi");
//
//        }else {
//            System.out.println("Geçerli bir gün sayısı giriniz");
//        }

        //3.Yol
        boolean haftaSonu = gun.equalsIgnoreCase("Pazar") || gun.equalsIgnoreCase("Cumartesi");
        boolean haftaIci =  gun.equalsIgnoreCase("Pazartesi") ||
                            gun.equalsIgnoreCase("Salı") ||
                            gun.equalsIgnoreCase("Çarşamba") ||
                            gun.equalsIgnoreCase("Perşembe") ||
                            gun.equalsIgnoreCase("Cuma");

        if (haftaSonu){
            System.out.println("Hafta Sonu");
        } else if (haftaIci) {
            System.out.println("Hafta İçi");

        }else {
            System.out.println("Geçerli bir gün sayısı giriniz");
        }

        //Clean kod için parantez içleri kısa ve basit olmalı
        //tekrar kod kullanmaktan kaçınılmalıdır.


    }


}

