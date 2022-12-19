package lesson_7;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class CSVFile {
    public static void main(String[] args) {
        String csvFile = "src/main/java/lesson_7/data.csv";
        BufferedReader reader = null;
        String line = "";
        String cvsSplitBy = ";";

        try {
            reader = new BufferedReader(new FileReader(csvFile));
            while ((line = reader.readLine()) != null) {

                // используем точку с запятой в качестве разделителя
                String[] value = line.split(cvsSplitBy);
                System.out.println(Arrays.toString(value));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
