package Gun36._04_Odev;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Okul {
    private String  okulAdi="Zağnos";
    private int okulKapasitesi=3;
    ArrayList<Okul> list=new ArrayList<>();

    public Okul(String okulAdi, int okulKapasitesi, ArrayList<Okul> list) {
        setList(list);
        setOkulKapasitesi(okulKapasitesi);
        setOkulAdi(okulAdi);
    }

    public String getOkulAdi() {
        return okulAdi;
    }

    public int getOkulKapasitesi() {
        return okulKapasitesi;
    }

    public void setOkulKapasitesi(int okulKapasitesi) {
        this.okulKapasitesi = okulKapasitesi;
    }

    public ArrayList<Okul> getList() {
        return list;
    }

    public void setList(ArrayList<Okul> list) {
        this.list = list;
    }

    public void setOkulAdi(String okulAdi) {
        this.okulAdi = okulAdi;
    }
}
