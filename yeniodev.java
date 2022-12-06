package Baslangic;
import java.util.Scanner;
public class yeniodev {
    public static void main(String[] args) {
        double kilo, boy, vucutKitleEndeksi;
        Scanner inp=new Scanner(System.in);
        System.out.print("Lütfen boyunuzu metre cinsinden giriniz :");
        boy=inp.nextDouble();
        System.out.print("Lütfen kilonuzu kg cinsinden giriniz : " );
        kilo=inp.nextDouble();
        vucutKitleEndeksi=kilo/(boy*boy);
        System.out.println(vucutKitleEndeksi);
    }
}
