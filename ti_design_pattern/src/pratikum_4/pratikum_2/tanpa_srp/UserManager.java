package pratikum_4.pratikum_2.tanpa_srp;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class UserManager {
    private final String name;
    private final String email;

    public UserManager(String name, String email){
        this.name = name;
        this.email = email;
    }

    public void saveToDatabase(){
        String folderPath = "ti_design_pattern/src/pratikum_4/pratikum_2/tanpa_srp";
        String fileName = "user.txt";

        File file = new File(folderPath + fileName);

        try (FileWriter writer = new FileWriter(file, true)){
            writer.write(name + " - " + email + "\n");
            System.out.println("pengguna berhasil disimpan: " + name);
        } catch (IOException e){
            System.out.println("gagal menyimpan pengguna: " + e.getMessage());
        }
    }

    public void sendWelcomeEmail(){
        System.out.println("\nmengirim email ke " + email + "....");
        System.out.println("halo " + name + ", selamat datang di sistem kami!\n");
    }


}
