package Gun18;

public class _03_JavaArray {
    public static void main(String[] args) {
        // 100 elemanlı bir diziyi random olarak 100 e kadar olan sayılarla doldurunuz.
        // Sonrasında en büyük elemanı ve indexini bulunuz.

        int[] dizi=new int[100];
        int i=0;
        for (i=0;i<dizi.length;i++) {
            dizi[i] = (int) (Math.random() * 100);
            System.out.println("dizi["+i+"] = " + dizi[i]);
        }
        int enbIndex=0;
        int enb = dizi[0]; // dizilerden ilk elemanı atadık ki,kendi aralarında kıyas olması için

        for (i=0;i<dizi.length;i++) {
            if (dizi[i] > enb)
            enb = dizi[i];
            enbIndex=dizi[i];
        }
        System.out.println("en büyük sayı= "+enb);
        System.out.println("enbIndex = " + enbIndex);
    }
}
