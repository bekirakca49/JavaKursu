package Gun12;

import java.util.Scanner;

public class _03_IfElse {
    public static void main(String[] args) {
        // otopark ücretleri:
        // 3 saate kadar 10tl, 5 saate kadar 15 tl, 10 saate kadar 20tl dir.
        // kullanıcının kaç saat kaldığını alarak ücreti yazdırınız.
        Scanner oku = new Scanner(System.in);
        System.out.print("Lütfen parkta geçen saati yazınız= ");
        int sure = oku.nextInt();

        if (sure <=3) {
            System.out.println("Ödemeniz gereken ücret 10 Tl dir");
        }
        else {// burası zaten 3 den büyükse demek
            if(sure <=5) {System.out.println("Ödemeniz gereken ücret 15 Tl dir");}
        else {System.out.println("Ödemeniz gereken ücret 20 Tl dir");}
    }
}
}

