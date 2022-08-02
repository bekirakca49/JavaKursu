package Gun20;
import java.util.Arrays;
import java.util.Scanner;

public class _05_JavaMethod {
    public static void main(String[] args) {
        // kullanicidan 5 elemanli bir diziyi doldurduktan sonra,
        // dizinin en kucuk en buyuk elemanin karelerini yeni bir diziye atiniz
        // bu dizinin en kucukm en buyuk elemanini ve ortalamasini bulunuz
        int[] dizi=new int[5];

        Scanner oku=new Scanner(System.in);

        for (int i=0;i< dizi.length;i++){
            System.out.print(i+1+".Sayi giriniz= ");
            dizi[i]=oku.nextInt();
        }

        enKucukYaz(dizi);
        enBuyukYaz(dizi);
        ortalamaYaz(dizi);

        // 2.kisim
        int[] dizi2=new int[5];
        for (int i=0;i< dizi.length;i++)
        {
            dizi2[i]=dizi[i]*dizi[i];
        }
        enKucukYaz(dizi2);
        enBuyukYaz(dizi2);
        ortalamaYaz(dizi2);
        }

    public static void enKucukYaz(int [] dizi)
    {
        Arrays.sort(dizi);
        System.out.println("en kucuk= "+dizi[0]); // en kucuk elemani aldik
    }
    public static void enBuyukYaz(int [] dizi)
    {
        Arrays.sort(dizi);
        System.out.println("en buyuk= " + dizi[dizi.length - 1]); // en buyuk elemani aldik
    }
    public static void ortalamaYaz(int [] dizi)
    {
        int toplam = 0;
        for (int i = 0; i < dizi.length; i++)
        {
            toplam = toplam+dizi[i];
        }
        int ort=toplam/ dizi.length;
        System.out.println("ort= "+ort );
    }


}
