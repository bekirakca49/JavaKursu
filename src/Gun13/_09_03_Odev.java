package Gun13;

import java.util.Scanner;

public class _09_03_Odev {
    public static void main(String[] args) {
        //3- 20-80 arasında üretilen bir sayının birler basamağını yazı ile yazdırınız.
        Scanner oku=new Scanner(System.in);
        System.out.print("max= " );
        int max= oku.nextInt();

        System.out.print("min= " );
        int min= oku.nextInt();

        int numberInRange=(int)(Math.random()*(max-min)+1)+min; // ((80-20)+1)+20 demektir.
        int birler=numberInRange%10;
        System.out.println("numberInRange = " + numberInRange);

        switch (birler){
            case 0: System.out.print("sıfır");break;
            case 1: System.out.print("bir");break;
            case 2: System.out.print("iki");break;
            case 3: System.out.print("üç");break;
            case 4: System.out.print("dört");break;
            case 5: System.out.print("beş");break;
            case 6: System.out.print("altı");break;
            case 7: System.out.print("yedi");break;
            case 8: System.out.print("sekiz");break;
            case 9: System.out.print("dokuz");break;
            default: System.out.print("Hatalı bir giriş yapıldı");break;
        }
    }
}
