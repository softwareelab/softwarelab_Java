package javaapp1;
import java.util.Scanner;

public class JavaApp3 {
     public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.print("ilk sayıyı giriniz: ");
        int sayi1 = girdi.nextInt();
        System.out.print("ikinci sayıyı giriniz: ");
        int sayi2 = girdi.nextInt();
        int toplam = sayi1 + sayi2;
        System.out.print("Toplam: " + toplam + "\n");
    }
}

