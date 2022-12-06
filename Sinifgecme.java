package Baslangic;
import java.util.Scanner;
public class Sinifgecme {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int mat,fiz, kim, tur,muz;
        System.out.println("matematik notuzu giriniz :");
        mat= inp.nextInt();
        if (mat<0 || mat>100){
            mat=0;}
        System.out.println("fizik notunuzu giriniz :");
        fiz= inp.nextInt(); if (fiz<0 || fiz>100){
                fiz=0;}
        System.out.println("kimya notunuzu giriniz :");
        kim= inp.nextInt(); if (kim<0 || kim>100) {
                    kim = 0;}
                    System.out.println("türkçe notunuzu giriniz :");
                    tur = inp.nextInt();
                    if (tur < 0 || tur > 100) {
                        tur = 0;}
                        System.out.println("müzik notunuzu giriniz :");
                        muz = inp.nextInt();
                        if (muz < 0 || muz > 100) {
                            muz = 0;}
                            double ortalama = (tur + kim + fiz + muz + mat) / 5;
                            if (ortalama >= 55) {
                                System.out.println("sınıfı geçtiniz :" +ortalama);

                            } else {
                                System.out.println("sınıfta kaldınız :" +ortalama);
                            }
                        }
                    }