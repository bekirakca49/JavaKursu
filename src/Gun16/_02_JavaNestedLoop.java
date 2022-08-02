package Gun16;
public class _02_JavaNestedLoop {
    public static void main(String[] args) {
        // aşağıdaki şekilde çıktı veren proğramı print içerisinde sadece bir tane # kullanarak yazdırınız
        String karekter="#";
        for (int i=1; i<=5;i++){
            for (int j=1;j<=5;j++)
                System.out.print("#");
            System.out.println();
        }
    }
}
