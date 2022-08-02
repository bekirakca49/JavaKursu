package Gun19;

public class _03_Java2DArray {
    public static void main(String[] args) {

        // 2 ders, 3 öğrenclik bilgileri birarada tutacak tablo yazalım.

        int[][] tablo1=new int[2][3];// 2 satır 3 sütunluk veri, yani 6 elemanlır bir tanımlama
        int[][] tablo2={{23,44,55} , {66,77,88}};

        //       ma kim fiz
        // ogr1= 23 44 55
        // ogr2= 66 77 88
        
        for (int satir=0;satir<2;satir++)
        {
            for (int sutun=0;sutun<3;sutun++)
            {
                System.out.println("tablo2 satir= "+satir+",sutun= "+sutun+" = " + tablo2[satir][sutun]);
            }
        }
        int toplam=0;
        for (int satir=0;satir<2;satir++)
        {
            for (int sutun=0;sutun<3;sutun++)
            {
                toplam=toplam+tablo2[satir][sutun]; // tablo2[satir][sutun]-> bir sayı
            }
        }
        System.out.println("toplam = " + toplam);
        
    }
}
