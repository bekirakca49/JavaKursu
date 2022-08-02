package Gun24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.LinkedTransferQueue;

public class _07_06_Odev {
    public static void main(String[] args) {
        //6-hillNum() isminde bir method oluşturun.
        //Parametre olarak Integer ArrayList
        //Return tipi int,
        //Eğer sayı, önceki sayıdan küçük ve bir sonraki sayıdan büyük ise, o sayıyı yazdırın.
        //Örneğin;
        //ArrayList  5,4,6,2,1
        //2, 6'dan küçük ve 1 den büyüktür.
        //Return 2 olmalı.
        ArrayList<Integer> a = new ArrayList<>();
        a.add(5);
        a.add(4);
        a.add(6);
        a.add(2);
        a.add(1);

        System.out.println("a = " + a);

        int karsilastirma = hillNum(a);

        System.out.println("önceki sayıdan küçük ve bir sonraki sayıdan büyük sayı = " + karsilastirma);
    }
    public static int hillNum (ArrayList < Integer > a) {
        int karsilastirma = 0;
        for (int i = 0; i < a.size(); i++) {
            for (int j = 0; j < a.size(); j++) {
                if (a.get(i) > a.get(j)) {
                    karsilastirma = a.get(i);
                    if (karsilastirma > a.get(i))
                        karsilastirma = a.get(i);
                }
            }
        }
        return karsilastirma;
    }
}
