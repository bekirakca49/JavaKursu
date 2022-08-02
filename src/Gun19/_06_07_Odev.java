package Gun19;

import java.util.Arrays;
import java.util.Scanner;

public class _06_07_Odev {
    public static void main(String[] args) {
        //7- Girilen pozitif bir sayının tam kare olup olmadığını bulunuz, tam kare ise true değilse false yazdırınız.
        //Not: sqrt gibi fonksiyonları kullanmayın.
        //Example 1:
        //Input: 16
        //Output: true
        //Not: bu sayı tam kare çünkü 4*4 = 16
        //Example 2:
        //Input: 14
        //Output: false (14 tam kare degil)
        Scanner oku = new Scanner((System.in));
        System.out.print("Pozitif bir sayı giriniz= ");
        int sayi = oku.nextInt();
        int carpim=1;
        int carpan=0;

        for (int i = 0; i < sayi; i++) {
            carpim=((i + 1) * (i + 1));
           if(carpim==sayi) {
               carpan=(i+1);
           }
        }
        System.out.println("çarpan = " + carpan);
        System.out.println("çarpım = " + carpan*carpan);
        if (carpan*carpan==sayi) {System.out.println("bu sayı tam kare çünkü = " +carpan+" * "+carpan+" = "+sayi);}
        if ((carpan*carpan)!=sayi) {System.out.println("false (" +sayi+" tam kare değil )");}
    }
}
