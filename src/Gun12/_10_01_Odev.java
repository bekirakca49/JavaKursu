package Gun12;
import java.util.Scanner;
public class _10_01_Odev {
    public static void main(String[] args) {
       // 1- kullanıcıdan ondalıklı bir sayının ,   tam ve ondalıklı kısmını ayrı  ayrı alınız.
        // bır sayıları  nokta ıle bırlestırerek tek bır ondalıklı sayı haline gitirip, sonra yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Onlalıklı bir sayı giriniz= ");
        double s=oku.nextDouble();

        String sString=String.valueOf(s);
        String sTam=sString.substring(0,sString.indexOf("."));
        String ondalik=sString.substring(sString.indexOf(".")+1);

        System.out.println("sTam = " + sTam);
        System.out.println("Ondalık = " + ondalik);
        System.out.println("Sayımız= "+sTam+"."+ondalik);

    }
}
