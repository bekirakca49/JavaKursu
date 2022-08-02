package Gun06;

public class _08_StringEqualsIgnoreCase {
    public static void main(String[] args) {
        // equal ile aynı çalışır, büyük küçük harf ayırımı yapmaz

        String s1="Merhaba";
        String s2="MERHABA";
        System.out.println("esitMi="+s1.equalsIgnoreCase(s2)); // exit mi
    }
}
