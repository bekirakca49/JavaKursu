package Gun08;

import java.rmi.StubNotFoundException;
import java.util.Scanner;

public class _08_04_Odev {
    public static void main(String[] args) {
        // 4-Girilen bir kelimenin içerisinde B harifnin geçip geçmediğini bulunuz.
        Scanner oku=new Scanner(System.in);
        System.out.print("bir kelime giriniz = ");
        String kelime=oku.nextLine();

        boolean harfVarMi=kelime.contains("B");
        System.out.println("harfVarMi = " + harfVarMi);
    }
}
