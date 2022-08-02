package Gun24;

import java.util.ArrayList;

public class _07_02_Odev {
    public static void main(String[] args) {
         //2. getSum() isminde bir method oluşturun. Parametresi ArrayList olmalı
        // Return tipi int olmalı.
        //ArrayList teki tüm sayıları birbiri ile toplayın.
        //return olarak toplam sonucu döndürün.
        //Örneğin;   Arraylist = 1,2,3,4,5
        //return 15 olmalı
        ArrayList<Integer> aList=new ArrayList<>();
        aList.add(1);
        aList.add(2);
        aList.add(3);
        aList.add(4);
        aList.add(5);

        int toplam=getSum(aList);
        System.out.println("toplam = " + toplam);
    }
    public static int getSum(ArrayList<Integer> aList){
       int toplam=0;
        for (int i = 0; i < aList.size(); i++) {
            toplam=toplam+aList.get(i);
        }
        return toplam;
    }

}
