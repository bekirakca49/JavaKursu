package Gun19;

import java.util.Scanner;

public class _06_03_Odev {
    public static void main(String[] args) {
        // 3- Girilen bir string de kaç tane b harfi olduğunu yazdırınız.
        //System.out.println("a,b,n ->_= "+ text.replaceAll("[abn]", "_"));
        Scanner oku=new Scanner(System.in);
        System.out.print("Bir metin giriniz= ");
        String metin= oku.next();
        String metinKisa="";

        metin=metin.toLowerCase();
        metinKisa=metin.replaceAll("[b]", "");
        if (metin.length()==metinKisa.length())
            System.out.println("Bu kelime b harfi içermemektedir.");
        else   System.out.println("Bu string ne kadar -b- harfi içermektedir=  "+(metin.length()-metinKisa.length())+" adet");
    }
}
