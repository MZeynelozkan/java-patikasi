package Baslangic;
import java.util.Scanner;
public class Patika6 {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int n,k;
        int total=1;
        System.out.print("lütfen üssü alınacak sayiyi giriniz :");
        n= inp.nextInt();
        System.out.println("lütfen üssü giriniz :");
        k= inp.nextInt();
        for(int i=1 ; i<=k; i++){
            total=total*n;
        }
        System.out.print(total);
    }
}
