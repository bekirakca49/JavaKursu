package Gun18;

import java.util.Scanner;

public class _01_JavaArray {
    public static void main(String[] args) {
        // 5 elemanlı bir dizi tanımlayınız, 10 a kadar olan sayılardan Random atayarak doldurunuz.
        // Sonrasında ayrı bir döngü ile tek olanlr 1, çift olanlara 2 atayınız. Yazdırınız.

        int i=0;
        int[] dizi=new int[50]; // 50 elemanlı bir dizi tanımlayınız.

        for (i=0;i< dizi.length;i++)
            dizi[i]=(int)(Math.random()*10); // 0 a kadar olan sayılardan atayarak doldurunuz

        for (i=0;i<dizi.length;i++)
                System.out.println("dizi["+i+"]= "+dizi[i]);

        for(i=0;i< dizi.length;i++){
            if (dizi[i]%2==1)
                dizi[i]=1;
            else
                dizi[i]=2;
        }
        for (i=0;i<dizi.length;i++)
            System.out.println("dizi["+i+"]= "+dizi[i]);
    }
}
