package Gun11;

import java.util.Scanner;

public class _01_IfElse {
    public static void main(String[] args) {
        //girilen bir öğrencinin notuna göre 50 den büyük ise büyük eşit ise geçtiniz. küçükse kaldınız yazınız.
        Scanner oku=new Scanner(System.in);
        System.out.print("Notu giriniz= ");
        int not= oku.nextInt();

        // if lerde her zaman kontrol edilme durumu vardır.
        // halbuki aşağıdaki if-else yapısında if şartı çalıştığında else kontrol edilmesine gerek kalmaz.
        // hangi not girilirse girilsin burası herzaman kontrol edilir.

        if (not>=50){
            System.out.println("Geçtiniz");} // baklava dilimi evet çıkışı
            else {
                System.out.println("Kaldınız"); // baklava dilimi hayır çıkışı
        }
    }
}
