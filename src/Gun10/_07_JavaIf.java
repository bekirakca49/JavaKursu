package Gun10;
import java.util.Scanner;
public class _07_JavaIf {
    public static void main(String[] args) {
        // girilen bir öğrencinin notuna göre 50 den büyük-eşit ise geçtiniz, küçük ise kaldınız yazdırınız.
        Scanner oku=new Scanner(System.in);
        System.out.print("Notu giriniz= ");
        int not= oku.nextInt();

        if (not>=50){System.out.println("Bu dersten geçtiniz, tebrikler");}
        if (not<50){System.out.println("Bu dersten kaldınız, tekrar bekleriz");}
    }
}
