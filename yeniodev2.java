package Baslangic;

import java.util.Scanner;
public class yeniodev2 {
    public static void main(String[] args) {
        double armut=2.14, elma=3.67, domates=1.11, muz=0.95, patlican=5.0,armutKg ,domatesKg, elmaKg, muzKg, patlicanKg;
        Scanner inp=new Scanner(System.in);
        System.out.print("Ne kadar muz istiyorsunuz :");
        muzKg=inp.nextDouble();
        System.out.print("Ne kadar elma istiyorsunuz :");
        elmaKg=inp.nextDouble();
        System.out.print("Ne kadar armut istiyorsunuz :");
    armutKg= inp.nextDouble();
        System.out.print("Ne kadar domates istiyorsunuz :");
        domatesKg=inp.nextDouble();
        System.out.print("Ne kadar patlıcan istiyorsunuz :");
        patlicanKg= inp.nextDouble();
        double toplamFiyat=(elmaKg*elma)+(armutKg*armut)+(muzKg*muz)+(domatesKg*domates)+(patlicanKg*patlican);
        System.out.println(toplamFiyat);
    }
}
