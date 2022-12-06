package Baslangic;
import java.util.Scanner;
public class Patika2 {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int i;
        int total=0;
        do {
            System.out.print("lütfen bir sayi giriniz :");
            i= inp.nextInt();
            if(i%2==0 && i%4==0){
                total=total+i;
            }
        }while(i%2==0);
        System.out.println("total = " +total);
    }
}
