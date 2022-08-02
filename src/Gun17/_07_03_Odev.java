package Gun17;
public class _07_03_Odev {
    public static void main(String[] args) {
        //3- int Array oluşturun ve elemanları : 14 , 19 , 5 , 21
        // En küçük (minimum) sayıyı yazdırınız.

        int[] dizi={14,19,5,21};
        int  enK=0;

        for (int i=0;i<dizi.length;i++)
        {
            if (i == 0) {
                enK=dizi[i];
            }
            if (dizi[i]<enK){
                enK = dizi[i];
            }
        }
        System.out.println("En küçük (minimum)= " + enK);
    }
}
