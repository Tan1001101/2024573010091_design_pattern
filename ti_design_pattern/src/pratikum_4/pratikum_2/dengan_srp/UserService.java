package pratikum_4.pratikum_2.dengan_srp;

public class UserService {
    public void sendWelcomeEmail(User user){
        System.out.println("\nmengirim email ke " + user.getEmail() + "....");
        System.out.println("halo " + user.getName() + ", selamat datang di sistem kami!\n");
    }
}
