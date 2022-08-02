package Gun32._02_Ornek;

public class Soru {

    public static void main(String[] args) {
        // Bir User yetkilendirme modülü yapılması isteniyor.
        // USER ROLÜ : ADMIN, MUDUR, SATIS, PERSONEL
        // USER STATUSU : AKTIF, PASIF
        // Yukarıdaki şekilde bir USER class ı tanımlayınız
        // Farklı yetki ve statüde 2 kullanıcı ve bir de ADMIN
        // kullanıcısı tanımlayınız.ADMIN yetkili kullanıcıya
        // SILME işlemi kontrolü yapınız bir metod için.

        User user1=new User("bekir",Statu.AKTIF,Role.ADMIN);
        User user2=new User("hasan",Statu.AKTIF,Role.MUDUR);
        User user3=new User("ali",Statu.AKTIF,Role.PERSONEL);
        User user4=new User("mehmet",Statu.PASIF,Role.ADMIN);

        UserSil(user1);
        }
    public static void UserSil(User user){
        // admin silinemez
        if (user.role==Role.ADMIN)
            System.out.println("Admin Silinemez");
    }
}
