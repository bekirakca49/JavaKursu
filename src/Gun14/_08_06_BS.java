package Gun14;

public class _08_06_BS {
    public static void main(String[] args) {
        //2-  0-100 arasındaki sayılardan teklerin ayrı çiftleri ayrı toplamını bulunuz


        int sayac = 1;
        int toplamTekler =0;
        int toplamCiftler=0;

        while (sayac < 100 ){
            if (sayac%2==1) {toplamTekler = toplamTekler + sayac;}
            else {toplamCiftler=toplamCiftler+sayac;}
            sayac++;}

            System.out.println("toplamTekler = " + toplamTekler);
            System.out.println("toplamCiftler = " + toplamCiftler);
    }
}



