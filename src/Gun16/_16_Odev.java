package Gun16;

import java.util.Scanner;

public class _16_Odev {
    public static void main(String[] args) {
        //9- Girilen bir cümledeki kelimelerin baş harflerini yazdırınız (regex kullanmadan)
        Scanner oku=new Scanner(System.in);
        System.out.print("Cümleyi  giriniz= ");
        String  cumle= oku.nextLine();
        int miktar=0;
        System.out.print(cumle.charAt(0)); // ilk harf

        for (int i=0;i<cumle.length();i++)
        {
            if (cumle.charAt(i)==' ')
                System.out.print(cumle.charAt(i+1));
                miktar++;
        }
    }
}
