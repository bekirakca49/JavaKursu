package Gun11;

import java.util.Scanner;

public class _10_03_Odev {
    public static void main(String[] args) {
        //Girilen bir kelimede boşluk veya A harfinin olup olmadığını kontrol ediniz.
        Scanner oku=new Scanner(System.in);
        System.out.print("Bir String giriniz= ");
        String t=oku.nextLine();

        if (t.contains(" ") && t.contains("A")){
            System.out.println(t+" kelimesi hem boşluk, hem de A harfini içermektedir");}
        else{System.out.println(t+" kelimesi istenen koşulları taşımamaktadır");}
    }
}