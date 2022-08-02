package Gun17;
import java.util.Arrays;
import java.util.Scanner;
public class _07_11_Odev {
    public static void main(String[] args) {
        //12-Kullanıcıdan alacağınız 5 ayrı kelimeyi bir diziye atayınız,
        // Kelimelerden en uzun olanının ilk ve son harfininin yerlerini değiştiriniz.

        Scanner oku=new Scanner(System.in);
        String[] dizi=new String[5];

        for (int i=0;i<dizi.length;i++){
            System.out.print( (i+1)+". Kelimeyi giriniz= ");
            dizi[i]= oku.next();
        }
        int enuzun=dizi[0].length();
        char ilkharf=' ';
        char sonharf=' ';
        String aralik="";

        for (int i=0;i<dizi.length;i++) {
            if (dizi[i].length()>enuzun) {
                enuzun = dizi[i].length();

                ilkharf=dizi[i].charAt(0);
                sonharf=dizi[i].charAt(dizi[i].length()-1);
                aralik = dizi[i].substring(1, dizi[i].length() - 1);
                dizi[i]=(sonharf+aralik+ilkharf);
            }
            System.out.println("Arrays.toString(dizi) = " + Arrays.toString(dizi));
            }
    }
}
