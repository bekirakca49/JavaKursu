package Gun17;

import java.util.Scanner;

public class _01_JavaDiziNedir {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        int sayi; // daha önce değişkeni bu şekilde tanımlayarduk. 1 tane yer açtı.
        int[] dizi1=new int[5];// // 01234 indexli 5 adet sayılık yer açtı hafızada
        System.out.println("dizi1.length= "+dizi1.length);

        for (int i=0;i<dizi1.length;i++)
        {
            System.out.print("Notu giriniz= ");
            dizi1[i]= oku.nextInt();
        }
        System.out.println("dizi[4]= "+dizi1[4]);
    }
}
