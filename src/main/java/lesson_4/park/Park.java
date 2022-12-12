package lesson_4.park;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import static lesson_4.park.DataAttractions.*;



/*
Создать класс Park с внутренним классом, с помощью объектов которого можно
хранить информацию об аттракционах, времени их работы и стоимости.
 */
public class Park {
    //Вычисление суммы денег к оплате за список аттракционов
    public int amountMoneyPayAttraction(Map<Attraction, Integer> shoppingAttractionList) {
        int sum = 0;
        double result = 0;
        for (Map.Entry<Attraction, Integer> pair : shoppingAttractionList.entrySet()) {
            result = Math.ceil((double)pair.getValue() / pair.getKey().getWorkMinute());
            sum += (int)result * pair.getKey().getPrice();
        }
        return sum;
    }

    //вывод в консоль информации об аттракционах
    public void printShoppingAttractionList(Map<Attraction, Integer> shoppingAttractionList) {
        System.out.println("Количество минут:");
        for (Map.Entry<Attraction, Integer> pair : shoppingAttractionList.entrySet()) {
            System.out.println(pair.getKey().toString() + " - " + pair.getValue() + " минут ");
        }
        System.out.println("Сумма к оплате: " + amountMoneyPayAttraction(shoppingAttractionList) + " руб. ");
    }

    public class InfoAttraction {
        private Map<Attraction, Integer> infoAttractionList;

        public Map<Attraction, Integer> getInfoAttractionList() {
            return infoAttractionList;
        }

        //Создание списка посещения аттракционов
        public void createShoppingAttractionList() throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            Map shoppingAttractionList = new HashMap<Attraction, Integer>();
            boolean search = true;
            while (search) {
                Attraction attraction = searchAttraction(reader);
                Integer minute = readMinute(reader);
                shoppingAttractionList.put(attraction, minute);
                while (true) {
                    System.out.print("Продолжить выбор товара (Y/N)? - ");
                    String continued = reader.readLine();
                    if (continued.equalsIgnoreCase("Y")) {
                        search = true;
                        break;
                    } else if (continued.equalsIgnoreCase("N")) {
                        search = false;
                        break;
                    } else {
                        System.out.println("Попробуйте еще раз.");
                    }
                }
            }
            this.infoAttractionList = shoppingAttractionList;
        }
    }
}