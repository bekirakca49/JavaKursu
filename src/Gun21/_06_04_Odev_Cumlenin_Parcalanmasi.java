package Gun21;

import java.util.Arrays;

public class _06_04_Odev_Cumlenin_Parcalanmasi {
    public static void main(String[] args) {
        //4- adı reverseWord olan bir method oluşturun
        //Bu methodun String olarak bir parametresi olmalıdır
        //Ve bu cümledeki kelimelerle tersine çevirmeli
        //Ters halini yazdırın.
        //Örnek 1 :
        //Dize: Java yazın
        //dönüş şöyle olmalıdır: yazın Java
        //Örnek 2:
        //Dize: Sakin olun ve evde kalın
        //dönüş olmalı: kalın evde ve olun sakin

        String tersCumle1=reverseWord("Java yazın");
        System.out.println("1. Cümlenin tersi= "+tersCumle1);

        String tersCumle2=reverseWord("Evde kalın");
        System.out.println("2. Cümleninin tersi= "+tersCumle2);

    }
    public static String reverseWord (String cumle){
        String tersCumle="";
        String[] words=cumle.split(" ");
        System.out.println("Cümlenin diziye atanmış hali= "+Arrays.toString(words));

        for (int i= words.length-1;i>=0;i--){
            tersCumle+=words[i]+" ";
        }
        return tersCumle;
    }
}
