package Gun12;

public class _06_JavaMath {
    public static void main(String[] args) {
        int a=-12;
        int b=4;

        System.out.println("a nın mutlak değeri= "+Math.abs(a)); // yani - sayıları + ya çevirir.
        System.out.println("a ve b den en büyük olanı= "+Math.max(a,b));
        System.out.println("a ve b den en küçük olanı= "+Math.min(a,b));
        System.out.println("b nin karekökü= "+Math.sqrt(b)); // 2
        System.out.println("2 nin 3 kuvveti(2 üzeri 3)= "+Math.pow(2,3));
        System.out.println("round 3.1= "+Math.round(3.1));  // küsuratları alta veya üste yuvarlar
        System.out.println("round 3.5= "+Math.round(3.5)); // küsuratları alta veya üste yuvarla
        System.out.println("ceil 3.1= "+Math.ceil(3.1));   // bu rakamdan büyük en yakın tam sayı 4
        System.out.println("ceil 3.5= "+Math.ceil(3.5));    // bu rakamdan büyük en yakın tam sayı 4
        System.out.println("floor 3.1= "+Math.floor(3.1))   ;// küsuratları alta  yuvarla 3
        System.out.println("floor 3.5= "+Math.floor(3.5))   ;// bu rakamdan en küçük tam sayı 3

        Math.max(a, Math.max(a,b));

        // round üste yuvarla // ceil büyük olan en yakın sayı // floor 0,5 e kadar olanları alta, 0,5 den büyükleri bir üste yuvarlar.
    }
}
