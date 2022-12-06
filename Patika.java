package Baslangic;
import java.util.Scanner;
public class Patika {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int k;
        double ortalama=0;
        int sayac=0;
        System.out.print("lütfen bir k sayısı giriniz");
        k= inp.nextInt();
        for(int i=0; i<=k; i++){
            if(i%3==0 && i%4==0){
                System.out.println(i);
                ortalama=ortalama+i;
                        sayac=sayac+1;
            }
        }
        System.out.println("ortalama =" +ortalama/sayac);
    }
}
