package Gun20;

import java.util.Scanner;

public class _04_JavaMethod {
    public static void main(String[] args) {
        tekmiCiftMi(3);
        tekmiCiftMi(4);
        tekmiCiftMi(55);
        tekmiCiftMi(66);
        tekmiCiftMi(78);

        tekmiCiftMiOku();

    }
    public static void tekmiCiftMi(int sayi){
        if (sayi%2==0)
            System.out.println("Cift");
        else System.out.println("Tek");
    }
    public static void tekmiCiftMiOku(){
        Scanner oku=new Scanner(System.in);
        System.out.println("Sayi giriniz= ");
        int sayi= oku.nextInt();
        if (sayi%2==0)
            System.out.println("Cift");
        else System.out.println("Tek");
    }
}
