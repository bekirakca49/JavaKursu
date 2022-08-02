package Gun20;
public class _00_Java {
    public static void main(String[] args) {
        int [][] tablo= {
                {1,2,3,},
                {2,3,1,},
                {5,5,5},
                {2,10,3}
        };
        int enb=tablo[0][0];
        System.out.println("satir= "+tablo.length);
        System.out.println("1.satirin sutun sayisi= "+tablo[0].length);
        System.out.println("2.satirin sutun sayisi= "+tablo[1].length);
        System.out.println("3.satirin sutun sayisi= "+tablo[2].length);
        System.out.println("4.satirin sutun sayisi= "+tablo[3].length);

        for (int i=0;i< tablo.length;i++)
        { // 3 her satirin eleman sayisini verir
            for (int j=0;j< tablo[i].length;j++)
            {
                if (tablo[i][j]>enb)
                    enb=tablo[i][j];
            }
        }
        System.out.println("enb= "+enb);
    }
}
