package Baslangic;
import java.util.Scanner;
public class ucakbileti {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int yas, yon;
        double tutar, km;
        System.out.print("kaç yaşındasınız ");
        yas = inp.nextInt();
        System.out.println("kaç km");
        km = inp.nextDouble();
        System.out.print("yalnızca gidiş mi yoksa gidiş dönüş mü");
        yon = inp.nextInt();
        switch (yon) {
            case 1:
                if (yas < 12) {
                    tutar = (km * 0.10 * 1 / 2);
                    System.out.println(tutar);
                } else if (yas >= 12 && yas < 24) {
                    tutar = (km * 0.10 * 9 / 10);
                    System.out.println(tutar);
                } else if (yas > 65) {
                    tutar = (km * 0.10 * 7/ 10);
                    System.out.println(tutar);
                    break;
                }
            case 2:
                if (yas < 12) {
                    tutar = (km * 0.10 * 1 / 2 * 0.8);
                    System.out.println(tutar);
                } else if (yas >= 12 && yas < 24) {
                    tutar = (km * 0.10 * 0.9 * 0.8);
                    System.out.println(tutar);
                } else if (yas > 65) {
                    tutar = (km * 0.10 * 7/ 10 * 0.8);
                    System.out.println(tutar);
                    break;
                }
        }
    }
}
