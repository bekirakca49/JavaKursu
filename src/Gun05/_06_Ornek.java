package Gun05;

import java.util.Scanner;

public class _06_Ornek {
    public static void main(String[] args) {
        // Bir karenin kenarını kullanıcıdan isteyip çevreseni ve alanını bulunuz
        Scanner oku=new Scanner(System.in);
        System.out.print("kenar uzunluğunu giriniz = ");
        int kenar= oku.nextInt();

        int cevre=kenar*4;
        int alan=kenar*kenar;

        System.out.println("alan = " + alan);
        System.out.println("kenar = " + kenar);
        System.out.println("cevre = " + cevre);
    }
}
