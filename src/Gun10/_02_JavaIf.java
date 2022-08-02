package Gun10;

import java.util.Scanner;

public class _02_JavaIf {
    public static void main(String[] args) {
        // Girilen bir sayının negatif mi, pozitif mi olduğunuz yazdırınız.
        // sıfır ise sıfır yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("bi sayi giriniz= ");
        int s= oku.nextInt();
        if (s>0) {
            System.out.println(s+" Pozitif ");
        }
        if (s==0) {
            System.out.println(s+" Sıfır ");
        }
        if (s<0) {
            System.out.println(s+" Negatif ");
        }
    }
}
