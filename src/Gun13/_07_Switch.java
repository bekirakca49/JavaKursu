package Gun13;

import java.util.Scanner;

public class _07_Switch {
    public static void main(String[] args) {
        // girilen bir sayının onlar basamağının değerini yazı ile yazdırınız.
        Scanner oku=new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz=");
        int s=oku.nextInt();
        int onlarBasamak=(s/10)%10;

        switch (onlarBasamak) {
            case 0: System.out.println("Onlar basamağı= Sıfır");break;
            case 1: System.out.println("Onlar basamağı= Bir");break;
            case 2: System.out.println("Onlar basamağı= İki");break;
            case 3: System.out.println("Onlar basamağı= Üç");break;
            case 4: System.out.println("Onlar basamağı= Dört");break;
            case 5: System.out.println("Onlar basamağı= Beş");break;
            case 6: System.out.println("Onlar basamağı= Altı");break;
            case 7: System.out.println("Onlar basamağı= Yedi");break;
            case 8: System.out.println("Onlar basamağı= Sekiz");break;
            case 9: System.out.println("Onlar basamağı= Dokuz");break;
            default: System.out.println("Hatalı bir işlem yapıldı");break;
        }
    }
}
