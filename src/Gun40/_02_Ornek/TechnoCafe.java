package Gun40._02_Ornek;

import java.util.ArrayList;
import java.util.Scanner;

public class TechnoCafe {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);

        int secim=0;
        double toplamUcret=0;
        System.out.println("toplamUcret = " + toplamUcret);
        do {
            menuYaz();
            secim= oku.nextInt();
            if(secim<6 && secim>0){
                islemYap(secim,toplamUcret);
            }

        }while (secim<5);


    }
    public static void menuYaz(){
        System.out.println(" --------------- Menü --------------");
        System.out.println("1. Adana Kebap (55 TL");
        System.out.println("2. Lahmacun (55 TL");
        System.out.println("3. Borsh (33 TL");
        System.out.println("4. Palov (33 TL");
        System.out.println("5. Tamam");
    }
    public static double islemYap(int secim, double toplamUcret){
        double toplamUcret1 = toplamUcret;
        toplamUcret1 =0;
        ArrayList<Food> f=new ArrayList<>();
        switch (secim){
            case 1: AdanaKebab ak=new AdanaKebab();ak.ucret();ak.getClass().getSimpleName();
            f.add(ak);
                System.out.println("ak = " + ak.getClass().getSimpleName());
                System.out.println("ak.ucret() = " + ak.ucret());
            toplamUcret1 = toplamUcret1 +ak.ucret();
            System.out.println("toplamUcret = " + toplamUcret1);
            return toplamUcret1;
            case 2: Borsh br=new Borsh(); break;
            case 3: break;
            case 4: break;
            case 5: break;
        }
        return toplamUcret;
    }

}
