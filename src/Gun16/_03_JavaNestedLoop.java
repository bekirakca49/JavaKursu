package Gun16;
public class _03_JavaNestedLoop {
    public static void main(String[] args) {
        // aşağıdaki görüntüyü veren proğramı yazınız (yalnızca 1 yıldız ile yapınız)
        //*            1. satırda 1 yıldız
        //**           2. satırda 2 yılnız
        //***          3. satırda 3 yılnız
        //****         4. satırda 4 yılnız
        //*****        5. satırda 5 yılnız
        int s=5;

        for (int j=5;j>0;j--) {
            for (int i=1;i<=j;i++)
                System.out.print("*");

            System.out.println();
        } // aşağısı da aynı işlemi yapar..
        for (int j=1;j<=5;j++) {
            for (int i = 1; i <= (6 - j); i++)
                System.out.print("*");

            System.out.println();
        }
    }
}
