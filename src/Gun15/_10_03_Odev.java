package Gun15;

import java.util.Scanner;

public class _10_03_Odev {
    public static void main(String[] args) {
        //3-  Kullanıcıdan 10 adet sayı isteyiniz, eğer sayı çift ise toplasın, tek ise girdiğinde ise döngü sonlansın.
        Scanner oku=new Scanner(System.in);
        int ciftToplam=0;
        int sayi=0;
        for (int i=0;i<10;i++){
            System.out.print("Sayı giriniz= ");
            sayi=oku.nextInt();

            if (sayi%2==1){
                System.out.println("Tek sayı girdiniz, döngüden çıkıyorum");
                break;
            }
            if (sayi%2==0){
                ciftToplam=ciftToplam+sayi;
            }
            System.out.println("ciftToplam = " + ciftToplam);
        }
        System.out.println("ciftToplam = " + ciftToplam);
    }
}
