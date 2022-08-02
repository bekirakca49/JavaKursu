package Gun08;

import java.util.Locale;
import java.util.Scanner;

public class _03_Soru {
    public static void main(String[] args) {
        /* girilen bir cümledeki A harfi sayısını bulunuz. Büyük küçük haf ayırımı olmadan.*/

        Scanner oku=new Scanner(System.in);
        System.out.print("Bir cümle giriniz = ");
        String cumle=oku.nextLine();
        int u=cumle.length();

        int u11=cumle.replace("A","a").replace("a","").length();
        int u12=cumle.toUpperCase().replace("A","").length();
        int u13=cumle.toLowerCase().replace("a","").length();
        int u14=cumle.replaceAll("[Aa]","").length();

        System.out.println("u-u11="+(u-u11) );
        System.out.println("u-u12="+(u-u12) );
        System.out.println("u-u13="+(u-u13) );
        System.out.println("u-u14="+(u-u14) );

    }
}
