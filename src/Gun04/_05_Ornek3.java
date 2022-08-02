package Gun04;

public class _05_Ornek3 {
    public static void main(String[] args) {
        //kişinin ağırlığını  double, boyunu int olarak değerler veriniz.
        // ve bir satırda boyunuz: .... ve kilonuz: ..... yazdırınız.
        // vücut kitle indeksini bularak yazınız. (kg/boy*boy)
        double kilo=125.3;
        int boy=175;

        int kitleIndex1=(int)kilo/(boy*boy);
        double kitleIndex2=kilo/(boy*boy);

        System.out.println("boyunuz="+boy+""+"kilonuz= "+kilo+""+" kitleIndeksiniz="+kitleIndex1);
        System.out.println("kitleIndex1 = " + kitleIndex1);
        System.out.println("kitleIndex2 = " + kitleIndex2);
    }
}
