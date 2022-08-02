package Gun06;

public class _12_04_Odev {
    public static void main(String[] args) {
        //**orange** kelimesinden oluşan bir String oluşturun.
        //String in **Apple** a eşit olup olmadığını doğrulayın.
        String s1="orange";

        System.out.println("s1 eşi mi? Apple ye = " + s1.equals("Apple"));
        System.out.println("s1 eşi mi? Apple ye = " + s1.equalsIgnoreCase("Apple"));
    }
}
