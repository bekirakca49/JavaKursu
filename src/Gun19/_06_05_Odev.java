package Gun19;

import java.util.Arrays;
import java.util.Scanner;

public class _06_05_Odev {
    public static void main(String[] args) {
        //5- Girilen bir sayının faktöriyel değerini bulmak için bir program yazın.
        //number:6
        //factorial:1*2*3*4*5*6=720
        //output ---> 720
        Scanner oku=new Scanner(System.in);
        System.out.print("Bir sayı giriniz= ");
        int okunan= oku.nextInt();

        int[] degerler=new int[(okunan)];
        int carpim=1;

        for (int i=0;i<okunan;i++){
            degerler[i]=(i+1);
            carpim=carpim*(i+1);
        }
        System.out.println("Dizimiz=  "+ Arrays.toString(degerler));
        System.out.println("Çarpım sonucu= "+carpim);
    }
}