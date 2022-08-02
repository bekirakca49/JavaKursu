package Gun10;

import java.util.Scanner;

public class _08_JavaIf {
    public static void main(String[] args) {
        // girilen bir sayının birler ve onlar basamağını eşit olup olmadığını yazdırınız
        Scanner oku=new Scanner(System.in);
        System.out.print("Bir sayı giriniz= ");
        int s= oku.nextInt();
        int bbs=s%10;
        int obs=(s/10)%10;

        if (bbs==obs){System.out.println("birler onlar basamağı eşittir");}
        if (bbs!=obs){System.out.println("birler onlar basamağı farklıdır");}
    }
}