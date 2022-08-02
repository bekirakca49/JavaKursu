package Gun12;

import java.util.Scanner;

public class _02_IfElse {
    public static void main(String[] args) {
        //Girilen bir sayının pozitif, negatif veya sıfır olduğunu yazınız
        Scanner oku=new Scanner(System.in);
        System.out.print("Lütfen bir rakam giriniz= ");
        int s= oku.nextInt();

        if (s>0){
            System.out.println("Sayı pozitif");
        }
        if (s<0){
            System.out.println("Sayı negatif");
        }
        else System.out.println("Sayı sıfır");
    }
}
