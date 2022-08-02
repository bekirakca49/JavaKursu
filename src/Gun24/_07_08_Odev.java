package Gun24;

import java.util.ArrayList;
import java.util.Collections;

public class _07_08_Odev {
    public static void main(String[] args) {
        //8-secondMax()  isminde bir method oluşturun.
        //Parametre olarak integer ArrayList.
        //Return tipi int olmalı.
        //ArrayList'teki en yüksek (maximum) 2. değeri bulun ve onu döndürün
        //ÖRN;
        //ArrayList   --  5,3,4,6,7
        //CEVAP : 6

        ArrayList<Integer> a=new ArrayList<>();
        a.add(5);
        a.add(3);
        a.add(4);
        a.add(6);
        a.add(7);

        int secondMax=secondMax(a);
        System.out.println("secondMax = " + secondMax);

    }
    public static int secondMax(ArrayList<Integer> a){
        int secondMax=0;
        Collections.sort(a);
        Collections.reverse(a);
        System.out.println("a = " + a);
        for (int i=0;i<a.size();i++) {
            secondMax=a.get(1);
        }

        return secondMax;
    }
}
