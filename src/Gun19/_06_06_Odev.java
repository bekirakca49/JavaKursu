package Gun19;

import java.util.Scanner;

public class _06_06_Odev {
    public static void main(String[] args) {
        //6- İçinde negatif de olabilen sayının ve para sembolünün olduğu aşağıdaki gibi 3 tane String
        //okutunuz
        //okunan bu 3 string içindeki negatif de olabilen sayıları toplayın.
        //Toplam pozitif ise toplamı yazdırın, eğer toplam negatif ise sadece -1 yazdırın.
        //Ornek:
        //String num1 = "$15";
        //String num2 = "$20";
        //String num3 = "$30";
        //output ----> 65; olmali
        //String num1 = "$15";
        //String num2 = "$-80";
        //String num3 = "$30";
        //output ----> -1; olmali
        Scanner oku=new Scanner(System.in);

        int toplam=0;

        for (int i=0;i<3;i++){
            System.out.print("Bir string giriniz=  ");
            String metin= oku.next();

            metin=metin.replace("$","");
            int sayi = Integer.parseInt(metin);
            toplam=toplam+sayi;
        }
        System.out.println("Genel toplam= "+toplam);

        if (toplam>0)
            System.out.println("Sayının toplamı= "+toplam);
        else System.out.println("Sayının toplamı= -1");
    }
}
