package Gun15;
public class _10_02_Odev {
    public static void main(String[] args) {
        //2- # 0 ile 100 arasındaki hem 5'e, hem de 4'e bölünebilen bütün sayıları yazdırınız.
        //`Sonuç bu şekilde olmalıdır.`
        //```
        //0
        //20
        //40
        //60
        //80
        //100
        //```
        for(int i=1;i<=100;i++)
            if(i%5==0 && i%4==0)
                System.out.println("i = " + i);
    }
}
