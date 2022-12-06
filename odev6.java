package Baslangic;
import java.util.Scanner;
public class odev6 {
    public static void main(String[] args) {


        int r;
        double pi=3.14, alan,aci,y;
        Scanner inp = new Scanner(System.in);
        System.out.print("r değerini giriniz :");
        r=inp.nextInt();
        System.out.print("açıyı giriniz :");
        aci=inp.nextInt();
        alan=pi*r*r;
        y=(alan*aci)/360;

        System.out.println("alan değeriniz: " +y);
    }
}
