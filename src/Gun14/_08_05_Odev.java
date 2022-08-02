package Gun14;
import java.util.Scanner;
public class _08_05_Odev {
    public static void main(String[] args) {
        //5- Sayı bulmaca oyununu tam hali ile cözünüz.
        Scanner oku=new Scanner(System.in);
        int toplam=0;
        int tahmin=0;
        int tutulanSayi=(int)(Math.random()*1000);
        do{
            System.out.print("Sayı giriniz= ");
            tahmin=oku.nextInt();

            if (tahmin>tutulanSayi){System.out.println("Büyük sayı girdiniz");}
            else if (tahmin<tutulanSayi) {System.out.println("Küçük sayı girdiniz");}
        }
        while (tahmin!=tutulanSayi);
                {System.out.println("Bildiniz tebrikler ");}
        }
    }
