package Gun05;

import java.util.Scanner;

public class _12_08_Odev {
    public static void main(String[] args) {
        // Bir byte oluşturunuz. Konsola kg cinsinden bir ağırlık yazınız. Byte ı yazdırınız.
        Scanner oku=new Scanner(System.in);
        System.out.print("Kaç kg= ");
        Byte agirlik= oku.nextByte();

        System.out.println("agirlik = " + agirlik);
    }
}
