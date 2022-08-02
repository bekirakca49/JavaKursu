package Gun05;

import java.util.Scanner;

public class _03_Ornek {
    public static void main(String[] args) {
        // Kullanıcıdan Adını ve Soyadı alarak ekrana yazdırınız.
        Scanner oku=new Scanner(System.in); /// okuyucu bi kere tanımlamamız gerekiryor

        System.out.print("Adini ve soyadını giriniz= ");  // ekrana gelen veri girişinin ne için olduğunu
                //kullanıcıya belirtmek için zorunlu değil. Ln yi sildik çünkü kursor yanında olsun.
        String adsoyad=oku.nextLine(); // okuma işi bu noktada yapılıyor. bizde okunan değeri değişkene eşitliyoruz.

        System.out.print("adsoyad = " + adsoyad); // okunan değer doğru mu okundu diye ekrana yazdırıyoruz.

    }
}
