package Gun10;

import java.util.Scanner;

public class _06_JavaIf {
    public static void main(String[] args) {
        // girilen 3 sayıdan en büyük olanın bulunuz
        Scanner oku=new Scanner(System.in);
        System.out.print("İlk sayı= ");
        int s1= oku.nextInt();
        int buyuk=s1;
        System.out.print("İkinci sayı= ");
        int s2= oku.nextInt();
        System.out.print("Üçüncü sayı= ");
        int s3= oku.nextInt();

        if (s2>buyuk){buyuk=s2;}
        if (s3>buyuk){buyuk=s3;}
        System.out.println("en büyük sayı= "+buyuk);
    }
}
