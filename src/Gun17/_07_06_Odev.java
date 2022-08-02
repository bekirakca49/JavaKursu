package Gun17;

import java.util.Arrays;

public class _07_06_Odev {
    public static void main(String[] args) {
        //7- Oluşturacağınız int array'ini, length'i(eleman sayısı) 2 olan ve int array'inin(ilk oluşturduğunuz array)
        // ilk ve son elementlerini kapsayan yeni array'e return edin.
        // Oluşturacağınız int array'i =   ([1, 2, 3, 4])
        //Sonuç bu şekilde olmalıdır. [1, 4]
        int[] dizi={1,2,3,4};
        int[] yeniDizi=new int[2];

        yeniDizi[0]=dizi[0];
        yeniDizi[1]=dizi[dizi.length-1];
        System.out.println("Arrays.toString(yeniDizi) = " + Arrays.toString(yeniDizi));
    }
}
