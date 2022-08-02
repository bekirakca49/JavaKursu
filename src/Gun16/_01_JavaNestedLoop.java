package Gun16;
public class _01_JavaNestedLoop {
    public static void main(String[] args) {
        ////2 lerin çarpım tablosunu sormuştuk.  2x1=2, 2x2=4....

        for (int j=1;j<10;j++){
            // 1 için çalışacak, sonra 2 için çalışacak...
            for (int i=1;i<=10;i++){
                System.out.println(j +" x "+i+ " = "+(j*i));
        }
            System.out.println();
        }
    }
}
