package lesson_7;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppDataCSV {
    public static void main(String[] args) {
        List<AppData> appData = readFileFromCSV("src/main/java/lesson_7/data.csv");

        for (AppData a : appData) {
            System.out.println(a);
        }
    }

    public static List<AppData> readFileFromCSV (String fileName){
        List<AppData> appData = new ArrayList<>();
        Path pathToFile = Paths.get(fileName);

        try(BufferedReader br = Files.newBufferedReader(pathToFile,
                StandardCharsets.US_ASCII)){
            br.readLine();
            String line = br.readLine();

            while (line != null) {
                String [] variable = line.split(";");

                //convert string array to list
                List<String> list = Arrays.asList(variable);
                //AppData dataset = createAppData();
                // appData.add(dataset);
                line = br.readLine();
            }
        }catch (IOException ioe) {
            ioe.printStackTrace();
        }

        return appData;
    }

    private static StringBuilder createAppData() {
        StringBuilder sb = new StringBuilder();
        sb.append("value 1");
        sb.append(';');
        sb.append("value 2");
        sb.append(';');
        sb.append("value 3");
        sb.append('\n');

        sb.append("100");
        sb.append(';');
        sb.append("200");
        sb.append(';');
        sb.append("123");
        sb.append('\n');

        sb.append("300");
        sb.append(';');
        sb.append("400");
        sb.append(';');
        sb.append("500");
        sb.append('\n');

        return sb;
    }
}
