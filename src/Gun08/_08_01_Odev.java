package Gun08;

import java.rmi.StubNotFoundException;
import java.util.Scanner;

public class _08_01_Odev {
    public static void main(String[] args) {
       // 1-Girilen bir cümlenin ilk ve son harfini bulunuz
        Scanner oku=new Scanner(System.in);
        System.out.print("bir cümle giriniz = ");
        String cumle=oku.nextLine();

        char ilkHarf= cumle.charAt(0);
        char sonharf=cumle.charAt(cumle.length()-1);
        System.out.println("ilkHarf = " + ilkHarf+ " "+sonharf);
    }
}
