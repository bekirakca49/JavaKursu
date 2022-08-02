package Gun19;

import java.util.Scanner;

public class _06_12_Odev {
    public static void main(String[] args) {
        //12- Scanner class kullanılarak verilen iki tane Stringi birbirlerine ekle.
        //Eger ilk kelimenin son harfi, ikinci kelimenin ilk harfi ile aynı ise aynı olan harflerin birisini kaldırın
        //Örnek: "abc", "cat" --> "abcat"
        //"abc", "dog" -->"abcdog"

        Scanner oku=new Scanner(System.in);
        String metin="";
        String butunMetin="";
        for (int i=0;i<2;i++){
            System.out.print((i+1)+". Metni giriniz= ");
            metin= oku.nextLine();
            butunMetin=butunMetin+metin;
        }
        System.out.println("Metin= "+butunMetin);
    }
}
