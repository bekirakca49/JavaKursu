package Gun10;

import java.util.Scanner;

public class _09_04_Odev {
    public static void main(String[] args) {
        //Girilen bir kelimede A harfinin olup olmadğını yazdırınız.
        Scanner oku=new Scanner(System.in);
        System.out.print("Bir keleme giriniz= ");
        String kelime= oku.next().toUpperCase();

        if (kelime.contains("A")){
            System.out.println("bu kelime A harfini içermektedir");
        }
        else {
            System.out.println("Bu kelime A harfini içermemektedir");
        }
    }
}
