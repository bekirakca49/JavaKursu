package Gun19;
import java.util.Arrays;
public class _01_JavaArray {
    public static void main(String[] args) {
        // 100 elemanlı bir diziyi random(0-100) doldurduktan sonra,
        // sadece tek elemanları bir başka diziye atayınız.

        int[] dizi=new int[10];
        int[] tekler=new int[10];
        for (int i=0;i< dizi.length;i++){
            dizi[i]=(int)(Math.random()*100);
        }
        int tekIndex=0;
        for(int i=0;i< dizi.length;i++){
            if (dizi[i]%2==1){
                tekler[tekIndex]=dizi[i];
                tekIndex++;
            }
        }
        System.out.println("Arrays.toString(dizi  ) = " + Arrays.toString(dizi));
        System.out.println("Arrays.toString(tekler) = "+ Arrays.toString(tekler));
    }
}
