package Gun10;
import java.util.Scanner;
public class _03_JavaIf {
    public static void main(String[] args) {
        // Girilen iki sayıdan büyük olanını  değerini ekrana yazdırınız. eşit ise eşit yazdırınız.
        Scanner oku=new Scanner(System.in);
        System.out.print("Sayı 1= ");
        int s1= oku.nextInt();
        System.out.print("Sayı 2= ");
        int s2= oku.nextInt();

        if (s1>s2){System.out.println("S1 büyüktür= "+s1);}
        if (s1<s2){System.out.println("S2 büyüktür= "+s2);}
        if(s1==s2){ System.out.println("Girilen sayılar birbirine eşit ");}
    }
}
