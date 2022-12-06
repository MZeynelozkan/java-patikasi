package Baslangic;
import java.util.Scanner;
public class SayiSiralama {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int a, b ,c;
        System.out.println("üç sayıyı giriniz :");
        a= inp.nextInt();
        b= inp.nextInt();
        c= inp.nextInt();
        if ((a>b) && (a>c)){
        if(b>c){
            System.out.println("c<b<a");
        }
        }else {
            System.out.println("b<c<a");
        }else if((b>a)&& (b>c)){

        }
    }
}
