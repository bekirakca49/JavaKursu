package Gun10;
import java.util.Scanner;
public class _04_JavaIf {
    public static void main(String[] args) {
        // girilen bir sayının tek mi cift mi olduğunu yazdırınız.
        Scanner oku=new Scanner(System.in);
        System.out.print("Bir sayı giriniz= ");
        int s= oku.nextInt();

        if (s<0){s=s*-1;}
        if (s%2==0){System.out.println("Sayı çifttir");}
        if (s%2==1){System.out.println("Sayı tektir");}
    }
}
