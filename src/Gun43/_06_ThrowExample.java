package Gun43;

import java.util.Scanner;

public class _06_ThrowExample {
    public static void main(String[] args) {

        Scanner oku=new Scanner(System.in);
        System.out.print("Kullanıcı= ");
        String  userName=oku.nextLine();

        System.out.print("Şifre= ");
        String  password=oku.nextLine();
       try {
           if (password.length()<8)
               throw new Exception("Şifre 8 karakterden az olamaz");
           // System.out.println("Şifre 8 karakterden az olamaz"); yerine throw a yazdırıyoruz. daha kolay kullanım.
           if (password.length()>15)
              // System.out.println("Şifre 15 karakten fazla olamaz");
               throw new Exception("şifre 15 karekterden fazla olamaz");
       }
       catch (Exception ex) // ex hata değişkenini genelde ingilizce olarak  ex ya da e yazarlar
       {
           System.out.println("Lütfen Dikkat !");
           System.out.println("Uyarı= "+ ex.getMessage());
           // log tutuluyor
           // kimler bu hataları girişleri yapmış
           // ....
           // bir çok kontrol tek yerde toplanıyor
           // her adımda yazdırmak yerine, o alanda sadece işlemin kendisi yapılıyor, yazdırma catch de yazdırılıyor
           //throw ile. kolay bir kullanım yöntemi. break gibi çalışıyor.
       }
    }
}
