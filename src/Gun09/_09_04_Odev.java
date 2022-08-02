package Gun09;

import java.util.Scanner;

public class _09_04_Odev {
    public static void main(String[] args) {
        //Oluşturulmuş olan double'lar hakkında,
        //Bu 4 doubleyi  birbiriyle çarpın ve **sonuca**  eşitleyin.Double sonucu yazdırın.
        Scanner oku=new Scanner(System.in);
        System.out.print("ilk sayiyi giriniz= ");
        double s1= oku.nextDouble();
        System.out.print("ikinci sayiyi giriniz= ");
        double s2= oku.nextDouble();
        System.out.print("üçüncü sayiyi giriniz= ");
        double s3= oku.nextDouble();
        System.out.print("dördüncü sayiyi giriniz= ");
        double s4= oku.nextDouble();
        double sonuc=(s1*s2*s3*s4);

        System.out.println("sonuc = " + sonuc);
    }
}
