package Gun16;

import java.util.Scanner;

public class _10_Odev {
    public static void main(String[] args) {
        // 4-- 0 ile 100 arasındaki sayılardan hem 4 hem de 5 e tam bölenebilen sayıları ekrana yazdırınız
        for (int i=1;i<=100;i++){
            if (i%5==0 && i%4==0)
                System.out.println("Hem 4, hem 5 e bölünebilen sayılar= "+i);
        }
    }
}
