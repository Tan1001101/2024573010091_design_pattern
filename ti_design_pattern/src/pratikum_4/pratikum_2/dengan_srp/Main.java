package pratikum_4.pratikum_2.dengan_srp;

import pratikum_4.pratikum_2.tanpa_srp.UserManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("masukan nama pengguna: ");
        String name = scanner.nextLine();

        System.out.print("masukan email pengguna: ");
        String email = scanner.nextLine();

        User user = new User (name, email);
        UserRepository userRepository = new UserRepository();
        UserService userService = new UserService();

        userRepository.save(user);
        userService.sendWelcomeEmail(user);
    }
}
