package Gun42.StringIslemleri;

public class _01_StringKarsilastirma {
    public static void main(String[] args) {
        String cumle1="Bugün hava çok güzel";
        String cumle2="Bugün hava çok güzel";
        String cumle3=new String("Bugün hava çok güzel");
        String cumle4=new String("Bugün hava çok güzel");

        if(cumle1==cumle2) // ilkel tipler için DEĞERLERİ aynı mı?, Nesneler için aynı nesne mi.
            System.out.println("Cümle1 Cümle2 ye EŞİT");
        else
            System.out.println("Cümle1 Cümle 2 ye eşit DEĞİL");
        if(cumle1.equals(cumle2)) // ilkel tipler ve nesneler için DEĞERLERİ AYNI MI?
            System.out.println("Cümle1 Cümle2 ye EŞİT");
        else
            System.out.println("Cümle1 Cümle 2 ye eşit DEĞİL");

        //********** nesneler için sonuçlar **************/
        if(cumle3==cumle4) // ilkel tipler için DEĞERLERİ aynı mı?, Nesneler için aynı nesne mi.
            System.out.println("Cümle3 Cümle4 ye EŞİT");
        else
            System.out.println("Cümle3 Cümle 4 ye eşit DEĞİL");
        if(cumle3.equals(cumle4)) // ilkel tipler ve nesneler için DEĞERLERİ AYNI MI?
            System.out.println("Cümle3 Cümle4 ye EŞİT");
        else
            System.out.println("Cümle3 Cümle4 ye eşit DEĞİL");

    }
}
