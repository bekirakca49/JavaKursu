package Gun17;
import java.util.Arrays;
public class _07_02_Odev {
    public static void main(String[] args) {
        // 2- int Array oluşturun ve elemanları : 12,2,5,15,8
        //En büyük değeri yazdırınız.
        int [] dizi={12,2,5,15,8};
        int enb=0;
        System.out.println("Elemanlar = " + Arrays.toString(dizi));

        for (int i=0;i< dizi.length;i++)
            if (dizi[i]>enb)
                enb=dizi[i];
        System.out.println("enb = " + enb);
    }
}
