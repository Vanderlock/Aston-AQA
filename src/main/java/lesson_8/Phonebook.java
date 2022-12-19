package lesson_8;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Phonebook {
    private HashMap<String, HashSet<String>> dictPhonebook;

    public Phonebook() {
        dictPhonebook = new HashMap<>();
    }

    public void add(String fio, String phone) {
        if(!dictPhonebook.containsKey(fio)) {
            dictPhonebook.put(fio, new HashSet<>());
        }
        dictPhonebook.get(fio).add(phone);
    }
    public Set<String> getPhoneNumbersByFio(String fio){
        return dictPhonebook.get(fio);
    }

    public Set<String> getAllFio() {
        return dictPhonebook.keySet();
    }
}