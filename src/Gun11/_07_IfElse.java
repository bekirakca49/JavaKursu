package Gun11;

import java.util.Scanner;

public class _07_IfElse {
    public static void main(String[] args) {
        // Girilen bir stringin uzunluğu 10 dan büyükse ve string içinde study kelimesi geçiyorsa
        //ekrana evet yazdırın, değilse hayır yazdırın
        // bu soruyu büyük küçük harf girilsede doğru çalışacak şekilde çözünüz.

        Scanner oku=new Scanner(System.in);
        System.out.print("Bir metin giriniz= ");
        String t=oku.next();

        if (t.length()>10 && t.toLowerCase().contains("study")) {System.out.println("Evet ");}
        else {System.out.println("Hayır");}
    }
}
