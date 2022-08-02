package Gun12;

import java.util.Scanner;

public class _10_011_Odev {
    public static void main(String[] args) {
        // 1- kullanıcıdan ondalıklı bir sayının ,   tam ve ondalıklı kısmını ayrı  ayrı alınız.
        // bır sayıları  nokta ıle bırlestırerek tek bır ondalıklı sayı haline gitirip, sonra yazdırınız.
        Scanner oku=new Scanner(System.in);
        System.out.print("tam kısmı giriniz = ");
        String tamKismi=oku.next();

        System.out.println("ondalık kısmı giriniz = ");
        String ondalikKismi=oku.next();

        String strSayi=tamKismi.concat(".").concat(ondalikKismi);
        Double sayi=Double.parseDouble(strSayi);
        System.out.println("sayi = " + sayi);
    }
}

