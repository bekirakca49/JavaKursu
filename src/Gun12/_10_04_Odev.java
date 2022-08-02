package Gun12;

import java.util.Scanner;

public class _10_04_Odev {
    public static void main(String[] args) {
        // 4-Girilen bir string
        //Eğer String € karakterini kapsıyorsa "This is euro" yazdırın.
        //Eğer String $ karakterini kapsıyorsa "This is dollar" yazdırın.
        //Aksi halde (else) "no money" yazdırın.

        Scanner oku=new Scanner(System.in);
        System.out.print("Bir metin giriniz= ");
        String metin= oku.next();

        if (metin.contains("$")){System.out.println("This is dollar");}
        else if (metin.contains("€")){System.out.println("This is euro");}
        else {System.out.println("no many");}
    }
}
