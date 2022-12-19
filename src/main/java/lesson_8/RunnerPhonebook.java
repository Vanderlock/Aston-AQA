package lesson_8;
import java.util.HashMap;

public class RunnerPhonebook {
    public static void main(String[] args) {
        distinctCountStrings("Кружка", "Пушка", "Мышка", "Кружка", "Кошка", "Тучка", "Кружка", "Кошка");
        System.out.println("========================================================================================");

        Phonebook phonebook = new Phonebook();
        phonebook.add("Солодуха Александр Антонович", "+79059998877");
        phonebook.add("Солодуха Александр Антонович", "+79051112233");
        phonebook.add("Котик Енотик Альбертович", "+79059998877");
        phonebook.add("Иванов Мирон Степанович", "+79056789876");
        phonebook.add("Беспалов Святополк Юхимович", "+79050005588");
        phonebook.add("Котик Енотик Альбертович", "+79034445566");
        phonebook.add("Котик Енотик Альбертович", "+79993332211");

        phonebook.getAllFio().forEach(e -> System.out.println("[" + e + "] ====> " + phonebook.getPhoneNumbersByFio(e)));
    }

    public static void distinctCountStrings(String... arrayString) {
        HashMap<String, Integer> dictStrings = new HashMap<>();
        for (String str : arrayString) {
            dictStrings.put(str, dictStrings.getOrDefault(str, 0) + 1);
        }
        System.out.println(dictStrings);
        System.out.println(dictStrings.keySet());
    }
}