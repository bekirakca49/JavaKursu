package Gun09;

import java.util.Scanner;

public class _09_12_Odev {
    public static void main(String[] args) {
        // 4- Kullanıcıdan vize ve final notunu alınız. ort = 0.4 * vize + 0.6 * final olarak bulunuz.
        Scanner oku=new Scanner(System.in);
        System.out.print("Vize notunu giriniz= ");
        double vize=oku.nextDouble();

        System.out.print("Final notunu giriniz= ");
        double final_=oku.nextDouble();

        double ortalama=(0.4*vize)+(0.6*final_);

        System.out.println("ortalama = " + ortalama);
    }
}
