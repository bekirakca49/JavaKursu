package Gun13;

import com.sun.source.tree.CaseLabelTree;
import com.sun.source.tree.SwitchTree;

import java.awt.*;
import java.util.Scanner;

public class _08_01_Odev {
    public static void main(String[] args) {
        // 1- Girilen bir ay numarasına göre , ayın hem adını hem de kaç gün olduğunu sayı ile yazdırınız
        Scanner oku = new Scanner(System.in);
        System.out.print("Lütfen ay numarasını giriniz= ");
        int ayNo = oku.nextInt();

        switch (ayNo){
            case 1: System.out.println("Ocak");break;
            case 2: System.out.println("Şubat");break;
            case 3: System.out.println("Mart");break;
            case 4: System.out.println("Nisan");break;
            case 5: System.out.println("Mayıs");break;
            case 6: System.out.println("Haziran");break;
            case 7: System.out.println("Temmuz");break;
            case 8: System.out.println("Ağustos");break;
            case 9: System.out.println("Eylül");break;
            case 10: System.out.println("Ekim");break;
            case 11: System.out.println("Kasım");break;
            case 12: System.out.println("Aralık");break;
            default: System.out.println("Hatalı bir bilgi girişi oldu");break;
        }
    }
}
