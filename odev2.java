package Baslangic;
import java.util.Scanner;
public class odev2 {
    public static void main(String[] args) {
        int x;
        double kdv=1.18, kdv2=1.08;
        Scanner inp=new Scanner(System.in);

        System.out.println("tutarı giriniz :");
        x=inp.nextInt();
        double toplamkdv=(1000>x)? x*kdv : x*kdv2;
        System.out.println(toplamkdv);


    }
}
