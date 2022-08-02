package Gun05;

import java.util.Scanner;

public class _05_Ornek {
    public static void main(String[] args) {
        //Kullanıcıdan alacağınız 2 tam sayının toplamını ekrana yazdırınız.
        Scanner oku=new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz= ");
        int ilksayi=oku.nextInt();

        System.out.print("İkinci sayıyı giriniz= ");
        int ikincisayi=oku.nextInt();
                //1.yöntem
        int toplam=ilksayi+ikincisayi;
        System.out.println("Toplam: "+toplam);
            //2.yöntem
        System.out.println("Toplam= "+ (ilksayi+ikincisayi));  // rakamları yan yana topladı
        // çünkü toplama işleminde bir string var ise diğerleri otomatik string olur. Bu nedenle pranteze alınır.
    }
}
