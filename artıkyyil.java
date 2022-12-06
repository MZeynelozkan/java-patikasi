package Baslangic;
import java.util.Scanner;
public class artıkyyil {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int yil;
        System.out.print("bir yıl giriniz :");
        yil=inp.nextInt();
        if (yil%4==0){
            System.out.println("bu bir artık yil :" +yil);
        }else{
            System.out.println("bu bir artık yil değil :" +yil);
        }

    }
}
