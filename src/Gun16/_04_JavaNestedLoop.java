package Gun16;

public class _04_JavaNestedLoop {
    public static void main(String[] args) {
        // aşağıdaki görüntüyü veren proğramı yazınız (yalnızca 1 yıldız ile yapınız)
        //******         1. satırda 5 yıldız
        //****           2. satırda 4 yılnız
        //***            3. satırda 3 yılnız
        //**             4. satırda 2 yılnız
        //*              5. satırda 1 yılnız

        for (int j=1;j<=5;j++){
            for (int i=1;i<=j;i++)
                System.out.println("*");
            System.out.println();
        }
    }
}
