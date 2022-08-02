package Gun43;

public class _01_JavaRuntimeException {
    public static void main(String[] args) {
        System.out.println("Proğram çalıştı");
        String kelime="";
        if (kelime.length()>3) //burda hata engellenmiş oldu. çünke boşken 3. karekteri istemek zaten mantıksızdı.
            // proğramın kırılmasını önlemiş olduk. hata yönetimi yapmış olrduk.
        kelime.charAt(3);
        System.out.println("Proğram bitti");
    }
}

// daha çalışmadan önce oluşmuş eksiklerden kaynaklı hatalara
// derleme zamanı yani Compile error, Exception diyoruz.

// proğram çalıştıktan sonra çalışma zamanı içerisindeki hatalara
// çalışma zamanı yani RUNTIME ERROR, Exception hatası denir.

