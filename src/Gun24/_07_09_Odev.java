package Gun24;

import java.util.ArrayList;

public class _07_09_Odev {
    public static void main(String[] args) {
        //9-rangeBtw() isminde bir method oluşturun. Parametre olarak   bir Arraylist  ve iki ayrı int
        //return tipi int, Arraylist'in iki int arasında kaç değeri olduğunu sayın.
        //return  count       (sayacı (count) döndürün.)
        //Example (Örnek):
        //ArrayList: 1 , 5 , 22, 10 ,20 ,14 , 8 , 25 , 30, 28
        //min = 20
        //max = 30
        //return =  5    (20,22,25,28,30)
        //min ve max aralığı da  dahil (Örnek1 'deki 20 ve 30 da dahildir.)
        int max=30;
        int min=20;
        ArrayList<Integer> a=new ArrayList<>();
        a.add(1);
        a.add(5);
        a.add(22);
        a.add(10);
        a.add(20);
        a.add(14);
        a.add(8);
        a.add(25);
        a.add(30);
        a.add(28);

        int kacAdet=rangeBtw(a,max,min);
        System.out.println("kacAdet = " + kacAdet);
    }
    public static int rangeBtw(ArrayList<Integer> a, int max, int min){
       int kacAdet=0;
        for (int i = 0; i < a.size(); i++) {
            if (min<=a.get(i) && a.get(i)<=max){
                kacAdet+=1;
            }
        }
        return kacAdet;
    }
}
