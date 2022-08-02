package Gun19;

import java.util.Scanner;

public class _06_02_Odev {
    public static void main(String[] args) {
        //2- Girilen bir sayı çift ise "true" , tek ise "false" yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Bir sayı giriniz= ");
        int sayi= oku.nextByte();

        if (sayi%2==0)
            System.out.println("Bu bir çif sayıdır= True");
        if (sayi%2==1)
            System.out.println("Bu bir tek sayıdır= False");
    }
}
