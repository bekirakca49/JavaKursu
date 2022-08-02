package Gun12;

import java.util.Scanner;

public class _07_JavaMath {
    public static void main(String[] args) {
        // Math.max yöntemi ile girilen 3 sayıdan büyük olanının bulunuz.
        Scanner oku=new Scanner(System.in);
        System.out.print("İlk sayiyi giriniz= ");
        int s= oku.nextInt();

        System.out.print("İkinci sayiyi giriniz= ");
        int s2= oku.nextInt();
        System.out.print("Üçüncü sayiyi giriniz= ");
        int s3= oku.nextInt();
        //1. yöntem
        int enb=Math.max(s,2);
        enb=Math.max(enb,s3);
        System.out.println("En büyüğü= "+ enb);

        //2. yöntem
        int enb2=Math.max(s, Math.max(s2,s3));
        System.out.println("En büyüküğü= "+enb2);

        // 3. yöntem
        System.out.println("Girilen sayıların en büyüğü= "+ Math.max(s, Math.max(s2,s3)));
    }
}
