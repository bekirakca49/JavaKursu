package Gun08;

import java.util.Scanner;

public class _08_06_Odev {
    public static void main(String[] args) {
        //6-Girilen bir cümledeki son kelimeyi bulunuz
        Scanner oku=new Scanner(System.in);
        System.out.print("bir cümle giriniz: ");
        String cumle=oku.nextLine();

        int lastIndex= cumle.lastIndexOf(" ");
        String sonKelime=cumle.substring(lastIndex+1, cumle.length());
        System.out.println("sonKelime = " + sonKelime);
    }
}
