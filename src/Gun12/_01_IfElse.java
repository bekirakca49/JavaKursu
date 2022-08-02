package Gun12;

import java.util.Scanner;

public class _01_IfElse {
    public static void main(String[] args) {
        // yan yana aralarında bir buslukla girilen 2 int sayının birbirine eşit olup olmadığnı bulunuz.

        Scanner oku=new Scanner(System.in);
        System.out.print("Bir sayı giriniz= ");
        String s= oku.nextLine(); //

        int ilkBoslukIndex=s.indexOf(" ");

        String strS1=s.substring(0, ilkBoslukIndex); // 45 fakat string modda
        String strS2=s.substring(ilkBoslukIndex+1); // 24 fat string modda

        System.out.println("s1 = "+strS1);
        System.out.println("s2= "+strS2);

        int s1=Integer.parseInt(strS1);
        int s2=Integer.parseInt(strS2);

        if (s1==s2){
            System.out.println("Sayılar birbirine eşittir.");
        }
        else {
            System.out.println("Sayırlar birbirine eşit değildir");
        }

    }
}
