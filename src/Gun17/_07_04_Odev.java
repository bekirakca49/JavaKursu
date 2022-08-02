package Gun17;
import java.util.Arrays;
public class _07_04_Odev {
    public static void main(String[] args) {
        //4- int Array oluşturun ve elemanları : 15 , 25, 22, 18, 30
        //Arraydaki en büyük 2. elemanı yazdıran bir program yazın.
        int[] dizi={15,25,22,18,30};
        int enBiki=0;

        Arrays.sort(dizi);
        System.out.println("dizi = " + Arrays.toString(dizi));

        enBiki=dizi[dizi.length-2];
        System.out.println("enbEleman = " + enBiki);
    }
}
