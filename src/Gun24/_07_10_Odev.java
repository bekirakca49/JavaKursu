package Gun24;

import java.util.ArrayList;
import java.util.Arrays;

public class _07_10_Odev {
    public static void main(String[] args) {
        //10-Bir tane 2d array [][]   oluşturun ve elemanları =  [  [ 1, 2, 3 ],  [ 4, 5, 6 ],  [ 7, 8, 9 ] ]
        //Store all the elements in one arraylist and print the arraylist
        //Tüm elemanları bir arrayListe yükleyin ve bu arrayList'i yazdırın.
        //Örnek:
        //**Girdi:**
        //[
        // [ 1, 2, 3 ],
        // [ 4, 5, 6 ],
        // [ 7, 8, 9 ]
        //]
        //**Çıktı:** [1,2,3,4,5,6,7,8,9]
        int[][] a={{ 1, 2, 3 },  { 4, 5, 6 },  { 7, 8, 9 } };
        ArrayList<Integer> bList=new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j <a[i].length; j++) {
                bList.add(a[i][j]);
            }
        }
        System.out.println("bList = " + bList);
    }
}
