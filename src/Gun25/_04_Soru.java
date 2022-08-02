package Gun25;

import java.util.Collections;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _04_Soru {
    public static void main(String[] args) {
        // Canlı Sözlük yapılmak isteniyor.
        // Kullanıcıya aşağıdaki gibi bir menü çıkarınız.
        // 1- Ekleme (Bu secekte kelimenin kendisi ve manasını bir cümle ile yazınız)
        // 2- Düzeltme (Bu secenkte kullanıcının kelimenin manasını düzelttiriniz.)
        // 3- Listeleme
        // 4- Arama (Bu secekte verilen bir kelimeyle başlayan tüm kelimelerin manaları)
        // 5- Silme
        // 6- Çıkış

        Map<String,String> sozluk=new TreeMap<>();
        
        Scanner okuInt=new Scanner(System.in);
        Scanner oku=new Scanner(System.in);
        int secim=0;
        do {
            System.out.println("********* Menu **********");
            System.out.println("1- Ekleme");
            System.out.println("2- Düzeltme");
            System.out.println("3- Listeleme");
            System.out.println("4- Arama");
            System.out.println("5- Silme");
            System.out.println("6- Çıkış");
            secim= okuInt.nextByte();

            switch (secim){
                case 1: // ekleme işlemleri
                    System.out.print("kelimeyi giriniz = ");
                    String kelime=oku.nextLine();
                    System.out.print("Manasını giriniz= ");
                    String anlami=oku.nextLine();
                    sozluk.put(kelime,anlami);
                    break;
                case 2: // düzeltme işlemleri
                    //TODO . kelime var mı yok mu kontrül yapılacak
                    System.out.print("Düzeltilecek kelimeyi giriniz = ");
                    kelime=oku.nextLine();
                    System.out.print("Anlamini giriniz= ");
                    anlami=oku.nextLine();
                    sozluk.put(kelime,anlami);
                    break;
                case 3: // listeleme işlemleri
                    System.out.println("sozluk = " + sozluk);
                    break;
                case 4: // arama işlemleri: kelimenin birkaç harfini girdiğinde bulsun.

                    break;
                case 5: // silme işlemleri
                    break;
            }
        }while (secim<6);
        //TODO : bütün işlemler burda yapıldıktan sonra, METOD ile bütün işlemleri yapınız.
    }
}
