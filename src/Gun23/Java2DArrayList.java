package Gun23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Java2DArrayList {
    public static void main(String[] args) {
        /* ***********************************************************/
        int sayi=5; // tek bir rakam saklayabilen değişken.
        int[] dizi=new int[20];// 20s adet sayı saklayabilen değişken.
        int[][] tablo=new int[20][4]; // 20x4 tane sayı saklayabilen bir değişken.

        ArrayList<Integer> liste=new ArrayList<>(); // istenildiği kadar rakam eklenebilen değişken
        /* ***********************************************************/

        // 3 öğrencinin mat fiz kimya notlarını tek bir yerde birleştireceğiz
        ArrayList<ArrayList<Integer>> notlarListesi=new ArrayList<>(); // listelerin listesi

        ArrayList<Integer> matNotlar=new ArrayList<>();
        matNotlar.add(60);
        matNotlar.add(70);
        matNotlar.add(80);
        matNotlar.add(90);

        ArrayList<Integer> fizNotlar=new ArrayList<>();
        fizNotlar.add(65);
        fizNotlar.add(75);

        ArrayList<Integer> kimNotlar=new ArrayList<>();
        kimNotlar.add(85);
        kimNotlar.add(75);
        kimNotlar.add(95);
        kimNotlar.add(55);

        notlarListesi.add(matNotlar);
        notlarListesi.add(fizNotlar);
        notlarListesi.add(kimNotlar);

        notlarListesi.get(0); // her bir elemanı bir liste (0.liste matNotları onları getiriyor.)
        notlarListesi.get(0).get(0); // 0.listenin 0.elemanını verir.

        System.out.println("notlarListesi = " + notlarListesi.get(0));// 0.listeyi yazdırır
        System.out.println("notlarListesi = " + notlarListesi.get(1)); // 1. listeyi yazdırır
        System.out.println("notlarListesi = " + notlarListesi.get(2));// 2. listeyi yazdırır

       // yukarıdakilerin yerine bu döngü
        for (int i=0;i<notlarListesi.size();i++) {
            System.out.println("For ile notlarListesi = " + notlarListesi.get(i));
        }

        ArrayList<String> dersler=new ArrayList<>();
        dersler.add("Matematik");
        dersler.add("Fizik");
        dersler.add("Kimya");

        // tum notlar tek tek nasıl yazdırılır
        for (int i=0;i<notlarListesi.size();i++) {

            System.out.println(dersler.get(i));
            for (int j = 0; j < notlarListesi.get(i).size(); j++) { // her bir listedeki notların sayısı
                System.out.print((i+1)+".yaprak, " + (j+1)+".not" );
                System.out.println(" = " + notlarListesi.get(i).get(j));
            }
        }
        // Soru: 1 Kullanıcıdan alınan ders nosuna göre ekrana Notların Listesini bir fonksiyonda yazdırınız.
        Scanner oku=new Scanner(System.in);
        System.out.println("DersNo (0-Mat, 1-Fiz, 2-Kim)");
        System.out.print("Ders no giriniz = ");
        int dersNo=oku.nextInt();

        dersNotlariYazdir(notlarListesi,dersNo); // gönderme kısmı

        //Soru 2: Yukarıda Girilen derse ait ortalamayı main de yazdırınız.

        int ort=dersOrtalamaBul(notlarListesi,dersNo);
        System.out.println("ort = " + ort);

        // Soru 3: Tüm Derslerin not yani tum notların ortalamasını (double) mainde yazdırınız.
        // Soru 4: En büyük ve en küçük notu bulunuz. (fonksiyon yok)

        double ortTum=tumDersOrtalamaBul(notlarListesi);
        System.out.println("Tum ders notları ortalaması = " + ortTum);

        // Soru 4: En büyük ve en küçük notu bulunuz. (fonksiyon yok)
        int enbNot=0;
        int enkNot=0;

        for (int i = 0; i < notlarListesi.size(); i++){
            for (int  j=0;j<notlarListesi.get(i).size();j++){
                if (enbNot<notlarListesi.get(i).get(j)){
                enbNot=notlarListesi.get(i).get(j);
                }
            }
        }
        System.out.println("enbNot = " + enbNot);
    }
    public static void dersNotlariYazdir(ArrayList<ArrayList<Integer>> notlarListesi, int dersNo){

        for (int i=0;i<notlarListesi.get(dersNo).size();i++)
            System.out.println(notlarListesi.get(dersNo).get(i));
    }
    // fontsiyona notlistesi ve dersno gidecek, ort dönecek.
    public static int dersOrtalamaBul(ArrayList<ArrayList<Integer>> notlarListesi, int dersNo){
        int toplam=0;
        for (int i=0;i<notlarListesi.get(dersNo).size();i++)
            toplam=toplam+notlarListesi.get(dersNo).get(i);
            return toplam/notlarListesi.get(dersNo).size();
    }
    public static double tumDersOrtalamaBul(ArrayList<ArrayList<Integer>> notlarListesi) {
        int toplam = 0;
        double ortTum=0;
        int sizeNotlarListesi=0;
        int i=0;
        int j=0;

        for (i = 0; i < notlarListesi.size(); i++){
            for ( j=0;j<notlarListesi.get(i).size();j++){
                toplam=toplam+(notlarListesi.get(i).get(j));
                sizeNotlarListesi++;
            }
            ortTum=toplam/sizeNotlarListesi;
        }
        System.out.println("sizeElemanSayisi = " + sizeNotlarListesi);
        System.out.println("tumNotToplam = " + toplam);

        return ortTum;
    }

}
