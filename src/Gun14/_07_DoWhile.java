package Gun14;
import java.util.Scanner;
public class _07_DoWhile {
    public static void main(String[] args) {
        // kullanıcıda x girilene kadar ekrana "Proğram çalışıyor" yazan
        // ve x girildiğinde ise "Proğram bitti" yazan proğramı yazınız.

        Scanner oku=new Scanner(System.in);
        String metin;
        do{
            System.out.println("Proğram çalışıyor ");

            System.out.print("İşlemi giriniz= ");
            metin=oku.next();
        }
        while (!metin.equalsIgnoreCase("x"));
        //while (metin.equalsIgnoreCase("x")==false); kullanılabilir.
        System.out.print("Proğram bitti");
    }
}
