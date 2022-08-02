package Gun12;

import java.util.Scanner;

public class _10_05_Odev {
    public static void main(String[] args) {
        //    Girilen Bir öğrencinin notunu belirleyen bir Java programı yazın.
        //Program üç tür puan (sınav, ara sınav ve final puanı) okuyacak ve notu aşağıdaki kurallara göre belirleyecektir:
        //Eğer ortalama not >=90% =>not=A
        //Eğer ortalama not >= 70% ve<90% => not=B
        //Eğer ortalama not >=50% ve <70% =>not=C
        //Eğer ortalama not <50% =>note=F
        //Aşağıdaki örnek çıktıya bakın:
        //int Quiz_score: 80 int mid_term_score: 68 int Final_score: 90 print (Your grade is B (Notunuz B'dir)
        Scanner oku=new Scanner(System.in);
        System.out.print("Sınav Notu= ");
        int sinav= oku.nextInt();
        System.out.print("Ara Sınav Notu= ");
        int araSinav= oku.nextInt();
        System.out.print("Final Notu= ");
        int finalNot= oku.nextInt();

        int not=(sinav+araSinav+finalNot)/3;
        System.out.println("notOrtalama = " + not);

        if (not>=90){ System.out.println("Not= A");}
        if (not>=70 && not<90){ System.out.println("Not= B");}
        if (not<70){System.out.println("Not= C");}
    }
}
