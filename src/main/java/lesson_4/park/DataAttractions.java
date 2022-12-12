package lesson_4.park;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;

public class DataAttractions {

    public static List<Attraction> attractionList = new ArrayList<Attraction>() {
        {
            this.add(new Attraction("детские", "мишка косолапый", 5, 150));
            this.add(new Attraction("детские", "паровозик чих-пых", 3, 200));
            this.add(new Attraction("детские", "карусель гусеница", 2, 150));
            this.add(new Attraction("взрослые", "быстрые гонки", 3, 350));
            this.add(new Attraction("взрослые", "высокие приключения", 4, 400));
            this.add(new Attraction("взрослые", "цепочка", 4, 450));
            this.add(new Attraction("взрослые", "колесо обозрения", 5, 600));
            this.add(new Attraction("опасные", "американские гонки", 5, 600));
            this.add(new Attraction("опасные", "свободное падение", 5, 600));
            this.add(new Attraction("опасные", "ужасные истории", 10, 1500));
        }
    };

    //создание уникального списка аттракционов по наименованию
    private static Set<String> createThematicsSet() {
        Set<String> thematicsSet = new TreeSet<>();
        for (Attraction list : attractionList) {
            thematicsSet.add(list.getThematics());
        }
        return thematicsSet;
    }

    //ввод тематики атракциона и проверка его наличия в списке
    private static String readThematicsAttraction(BufferedReader reader) throws IOException {
        System.out.println("Выберите тематику аттракциона из списка: ");
        System.out.print(createThematicsSet() + " - ");
        String thematics;
        while (true) {
            thematics = reader.readLine();
            if (createThematicsSet().contains(thematics.toLowerCase())) {
                break;
            } else {
                System.out.print("Ничего не найдено, попробуйте еще раз: ");
            }
        }
        return thematics;
    }

    //Поиск аттракциона по наименованию
    private static List<Attraction> searchByThematicsAttraction(BufferedReader reader) throws IOException {
        String thematics = readThematicsAttraction(reader);
        List<Attraction> attractions = new ArrayList<>();
        for (Attraction attraction : attractionList) {
            if (thematics.equalsIgnoreCase(attraction.getThematics())) {
                attractions.add(attraction);
            }
        }
        return attractions;
    }


    //ввод наименования аттракциона и проверка его наличия в списке
    private static String readNameAttraction(Set<String> nameSet, BufferedReader reader) throws IOException {
        System.out.println("Выберите наименование аттракциона из списка: ");
        System.out.print(nameSet + " - ");
        String name;
        while (true) {
            name = reader.readLine();
            if (nameSet.contains((name.toLowerCase()))) {

                break;
            } else {
                System.out.print("Ничего не найдено, попробуйте еще раз: ");
            }
        }
        return name;
    }//Поиск аттракциона
    public static Attraction searchAttraction(BufferedReader reader) throws IOException {
        Attraction attraction = null;
        List<Attraction> list = searchByThematicsAttraction(reader);
        Set<String> nameSet = new TreeSet<>();
        for (Attraction element : list) {
            nameSet.add(element.getName());
        }
        String name = readNameAttraction(nameSet, reader);
        for (Attraction element : list) {
            if (name.equalsIgnoreCase(element.getName())) {
                attraction = element;
                break;
            }
        }
        return attraction;
    }

    //ввод количества минут
    public static int readMinute(BufferedReader reader) throws IOException {
        System.out.print("Введите количество минут: ");
        int minute = Integer.parseInt(reader.readLine());
        return minute;
    }

}