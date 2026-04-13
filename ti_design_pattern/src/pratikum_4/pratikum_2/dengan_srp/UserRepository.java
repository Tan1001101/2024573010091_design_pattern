package pratikum_4.pratikum_2.dengan_srp;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class UserRepository {
    private static final String  FOLDER_PATH= "ti_design_pattern/src/pratikum_4/pratikum_2/dengan_srp";
    private static final String DATABASE_FILE = "user.txt";

    public void save(User user){
        File file = new File(FOLDER_PATH + DATABASE_FILE);

        try (FileWriter writer = new FileWriter(file, true)){
            writer.write(user.getName() + " - " + user.getEmail() + "\n");
            System.out.println("pengguna berhasil disimpan: " + user.getName());
        } catch (IOException e){
            System.out.println("gagal menyimpan pengguna: " + e.getMessage());
        }
    }
}
