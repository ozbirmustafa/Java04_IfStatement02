package day05ifstatement;

import java.util.Scanner;

public class IfStatement02 {

    public static void main(String[] args) {

        //ex: kullanıcı gün numarasını girsin kod gün ismini yazsın
        //kod dünyasında gün pazar(1)dan başlar

        Scanner input = new Scanner(System.in);

        System.out.println("Gün Numarasını Giriniz");

        byte dayNo = input.nextByte();

        if (dayNo == 1) {
            System.out.println("Sunday");
        } else if (dayNo == 2) {
            System.out.println("Monday");
        } else if (dayNo == 3) {
            System.out.println("Tuesday");
        } else if (dayNo == 4) {
            System.out.println("Wednesday");
        } else if (dayNo == 5) {
            System.out.println("Thursday");
        } else if (dayNo == 6) {
            System.out.println("Friday");
        } else if (dayNo == 7) {
            System.out.println("Saturday");
        } else {
            System.out.println("lütfen geçerli gün numarası giriniz. (Geçerli numaralar: 1,2,3,4,5,6,7 den birisidir)");

        }
    }
}
