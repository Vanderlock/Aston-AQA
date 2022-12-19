package lesson_7.product;
import java.io.File;

public class RunnerBeatyProduct {
    public static void main(String[] arg)
    {
        BeatyProduct[] list = new BeatyProduct[5];
        list[0] = new BeatyProduct("dvd", 24.99, 967, true);
        list[1] = new BeatyProduct("pen", 4.99, 162, false);
        list[2] = new BeatyProduct("ipad", 624.99, 234, true);
        list[3] = new BeatyProduct("crayons", 4.99,127, false);
        list[4] = new BeatyProduct("laptop", 1444.99, 997, true);
        CSVWriter.generateCSV(new File("src/main/java/lesson_7/product/beatyproducts.csv"),list);
    }
}