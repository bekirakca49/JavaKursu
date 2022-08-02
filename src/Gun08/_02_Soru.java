package Gun08;

import java.util.Scanner;

public class _02_Soru {
    public static void main(String[] args) {
        // Girilen bir kelimenin boş(Blank) olup olmadığını yazınız.
        Scanner oku=new Scanner(System.in);
        System.out.print("Bir kelime giriniz: ");

        String kelime= oku.nextLine();

        System.out.println("Boş mu= " + kelime.isEmpty());
    }
}
