package Gun06;

import java.util.Scanner;

public class _11_Soru {
    public static void main(String[] args) {
        //girilen bir string de bosluk olup olmadığını bulunuz.

        Scanner oku=new Scanner(System.in);
        System.out.print("Bir string giriniz= ");
        
        String girilen=oku.nextLine();
        System.out.println("bosluk var mi = " + girilen.contains(" "));
    }
}
