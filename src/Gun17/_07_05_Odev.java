package Gun17;
public class _07_05_Odev {
    public static void main(String[] args){
    //5-    int Array oluşturun ve elemanları : 5,6,8,12,14,19
    //Eğer sayı çiftse topla, tekse çıkar.
    //**Örneğin:**
    //**-5 + 6 + 8 + 12 + 14 - 19 = 16**
    //Toplamlarını yazdırın.
    int[] dizi={5,6,8,12,14,19};
    int toplam=0;

    for (int i=0;i<dizi.length;i++) {
        if (dizi[i] % 2 == 0)
            toplam = toplam + dizi[i];
        if (dizi[i] % 2 ==1)
            toplam = toplam - dizi[i];
        System.out.println("toplam = " + toplam);
    }
        System.out.println("Sonuç toplam = " + toplam);
    }
}
