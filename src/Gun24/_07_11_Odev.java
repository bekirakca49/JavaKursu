package Gun24;

import java.awt.desktop.AboutHandler;
import java.util.HashSet;

public class _07_11_Odev {
    public static void main(String[] args) {
        //1-Create a method totalCount()
        //totalCount() isminde bir method oluşturun.
        //Parametresi  'Integer Hashset' olmalı
        //HashSetteki eleman sayısını alın.
        //totalCount'u döndürün.
        //**Örnek:**_
        //hashset ; 4,2,3,1,7
        //cevap: 5

        HashSet<Integer> aHS=new HashSet<>();
        aHS.add(4);
        aHS.add(2);
        aHS.add(3);
        aHS.add(1);
        aHS.add(7);
        System.out.println("aHS = " + aHS);

        int totalCount=totalCount(aHS);
        System.out.println("totalCount = " + totalCount);
        System.out.println("aHS size = " + aHS.size());
    }
    public static int totalCount(HashSet<Integer> aHS){
        int totalCount=0;
        totalCount= aHS.size();
        return totalCount;
    }
}
