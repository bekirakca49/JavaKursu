package Gun05;

import java.util.Scanner;

public class _07_Ornek {
    public static void main(String[] args) {
        // Kullanıcıdan  ağırlığını double, boyunu int olarak alınız
        // ve bir satırda boyunuz ... ve kilonuz ....şeklinde yazınız.
        // vücut kitle indeşini de bularak yazdırınız (k/boy*boy)

        Scanner oku=new Scanner(System.in);
        System.out.print("Kilo= ");
        int kilo= oku.nextInt();

        System.out.print("Boy= ");
        int boy= oku.nextInt();

        int KitleIndex=kilo/boy*boy;

        System.out.println("kilo = " + kilo);
        System.out.println("boy = " + boy);
        System.out.println("KitleIndex = " + KitleIndex);
    }
}
