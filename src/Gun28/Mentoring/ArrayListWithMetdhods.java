package Gun28.Mentoring;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListWithMetdhods {
    public static void main(String[] args) {

        ArrayList<Integer> A=new ArrayList<>(List.of(0,1,2,3,4,5,6,7,8,9,10));
        ArrayList<Integer> B=new ArrayList<>(List.of(15,17,19,5,4,3,45,23,24,55,75));

        Collections.sort(A);
        Collections.sort(B);
        Collections.reverse(B);
        System.out.println("A = " + A);
        System.out.println("B = " + B);


        ArrayList<Integer> birlestir=birlestir(A,B);
        System.out.println("birlesik = " + birlestir);

    }
    public static ArrayList<Integer> birlestir(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> C = new ArrayList<>();
        C.addAll(A);
        C.addAll(B);
        Collections.sort(C);
        return C;
    }
}
