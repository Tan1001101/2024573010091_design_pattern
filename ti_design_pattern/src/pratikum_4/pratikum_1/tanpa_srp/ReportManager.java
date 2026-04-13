package pratikum_4.pratikum_1.tanpa_srp;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ReportManager {
    private final String content;

    public ReportManager(String content){
        this.content = content;
    }

    public String generateReport(){
        return "=== LAPORAN ===\n" + content + "\n============";
    }

    public void saveToFile(String filename){
        String folderPath = "ti_design_pattern/src/pratikum_4/pratikum_1/tanpa_srp";

        File file = new File(folderPath + filename);

        try (FileWriter writer = new FileWriter(file)){
            writer.write(content);
            System.out.println("laporan disimpan ke file: " + filename);
        } catch (IOException e){
            System.out.println("gagal menyimpan laporan: " + e.getMessage());
        }
    }

    public void printReport(){
        System.out.println("\nlaporan yang dicetak\n" + content);
    }
}
