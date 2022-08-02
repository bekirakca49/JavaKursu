package Gun15;

import java.util.Scanner;

public class _09_GununSorusu {
    public static void main(String[] args) {
        //0-255 e kadar harflerin, sayı ve harf değerini yazdırınız.
        for (int i=0;i<=255;i++){
            char harf=(char)i; // bilgisyaar artık bu sayının tablodaki karekter karşılığını anlıyor.
            System.out.println( i+"   -"+harf);
        }
    }
}
