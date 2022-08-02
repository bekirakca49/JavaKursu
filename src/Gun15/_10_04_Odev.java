package Gun15;
import java.util.Scanner;
public class _10_04_Odev {
    public static void main(String[] args) {
        //4- 0 ile 100 arasındaki sayılardan hem 4 e hem de 5 e tam bölnebilen sayıları ekrana yazdır

        for (int i=0;i<=100;i++){
           if(i%4==0 && i%5==0)
               System.out.println("i= "+i);
        }

    }
}
