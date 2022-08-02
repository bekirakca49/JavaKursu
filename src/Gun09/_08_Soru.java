package Gun09;
import java.util.Scanner;
public class _08_Soru {
    public static void main(String[] args) {
        //kullanıcının gireceği 2 sayının birbirine eşit mi? olup olmadığını yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("birinci sayiyi giriniz = ");
        int sayi1= oku.nextInt();
        System.out.print("ikinci sayiyi giriniz = ");
        int sayi2= oku.nextInt();

        System.out.println("sayi1 ve sayi2 eşit mi?="+ (sayi1==sayi2));
    }
}
