package Gun19;

import java.util.Arrays;

public class _05_Java2DArray {
    public static void main(String[] args) {
        //  {{1,2,3}, {2,3,1} , {5,5,5} , {2,10,3}}  int 2D arrayini  olustur
        // 2D arrayinden max number print et

        int [][] tablo={{1,2,3}, {2,3,1} , {5,5,5} , {2,10,3}};
        int enbuyuk=0;

        for (int i=0;i<4;i++)
            for (int j=0;j<3;j++){
               if (tablo[i][j]>enbuyuk)
                   enbuyuk=(tablo[i][j]);

                System.out.println("tablo[i][j] = "+i+j+" = " + tablo[i][j]);
                System.out.println("enbuyuk = " + enbuyuk);
            }
        
    }
}
