package Gun10;

import java.util.Scanner;

public class _09_01_Odev {
    public static void main(String[] args) {
        //Girilen bir sayının birler basamağının tek olup olmadığını yazdırınız
        Scanner oku=new Scanner(System.in);
        System.out.print("Bir sayı giriniz= ");
        int s=oku.nextInt();

        if (s%2==1) {
            System.out.println(s+" sayısı tek bir sayıdır");}
            else{System.out.println("Bu sayı tek bir sayı değildir");}
    }
}
