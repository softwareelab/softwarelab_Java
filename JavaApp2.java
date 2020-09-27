package javaapp1;
import java.util.Scanner;

public class JavaApp2 {
     public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.print("Adınızı giriniz: ");
        String ad = girdi.nextLine();
        System.out.print("Adınız: " + ad +"\n");
    } 
}
