package pratikum_4.pratikum_1.dengan_srp;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ReportSaver {
    public void saveToFile(String filename, String content) {
        String folderPath = "ti_design_pattern/src/pratikum_4/pratikum_1/dengan_srp";

        File file = new File(folderPath + filename);

        try (
                FileWriter writer = new FileWriter(file)){
            writer.write(content);
            System.out.println("laporan disimpan ke file: " + filename);
        } catch (
                IOException e){
            System.out.println("gagal menyimpan laporan: " + e.getMessage());
        }

    }
}
