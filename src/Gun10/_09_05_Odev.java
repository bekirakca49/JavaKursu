package Gun10;

import java.util.Scanner;

public class _09_05_Odev {
    public static void main(String[] args) {
        //Girilen 2 kelimenin aynı uzunlukta olup olmadığını yazdırınız
        Scanner oku=new Scanner(System.in);
        System.out.print("1. kelime= ");
        String k1= oku.nextLine();
        System.out.print("2. kelime= ");
        String k2= oku.nextLine();

        if (k1.length()==k2.length()){
            System.out.println("Bu kelilerin uzunlukları eşittir");
        }
        else {
            System.out.println("Bu kelimelerin uzunlukları eşit değildir");
        }
    }
}
