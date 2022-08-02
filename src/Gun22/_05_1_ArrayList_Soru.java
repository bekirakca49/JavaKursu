package Gun22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _05_1_ArrayList_Soru {
    public static void main(String[] args) {
        // Kullanıcıdan alacağınız 6 elemanlı bir dizinin
        // sadece tek elemannlarını ayrı diziye atayarak yazdırınız.
        Scanner oku = new Scanner(System.in);
        int[] dizi = new int[6];

        for (int i = 0; i < dizi.length; i++) {
            System.out.print(i + 1 + ".Sayı= ");
            dizi[i] = oku.nextInt();
        }
        System.out.println("Girilen rakamlar = " + Arrays.toString(dizi));

        // 1. yöntem
        ArrayList<Integer> tekler = new ArrayList<>();
        for (int i = 0; i < dizi.length; i++)
            if (dizi[i] % 2 == 1)
                tekler.add(dizi[i]);

        System.out.println("Tekler= " + tekler);
        // TODO: ödev: tek elemanlarını ayrı diziye bir metodda atayarak yazdırınız.

        ArrayList<Integer> donenTekler=tekElemanlarAta(dizi);
        System.out.println("donentekler = " + donenTekler);

        }
    public static ArrayList<Integer> tekElemanlarAta(int [] dizi){
        ArrayList<Integer> tekler = new ArrayList<>();
        for (int i = 0; i < dizi.length; i++)
            if (dizi[i] % 2 == 1)
                tekler.add(dizi[i]);
        return tekler;
    }
}
