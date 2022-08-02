package Gun27._03_Ornek;

public class ElektrikHesabi {
    //2.Adım  :ElektrikHesabi isimli (fields : toplamTuketim, oran(double), OdenecekTutar) class tanımlayınız

    int toplamTuketim=0;
    double birimFiyat=(0.7); // bu birim fiyat
    int OdenecekTutar=0;

    public void tuketimEkle(int tuketim)
    {
        toplamTuketim+=tuketim;
    }

    public void toplamTuketimYaz()
    {
        System.out.println("toplamTuketim = " + toplamTuketim);
    }
    public void odeneceTutarYaz()
    {
        System.out.println("Ödenecek Tutar = " + (birimFiyat*toplamTuketim));
    }
}
