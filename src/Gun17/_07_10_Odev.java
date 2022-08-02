package Gun17;

public class _07_10_Odev {
    public static void main(String[] args) {
        //11--İnt Array oluştur ve elemanları   : 25,30,30,35,100
        //Array in elemanlarının toplamını yazdır.
        //Cevap 220 olmalı.

        int[] dizi={25,30,30,35,100};
        int toplam=0;

        for (int i=0;i< dizi.length;i++)
        {
            toplam=toplam+dizi[i];
        }
        System.out.println("toplam = " + toplam);
    }
}
