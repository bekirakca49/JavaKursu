package Gun36.Protected.Paket2;

import Gun36.Protected.Paket1.P1Hayvan;

public class P2Kedi extends P1Hayvan {

    public P2Kedi(String ad, String cinsi){
        super.ad=ad; // kendi class ı olsa idi this. ile yazacaktık. üst class ın elemanı olduğu için super. dedik.
        super.cinsi=cinsi;
    }
    @Override
    public String toString() {
        return "P2Kedi{" +
                "ad='" + ad + '\'' +
                ", cinsi='" + cinsi + '\'' +
                '}';
    }

}
