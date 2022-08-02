package Gun22;

import java.util.ArrayList;
import java.util.Scanner;

public class _02_ArrayList_Soru {
    public static void main(String[] args) {
        //Bir öğretmenden girmek istediği kadar notu alınız, ve
        // ortalamayı geçen öğrenci sayısını bulunuz.
        // Öğretmene devam etmek istiyor musunuz (E/H) şeklinde sorunuz.

        Scanner oku=new Scanner(System.in);
        Scanner okuInt=new Scanner(System.in);
        int secim=0;
        ArrayList<Integer> notlar=new ArrayList<>();
        String devamMi="";
        int toplam=0;

        do {
            System.out.print("Not= ");
            int ogrNot=okuInt.nextInt();
            notlar.add(ogrNot);
            toplam+=ogrNot;

            System.out.print("Devam Etmek istiyor musunuz (E/H) = ");
            devamMi=oku.next();

        }while (devamMi.equalsIgnoreCase("E"));
       System.out.println("notlar = " + notlar);  // kontrol için yazıldı. düzgün çalıştı.
        int ort=toplam/ notlar.size();
        System.out.println("ort= "+ort);

        gecenSayisiYaz(notlar,ort);

    }
    public static void gecenSayisiYaz (ArrayList<Integer> dizilist,int ort){
        int geceSayi=0;
        for (int i=0;i< dizilist.size();i++)
            if(dizilist.get(i)>=ort)
                geceSayi++;
        System.out.println("geceSayi = " + geceSayi);
    }

}
