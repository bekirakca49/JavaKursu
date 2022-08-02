package Gun14;
import java.util.Scanner;
public class _08_01_Odev {
    public static void main(String[] args) {
       // 1- Girilen bir sayıya kadar olan sayıların çarpım sonucnu bulunuz.
        Scanner oku=new Scanner(System.in);
        System.out.print("Bir sayı giriniz= ");
        int s= oku.nextInt();
        int sayac=1;
        int carpim=1;

        while (sayac<=s){
            carpim=carpim*sayac;
            sayac++;
        }
        System.out.println("carpim = " + carpim);
    }
}
