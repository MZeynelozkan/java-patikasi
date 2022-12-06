package Baslangic;
import java.util.Scanner;
public class kullanici {
    public static void main(String[]args){
        Scanner inp=new Scanner(System.in);
        String userName, password,karar,newPassword;
        System.out.print("kullanıcı adınızı giriniz :");
        userName=inp.nextLine();
        System.out.print("şifrenizi girini :");
        password=inp.nextLine();
        if (userName.equals("zeyzey") && password.equals("Ahmetabi")) {
            System.out.println("giriş yapıldı");

        }else if (password!="Ahmetabi"&&userName.equals("zeyzey")){
            System.out.println("Yanlış Şifre !");
            System.out.println("Şifrenizi sıfırlamak ister misiniz?");
            karar=inp.nextLine();
            if (karar.equals("evet")){
                System.out.print("Yeni Şifrenizi Girin : ");
                password=inp.nextLine();

                if (password.equals("Ahmetabi")){
                    System.out.println("Şifre Oluşturulamadı Lütfen Başka Bir Şifre Girin.");

                }else if (password.equals("zeyzey")){
                    System.out.println("Kullanıcı adınızdan farklı bir şifre giriniz.");
                }else {
                    System.out.println("Şifre oluşturuldu.");
                }
            }else {

            }


        }else if (userName!="zeyzey" && password.equals("Ahmetabi")){
            System.out.println("Kullanıcı adını yanlış girdiniz !");
        }
    }
}