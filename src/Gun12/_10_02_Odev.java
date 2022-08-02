package Gun12;

import java.util.Scanner;

public class _10_02_Odev {
    public static void main(String[] args) {
        //2- Girilen bir sayı
       // Eğer int 9'a bölününce kalan 0 ise ve 5'e bölününce kalan 0 ise "Able to divide by 9 and 5" yazdırın.
        // Eğer int 4'e bölününce kalan 0 ise ve 5'e bölünüce kalan 0 ise "Able to divide by 4 and 15" yazdırın.

        Scanner oku=new Scanner(System.in);
        System.out.print("Bir sayı giriniz= ");
        int s=oku.nextInt();

        if (s%9==0 && s%5==0 ){System.out.println("Able to divide by 9 and 5");}
        else if (s%4==0 && s%5==0 ){System.out.println("Able to divide by 4 and 5");}
        else {System.out.println("Şartlara uygun  bir sonuç bulunamadı");}
    }
}