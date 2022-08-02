package Gun05;

import java.util.Scanner;

public class _12_05_Odev {
    public static void main(String[] args) {
        // Bir String oluşturunuz. Doğum gününüzü konsola giriniz. Stringi yazdırınız.
        Scanner oku=new Scanner(System.in);
        System.out.print("Doğum gününüzü giriniz= ");
        String dogumGunu= oku.next();

        System.out.println("dogumGunu = " + dogumGunu);
    }
}
