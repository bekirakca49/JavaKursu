package Gun21;

import java.util.ArrayList;

public class _06_06_Odev {
    public static void main(String[] args) {
        //6-
        //EvenOddNums isminde bir method oluşturun.
        //Bu yöntem String olan bir parametreyi kabul etsin.
        //Bu String'de 1234567890 gibi 10 haneli sayılar olacak.
        //Sayıların her basamağını alın ve basamak çiftse toplayın, tekse çıkartın.
        //toplam sonucu yazdırın.
        //**İpucu:Sayılar işlemleri yapabilmeniz için, basamakları tam sayıya dönüştürmeniz
        //gerekiyor.**
        //For example Örnek:
        //String = "6678421312"
        //6+6-7+8+4+2-1-3-1+2
        //sonuç 16 olmalı
        String sayiString="6678421312";

        int teklerToplam=0;
        int ciftlerToplam=0;

        int alinanSayi=0;
        int toplam=0;

        System.out.println("sayiString = " + sayiString);

       for (int i=0;i<sayiString.length();i++){
           alinanSayi=Character.getNumericValue(sayiString.charAt(i));
           toplam=toplam+alinanSayi;

           if (alinanSayi%2==1){
               teklerToplam=teklerToplam+alinanSayi;
           }
           if (alinanSayi%2==0){
               ciftlerToplam=ciftlerToplam+alinanSayi;
           }
       }
            System.out.println("Toplam = " + toplam);
            System.out.println("ciftlerToplam = " + ciftlerToplam);
            System.out.println("teklerToplam = " + teklerToplam);
    }
}
