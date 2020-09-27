package javaapp1;
import java.util.Scanner;

public class javaApp4 {
     public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        int sayi1, sayi2, islem, islemtipi;
        System.out.print("işlem tipi seçiniz\n"
                + "1.Toplama\n"
                + "2.Çıkarma\n"
                + "3.Bölme\n"
                + "4.Çarpma ");
        islemtipi = girdi.nextInt();
        
        switch (islemtipi){
            case 1:
                System.out.print("Sayı 1 giriniz: ");
                sayi1 = girdi.nextInt();
                System.out.print("Sayı 2 giriniz: ");
                sayi2 = girdi.nextInt();
                islem = sayi1 + sayi2;
                System.out.print("İşlem sonucu: " + islem + "\n");                
                break;
            case 2:
                System.out.print("Sayı 1 giriniz: ");
                sayi1 = girdi.nextInt();
                System.out.print("Sayı 2 giriniz: ");
                sayi2 = girdi.nextInt();
                islem = sayi1 - sayi2;
                System.out.print("İşlem sonucu: " + islem + "\n"); 
                break;
            case 3:
                System.out.print("Sayı 1 giriniz: ");
                sayi1 = girdi.nextInt();
                System.out.print("Sayı 2 giriniz: ");
                sayi2 = girdi.nextInt();
                islem = sayi1 / sayi2;
                System.out.print("İşlem sonucu: " + islem + "\n"); 
                break;
            case 4:
                System.out.print("Sayı 1 giriniz: ");
                sayi1 = girdi.nextInt();
                System.out.print("Sayı 2 giriniz: ");
                sayi2 = girdi.nextInt();
                islem = sayi1 * sayi2;
                System.out.print("İşlem sonucu: " + islem + "\n"); 
                break;
        }
    }
}
