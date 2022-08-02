package Gun19;
import java.util.Scanner;
public class _06_11_Odev {
    public static void main(String[] args) {
        //11- Girilen bir string deki harf sayısı tek ise true , değilse false yazdırınız.
        Scanner oku=new Scanner(System.in);
        System.out.print("Bir metin giriniz= ");
        String metin= oku.next();

            if (metin.length()%2==1){
                System.out.println("True");}
            else System.out.println("False");
    }
}
