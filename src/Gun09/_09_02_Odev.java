package Gun09;

import java.util.Scanner;

public class _09_02_Odev {
    public static void main(String[] args) {
        // Verilen int ler hakkında, (num1, num2),
        // num1'i num2'ye bölün ve sonucu int sonuc'a eşitleyin. int sonucu yazdırın.

        Scanner oku=new Scanner(System.in);
        System.out.print("ilk sayiyi giriniz= ");
        int s1=oku.nextInt();

        System.out.print("ikinci sayiyi giriniz= ");
        int s2=oku.nextInt();
        int sonuc=(s1/s2);

        System.out.println("s1/s2 int sonucu= "+sonuc);
    }
}
