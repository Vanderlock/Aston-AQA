package lesson_7.product;
import java.io.*;
import java.util.ArrayList;

public class RunnerProduct {
    private static final String CSV_SEPARATOR = ";";
    public static void main(String[] args) {
        ArrayList<Product> productList = new ArrayList<Product>();
        productList.add(new Product(1, "Pen", 2.00, false));
        productList.add(new Product(2, "TV", 300, true));
        productList.add(new Product(3, "iPhone", 500, true));
        productList.add(new Product(4, "book", 30, true));
        writeToCSV(productList);
    }


    private static void writeToCSV(ArrayList<Product> productList)
    {
        try
        {
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("src/main/java/lesson_7/product/products.csv"), "UTF-8"));
            for (Product product : productList)
            {
                StringBuffer oneLine = new StringBuffer();
                oneLine.append(product.getId() <=0 ? "" : product.getId());
                oneLine.append(CSV_SEPARATOR);
                oneLine.append(product.getName().trim().length() == 0? "" : product.getName());
                oneLine.append(CSV_SEPARATOR);
                oneLine.append(product.getCostPrice() < 0 ? "" : product.getCostPrice());
                oneLine.append(CSV_SEPARATOR);
                oneLine.append(product.isVatApplicable() ? "Yes" : "No");
                bw.write(oneLine.toString());
                bw.newLine();
            }
            bw.flush();
            bw.close();
        }
        catch (UnsupportedEncodingException e) {}
        catch (FileNotFoundException e){}
        catch (IOException e){}
    }
}