package lesson_8;

import java.util.*;

public class RunnerArr {
    public static void main(String[] args) {

        foundDistinctWords(createArray());
        counterAllWords(createArray());
    }

    public static ArrayList<String> createArray (){
        //Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
        // Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
        // Посчитать, сколько раз встречается каждое слово.
        ArrayList<String> arr = new ArrayList<>();
        Collections.addAll(arr,"Человечик","Червячек","Половичек","Окно","Вантус","Плитка","Червячек",
                "Апельсин","Динамик","Батарейка","Вантус","Ноутбук","Червячек","Открывашка","Злодей","Червячек");
        return arr;
    }
    public static void foundDistinctWords(ArrayList<String> arr){
        ArrayList<String> buff = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++){
            if(!buff.contains(arr.get(i))){
                buff.add(arr.get(i));
            }
        }
        System.out.println(buff.toString());
    }
    public static void counterAllWords(ArrayList<String> arr){
        Set<String> unique = new HashSet<String>(arr);
        for (String key : unique) {
            System.out.println(key + ": " + Collections.frequency(arr, key));
        }

    }


}
