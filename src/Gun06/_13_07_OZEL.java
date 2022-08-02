package Gun06;

import java.util.Scanner;

public class _13_07_OZEL {
    public static void main(String[] args) {
        // 1- Girilen bir cümlede kaç kelime olduğunuz bulunuz
        Scanner scan=new Scanner(System.in);
        int sayac = 1;

        System.out.print("Cumle giriniz: ");
        String cumle =scan.nextLine();

        for(int i = 0; i < cumle.length(); i++)
        { if(cumle.charAt(i) == ' ') {sayac++;} }
        System.out.println("Girilen cumlede " + sayac + " tane kelime vardir.");
    }
}
