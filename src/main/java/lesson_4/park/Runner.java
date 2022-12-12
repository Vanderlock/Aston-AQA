package lesson_4.park;

import java.io.IOException;


public class Runner {
    public static void main(String[] args) throws IOException {
        Park park = new Park();
        Park.InfoAttraction purchasePark = park.new InfoAttraction();
        purchasePark.createShoppingAttractionList();
        park.amountMoneyPayAttraction(purchasePark.getInfoAttractionList());
        park.printShoppingAttractionList(purchasePark.getInfoAttractionList());
    }
}
