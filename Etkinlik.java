package Baslangic;
import java.util.Scanner;
public class Etkinlik {
    public static void main(String[] args) {
        Scanner inp=new Scanner (System.in);
        int heat;
        System.out.println("sıcaklık giriniz :");
        heat= inp.nextInt();
        if (heat<5 ){
            System.out.println("kayak yapınız ");

        }if (heat>=5 && heat<15){
            System.out.println("sinemaya gidiniz");}
        if(heat>=15 && heat<25){
            System.out.println("pikniğe gidinzi");

        }if(heat>=25){
            System.out.println("denize gidiniz");

        }
    }
}
