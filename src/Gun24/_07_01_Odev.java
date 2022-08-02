package Gun24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class _07_01_Odev {
    public static void main(String[] args) {
        //1-
        //ismi getCount() olan bir method oluşturun.
        //Parametre olarak bir String ArayList  ve  bir tane String
        //Return tipi int olmalı.
        //ArrayList'teki bir değerin kaç kez tekrarlandığını belirtin ve döndürün.
        //Örneğin;
        //ArrayList = Orange , Kiwi , Peach , Banana , Orange
        //String Orange:
        //Count = 2 olmalı. (Orange 2 kez yazılmış)
        ArrayList<String> aList = new ArrayList<>();
        int tekrar = 0;
        aList.add("Orange");
        aList.add("Kiwi");
        aList.add("Peach");
        aList.add("Banana");
        aList.add("Orange");
        aList.add("Banana");
        aList.add("Orange");
        aList.add("Orange");
        //getCount();
        int orangeKacAdet = 0;
        int count=0;
        String kelimeVeAdet=("");
        String kelime="";
        HashSet<String> sonuc=new HashSet<>();
        Collections.sort(aList);
        System.out.println("aList = " + aList);

        for (int i = 0; i < aList.size(); i++) {
           count=0;
            for (int j = 0; j <aList.size(); j++) {
                if (aList.get(i)== aList.get(j)) {
                    count++;
                    kelimeVeAdet=aList.get(i)+" adet= "+count;
                }
            }
            sonuc.add(kelimeVeAdet);
        }
        for (String i:sonuc) {
            System.out.println(i);
        }{
        }
    }
}
