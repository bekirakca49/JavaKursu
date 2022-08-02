package Gun11;

import java.util.Scanner;

public class _02_IfElse {
    public static void main(String[] args) {
        // ben buraya(kursa) neden geldim?
        //Girilen vize(%40) ve final(%60) notunu okuyarak ortalamayı bulunuz.
        //ortalama 60 dan büyük ise geçtiniz, tebrikler yazdırınız, değilse
        //bütünlemeye kaldınız şeklinde yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Vize notunuzu giriniz= ");
        int vize= oku.nextInt();

        System.out.print("Final notunu giriniz= ");
        int finaL= oku.nextInt();
        // eğer sonucu double istiyorsak doule eşitlemiliyiz
        // eğer int istiyorsak int e eşitlemeliyiz

        double ort=(vize*0.4+finaL*0.6);
        System.out.println("Not ortalamanız = " + ort);

        if (ort>=60){System.out.println("Geçtiniz, tebrikler");}
        else{System.out.println("Kaldınız");}
    }
}
