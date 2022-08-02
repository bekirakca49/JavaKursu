package Gun11;

import java.util.Scanner;

public class _10_01_Odev {
    public static void main(String[] args) {
        // Girilen 3 sayıdın büyük olanı yazdırınız
        Scanner oku=new Scanner(System.in);
        System.out.print("1.sayı= ");
        int s1=oku.nextInt();
        System.out.print("2.sayı= ");
        int s2=oku.nextInt();
        System.out.print("3.sayı= ");
        int s3=oku.nextInt();

        int buyuk=s1;

        if (s2>buyuk){buyuk=s2;}
        if (s3>buyuk){buyuk=s3;}
        System.out.println("buyuk = " + buyuk);
    }
}
