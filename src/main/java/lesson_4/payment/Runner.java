package lesson_4.payment;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Создать класс Payment с внутренним классом,
с помощью объектов которого можно сформировать покупку из нескольких товаров.
 */
public class Runner {
    public static void main(String[] args) throws IOException {
        Payment payment = new Payment();
        Payment.Order purchase = payment.new Order();
        purchase.createShoppingList();
        payment.amountMoneyPay(purchase.getOrderList());
        payment.printShoppingList(purchase.getOrderList());
    }
}
