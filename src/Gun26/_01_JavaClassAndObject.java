package Gun26;

import java.util.Scanner;

public class _01_JavaClassAndObject {
    // burası METOD'un yazılabildiği yer
    public static void main(String[] args) {
        //ana proğramın başladığı ve çalıştığı  yer
        int sayi=5;
        Scanner oku=new Scanner(System.in);
        Araba benimArabam=new Araba(); // Araba tür,benimArabam obje
        benimArabam.renk="Kırmızı";
        benimArabam.motorHacmi=1600;
        benimArabam.yili=2020;
        System.out.println("benimArabam.renk = " + benimArabam.renk);
        System.out.println("benimArabam.motorHacmi = " + benimArabam.motorHacmi);
        System.out.println("benimArabam yili = " + benimArabam.yili);
    }
    // metodların yazılabildiği yer
}
class Araba{ // bu tasarıma class diyoruz ve bu şekilde tanımlanıyor.
    String renk;
    int yili;
    double motorHacmi;

}
