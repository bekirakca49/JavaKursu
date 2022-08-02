package Gun05;

import java.util.Scanner;

public class _12_03_Odev {
    public static void main(String[] args) {
        // Bir String oluşturun. Konsola sevdiğiniz bir meyveyi yazın. O meyveyi yazdırınız.
        Scanner oku=new Scanner(System.in);
        System.out.print("Sevdiğiniz bir meyve adını giriniz= ");
        String meyveadi=oku.next();

        System.out.println("meyveadi = " + meyveadi);
    }
}
