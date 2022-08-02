package Gun17;

import java.util.Arrays;
import java.util.Scanner;

public class _05_JavaSplitMetodu {
    public static void main(String[] args) {
        // Split: bir Stringi parçalara ayırmak demek
        // Kullanıcıdan alacağınız cümleyi kelimelirine görü alt alta yazdırıız.

        Scanner oku=new Scanner(System.in);
        System.out.print(" Bir cümle giriniz = ");
        String cumle= oku.nextLine();
        String[] kelimeler=cumle.split(" ");
        System.out.println("Kelimeler"+ Arrays.toString(kelimeler));
        System.out.println("kelime = " + kelimeler.length);

        for (int i=0;i<kelimeler.length;i++){
            System.out.println("Kelimeler="+i+"--"+kelimeler[i]+" -- "+kelimeler[i].length());
        }
    }
}
