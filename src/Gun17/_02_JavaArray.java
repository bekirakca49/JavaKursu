package Gun17;

public class _02_JavaArray {
    public static void main(String[] args) {
        int[] dizi1=new int[5]; // 0,1,2,3,4
        int[] dizi2={5,77,8,99,0,4,555}; // hem uzunluğu hem değerleri verildi.uzulun ve eleman sayısı
        String[] kelimeler=new String[5]; // 5 tane kelime saklayabilen bir değişken.
        Boolean[] dizi3=new Boolean[5]; // 5 tane boolean saklayabilen bir dizi değişkeni
        double [] oranlar=new double[5]; // 5 tane doule cinsi saklayabilen bir dizi değişkeni

        for (int i=0;i< dizi1.length;i++)
            System.out.println("i = " + dizi1[i]);

        for (int i=0;i< dizi2.length;i++)
            System.out.println("i = " + dizi2[i]);

        for (int i=0;i< kelimeler.length;i++)
            System.out.println("i = " + kelimeler[i]);

        for (int i=0;i< dizi3.length;i++)
            System.out.println("i = " + dizi3[i]);

        for (int i=0;i< oranlar.length;i++)
            System.out.println("i = " + oranlar[i]);

    }
}
