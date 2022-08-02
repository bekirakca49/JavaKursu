package Gun32._01_Ornek;

public class OrnekEnum {

    enum Aylar{
        OCAK, SUBAT,MART,NISAN,MAYIS,HAZIRAN,TEMMUZ,AGUSTOS,EYLUL,EKIM,KASIM,ARALIK
    }

    public static void main(String[] args) {
        int ayNo=5;
        Aylar ay=Aylar.MAYIS;
        switch (ay){
            case EKIM: System.out.println(28);break;
            case MART:
            case OCAK:
            case EYLUL:
            case KASIM:
            case MAYIS:
            case NISAN:
            case SUBAT:
            case ARALIK: System.out.println(31);break;
            case TEMMUZ:
            case AGUSTOS:
            case HAZIRAN:
        }
        System.out.println("ay = " + ay);
        System.out.println("ayName = " + ay.name());
        System.out.println("ay.ordinal() = " + ay.ordinal());

        for (Aylar a: Aylar.values())
            System.out.println(a.ordinal()+" " + a);
            if (ay==Aylar.MAYIS){
                System.out.println("Maaşlara zam ayı");
            }
    }

}
