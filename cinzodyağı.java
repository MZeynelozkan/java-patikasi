package Baslangic;
import java.util.Scanner;

public class cinzodyağı {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int bornYear;
        System.out.print("Doğum yılınızı giriniz :");
        bornYear=inp.nextInt();
        if (bornYear%12==0){
            System.out.print("cin zodyağı burcunuz : maymun");
        }else if(bornYear==1){
            System.out.print("cin zodyağı burcunuz : horoz");
        }else if(bornYear==2){
            System.out.print("cin zodyağı burcunuz : köpek");
        }
    }
}
