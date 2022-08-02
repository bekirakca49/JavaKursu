package Gun11;

import java.util.Scanner;
import java.util.SortedMap;

public class _03_IfElse {
    public static void main(String[] args) {
        //Girilen bir sayının tek mi çift mi olduğunuz yazdırınız
        Scanner oku=new Scanner(System.in);
        System.out.print("Bir sayı giriniz= ");
        int s=oku.nextInt();

        if (s<0) s*=-1; // eğer girilen sayı 0 dan küçük ise -1 ile çarparak işlem yapılıyor.
        if (s%2==1){System.out.println("Tek");}
        else{System.out.println("Çift");}
    }
}
