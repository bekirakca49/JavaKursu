package Gun12;
import java.util.Scanner;
public class _09_JavaRandom {
    public static void main(String[] args) {
        // Girilen bir sayıya kadar random sayı üreterek tahmit etmeye çalışınız
        //kullanıcı bilirse tebrikler yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Kaça kadar sayı tutulsun= ");
        int kacaKadarrandomSayi= oku.nextInt();
        System.out.print("Tahmininiz= ");
        int tahmin= oku.nextInt();
        int tutulanSayi=kacaKadarrandomSayi=(int)(Math.random()*kacaKadarrandomSayi);
        // 1. yöntem
        if (tutulanSayi==tahmin)
            System.out.println("Tebrikler");
        else
            System.out.println("bilemedinki bilemedinki");
        // 2. yöntem
        System.out.println((tutulanSayi==tahmin)?"Tebrikler":"bilemedinki bilemedinki");
        System.out.println("TutulanSayi= " + tutulanSayi);
    }
}
