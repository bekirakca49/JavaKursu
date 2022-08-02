package Gun13;

import java.util.Scanner;

public class _03_IfElseIF {
    public static void main(String[] args) {
        // soru: kullanıcıdan "Fizik: 90" şeklinde not bilgisini alınız.
        // >=90 için A   // >=80 için  // >=70 için C // >=60 için D  // >=40 için E  // <40 için F   yazdırınız

        Scanner oku=new Scanner(System.in);
        System.out.print("Ders ve notu= "); // Fizik:77  Kimya90   regex aklımıza gelmeli.
        String dersNot= oku.next();

        int ogrNot=Integer.parseInt(dersNot.replaceAll("[^0-9]","")); // [0-9] rakamları al ve boşalt ([^0-9]) rakamların dışındakileri boşalt
        String dersAd=dersNot.replaceAll("[0-9]",""); // rakamları boşalt

        System.out.println("ogrNot = " + ogrNot);
        System.out.println("dersAd = " + dersAd);

        if (ogrNot >=90)
            System.out.println("A");
        else if (ogrNot >=80)
            System.out.println("B");
        else if (ogrNot >=70)
            System.out.println("C");
        else if (ogrNot >=60)
            System.out.println("D");
        else if (ogrNot >=40)
            System.out.println("E");
        else if (ogrNot <40)
            System.out.println("F");
        else System.out.println("Geçerli bir not girmediniz ");
    }
}
