package Gun24;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class _07_07_Odev {
    public static void main(String[] args) {
        //7-common_values() isminde bir method oluşturun. Parametre olarak 2 tane Integer ArrayList
        //Return tipi integer ArrayList olmalı
        //İki arraylist alın ve arraylist'teki tüm ortak değerleri döndürün
        //Örneğin;
        //ArrayList 1:    3 , 2 , 5 , 6
        //ArrayList 2:     5 , 8 , 9
        //return  5 olmalı
        //Örneğin;
        //ArrayList 1: 8,7,9,6,7
        //ArrayList 2: 6,7,12,3,1
        //return 6 ve 7 olmalı

        ArrayList<Integer> a=new ArrayList<>();
        a.add(8);
        a.add(7);
        a.add(9);
        a.add(6);
        a.add(7);
        ArrayList<Integer> b=new ArrayList<>();
        b.add(6);
        b.add(7);
        b.add(12);
        b.add(3);
        b.add(1);

        HashSet ortakElemanlar=common_values(a,b);
        System.out.println("ortakElemanlar = " + ortakElemanlar);
    }
    public static HashSet<Integer> common_values(ArrayList<Integer> s1,ArrayList<Integer> s2){
      HashSet<Integer> ortakElemanlar=new HashSet<>();

        for (int i = 0; i < s1.size(); i++) {
            for (int j = 0; j < s2.size(); j++) {
                if(s1.get(i)==s2.get(j)){
                    ortakElemanlar.add(s1.get(i));
                }
            }
        }
        return ortakElemanlar;
    }
}
