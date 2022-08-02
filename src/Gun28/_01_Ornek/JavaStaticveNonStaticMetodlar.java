package Gun28._01_Ornek;

public class JavaStaticveNonStaticMetodlar {
    public static void main(String[] args) {
        //1. Yöntem Javanın kendi metodlarıyla yapılam çevirme
        int sayi=345;
        String strRakam=String.valueOf(sayi);
        int intRakam=Integer.parseInt(strRakam);

        //2. Yöntem kendi sınıfımı yazayım ve ordan kullanayım.
        Utility util=new Utility(); // burada nesne oluşturmuş oluyoruz.
        strRakam=util.getString(sayi);
        intRakam=util.getInt(strRakam);

        //3. Yöntem  Class a ait
        Math.max(3,4);
        strRakam=Utility.getString2(sayi);

        System.out.println("strRakam = " + strRakam);
        System.out.println("intRakam = " + intRakam);

    }
}
