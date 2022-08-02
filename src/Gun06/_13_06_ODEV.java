package Gun06;

public class _13_06_ODEV {
    public static void main(String[] args) {
        //**apple** olan bir String oluşturun. String'in _içinde_ **app** olup olmadığını **doğrula**.
        String t="apple";

        if (t.contains("app")){
            System.out.println("Bu kelime app içermektedir ");
        }
        else {
            System.out.println("Bu kelime app harflerini içermemektedir");
        }
    }
}
