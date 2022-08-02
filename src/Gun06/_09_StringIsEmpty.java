package Gun06;

public class _09_StringIsEmpty {
    public static void main(String[] args) {
        // bir stringin boş olup olmadığnı boolean olarak söyler
        String si1="Merhaba";
        System.out.println("s1.isEmty= "+ si1.isEmpty());  // false

        String s2=" ";
        System.out.println("s2.isEmty= "+ s2.isEmpty());  // false

        String s3="";
        System.out.println("s3.isEmty= "+ s3.isEmpty());  // true
    }
}
