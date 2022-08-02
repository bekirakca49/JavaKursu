package Gun05;

import java.util.Scanner;

public class _10_Ornek {
    public static void main(String[] args) {
        //Kullanıcıdan kaç bilet istediğini (byte) ve sigorta isteyip istemediğini (boolean olarak)
        // alıp ekrana yazdırınız.
        Scanner oku=new Scanner(System.in);
        System.out.print("Kaç tane bilet istiyorsunuz: ");
        int biletsayi=oku.nextInt();

        System.out.print("Sigorta istiyor musunuz?: ");
        boolean sigorta=oku.nextBoolean();

        System.out.println("biletsayi = " + biletsayi);
        System.out.println("sigorta = " + sigorta);
        System.out.println("biletsayi = " + biletsayi+", Sigorta= "+sigorta);

    }
}
