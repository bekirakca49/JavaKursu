package Gun39._01_Ornek;

public class Ford extends BinekOto{
    @Override
    public String getMarka() {
        return "FORD";
    }

    @Override
    public void setMarka(String marka) {
        super.setMarka(marka);
    }

    @Override
    public int getUretimYili() {
        System.out.println("Üretildiği yıl= ");
        return super.getUretimYili();
    }

    @Override
    public void setUretimYili(int uretimYili) {
        super.setUretimYili(uretimYili);
    }

    @Override
    public int getVitesadedi() {
        return super.getVitesadedi();
    }

    @Override
    public void setVitesadedi(int vitesadedi) {
        super.setVitesadedi(vitesadedi);
    }
}
