import java.util.Scanner;

public class odev {
    public static void main(String[] args) {
        int fiz,mat,kim,sos;
        Scanner  inp=new Scanner(System.in);
        System.out.print("matematik sonucunuzu giriniz: ");
        mat= inp.nextInt();
        System.out.print("fizik notunuzu giriniz :");
        fiz=inp.nextInt();
        System.out.println("kimya notunuzu giriniz : " );
        kim=inp.nextInt();
        System.out.println("sosyal notunuzu giriniz :");
        sos=inp.nextInt();
        int toplam=(sos+kim+fiz+mat);
        double sonuc=(toplam/4.0);
        System.out.println("ortamlamanız :" + sonuc);
        String str= sonuc>=60 ? "sınıfı geçti" : "sınıfta kaldı";
        System.out.println(str);
    }

}
