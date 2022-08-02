package Gun12;
import java.util.Scanner;
public class _10_03_Odev {
    public static void main(String[] args) {
        //3- Girilen 3 sayıdan en küçük olanını bulunuz
        Scanner oku=new Scanner(System.in);
        System.out.print("1.Sayı= ");
        int s1= oku.nextInt();
        System.out.print("2.Sayı= ");
        int s2= oku.nextInt();
        System.out.print("3.Sayı= ");
        int s3= oku.nextInt();

        int enb=Math.max(s1,Math.max(s2,s3));
        if (s1==s2 && s2==s3){System.out.println("Girilen 3 sayı eşit");}
        else {System.out.println("enb = " + enb);}
    }
}
