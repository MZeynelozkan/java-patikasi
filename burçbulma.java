package Baslangic;
import java.util.Scanner;
public class burçbulma {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int ay, gun;
        System.out.print("hangi ayda doğdunuz :");
        ay= inp.nextInt();
        System.out.print("hangi gün doğdunuz :");
        gun= inp.nextInt();
        if (ay==1) {
            if (gun>=1 && gun<=31){
                if (gun<21) {
                    System.out.println("burcunuz : oğlak");
                }else{
                    System.out.println("burcunuz : kova");
                }
            }
        }if (ay==2){
            if (gun>=1 && gun<=31){
                if (gun<21) {
                    System.out.println("burcunuz : y");
                }else{
                    System.out.println("burcunuz : x");
                }

            }
        }
    }
}
