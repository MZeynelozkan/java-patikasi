package Baslangic;
import java.util.Scanner;
public class Patika5 {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int total=1,sayac=1,sayac2=1;
        int i ,r;
        System.out.print("Lütfen bir i sayisi giriniz ");
        i= inp.nextInt();
        System.out.println("Lütfen bir r sayısı giirniz ");
        r= inp.nextInt();
        for (int k=1;k<=i; k++ ){
            total=(total*k);
        }for (int y=1; y<=r; y++ ){
            sayac=(sayac*y);
        }for (int z=1 ; z<=(i-r); z++){
            sayac2=sayac2*z;
        }
        System.out.println(total/(sayac*sayac2));
    }
}
