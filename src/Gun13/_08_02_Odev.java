package Gun13;

import java.util.Scanner;

public class _08_02_Odev {
    public static void main(String[] args) {
        //2- Girilen 3 basamaklı bir sayıyı yazı ile yazdırınız.
        Scanner oku=new Scanner(System.in);
        System.out.print("Üç basamaklı bir sayı giriniz= ");
        int s= oku.nextInt();

        int yuzler=(s/100)%10;
        int onlar=(s/10)%10;
        int birler=s%10;

        switch (yuzler){
            case 1: System.out.print("yüz");break;
            case 2: System.out.print("ikiyüz");break;
            case 3: System.out.print("üçyüz");break;
            case 4: System.out.print("dörtyüz");break;
            case 5: System.out.print("beşyüz");break;
            case 6: System.out.print("altıyüz");break;
            case 7: System.out.print("yediyüz");break;
            case 8: System.out.print("sekizyüz");break;
            case 9: System.out.print("dokuzyüz");break;
            default: System.out.print("Hatalı bir giriş yapıldı");break;
        }
        switch (onlar){
            case 0: System.out.print("");break;
            case 1: System.out.print("on");break;
            case 2: System.out.print("yirmi");break;
            case 3: System.out.print("otuz");break;
            case 4: System.out.print("kırk");break;
            case 5: System.out.print("elli");break;
            case 6: System.out.print("altmış");break;
            case 7: System.out.print("yetmiş");break;
            case 8: System.out.print("seksen");break;
            case 9: System.out.print("doksan");break;
            default: System.out.print("Hatalı bir giriş yapıldı");break;
        }
        switch (birler){
            case 0: System.out.print("");break;
            case 1: System.out.print("bir");break;
            case 2: System.out.print("iki");break;
            case 3: System.out.print("üç");break;
            case 4: System.out.print("dört");break;
            case 5: System.out.print("beş");break;
            case 6: System.out.print("altı");break;
            case 7: System.out.print("yedi");break;
            case 8: System.out.print("sekiz");break;
            case 9: System.out.print("dokuz");break;
            default: System.out.print("Hatalı bir giriş yapıldı");break;
        }
    }
}
