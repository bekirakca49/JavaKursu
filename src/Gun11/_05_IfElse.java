package Gun11;

import java.util.Scanner;
import java.util.stream.Stream;

public class _05_IfElse {
    public static void main(String[] args) {
        //Girilen bir stringin uzunluğu 10 dan büyükse ve string içinde
        //"study" kelimesi geçiyorsa ekrana evet yazdırın değilse hayır yazdırınız

        Scanner oku=new Scanner(System.in);
        System.out.print("Bir metin giriniz= ");
        String t=oku.next();

        if (t.length()>10 && t.contains("study")) {System.out.println("Evet ");}
        else {System.out.println("Hayır");}
    }
}
