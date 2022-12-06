package Baslangic2;
import java.util.Scanner;
public class hesapMakinesi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n1, n2, select;
        System.out.println("n1 giriniz");
        n1 = inp.nextInt();
        System.out.println("n2 giriniz");
        n2 = inp.nextInt();
        System.out.println("1-toplama\n2-çıkarma\n3-bölme\n4-çarpma");
        System.out.print("griniz :");
        select = inp.nextInt();
        switch (select) {
            case 1:
                System.out.println("toplam :" + (n1 + n2));
                break;
            case 2:
                System.out.println("çıkarma :" + (n1 - n2));
                break;
            case 3:
                if (n2 != 0) {
                    System.out.println("bölme :" + (n1 / n2));
                } else {
                    System.out.println("sayi sıfıra bölünemez");
                }
                break;
            case 4:
                System.out.println("çarpma :" + (n1 * n2));
                break;
        }

    }
}

