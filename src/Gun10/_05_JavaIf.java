package Gun10;
import java.util.Scanner;
public class _05_JavaIf {
    public static void main(String[] args) {
        //girilen bir sayının birler basamağın yazı ile yazınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Bir  sayı giriniz= ");
        int s= oku.nextInt();

        int birlerBasamak=s%10; // birler basamağını aldık.
        if (birlerBasamak==0){System.out.println("birler basamağı sıfırdır");}
        if (birlerBasamak==1){System.out.println("birler basamağı birdir");}
        if (birlerBasamak==2){System.out.println("birler basamağı ikidir");}
        if (birlerBasamak==3){System.out.println("birler basamağı üçdür");}
        if (birlerBasamak==4){System.out.println("birler basamağı dörttür");}
        if (birlerBasamak==5){System.out.println("birler basamağı beştir");}
        if (birlerBasamak==6){System.out.println("birler basamağı altıdır");}
        if (birlerBasamak==7){System.out.println("birler basamağı yedidir");}
        if (birlerBasamak==8){System.out.println("birler basamağı sekizdir");}
        if (birlerBasamak==9){System.out.println("birler basamağı dokuzdur");}
    }
}
