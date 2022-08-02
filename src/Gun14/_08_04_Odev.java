package Gun14;
public class _08_04_Odev {
    public static void main(String[] args) {
        //0 ile 100 arasındaki sayılardan hem 4 e hem de 5 tam bölünebilen sayıları ekrana yazdırınız
        int sayac=1;
        while (sayac<=100){
            if (sayac%4==0 && sayac%5==0)
                System.out.println("sayac = " + sayac);
                sayac++;
        }
    }
}
