package lesson_3;

public class Lesson_3 {
    public static void main(String[] args) {
        Person[] persArray = new Person[6];
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        persArray[1] = new Person("Soloduha Alexandr", "Singer", "soloduha@mailbox.com", "892312111", 150000, 50);
        persArray[2] = new Person("Panasenkov Evgenii", "blogger", "panasenkow@mailbox.com", "892312222", 100000, 40);
        persArray[3] = new Person("Dzmishenko Valerii", "streamer", "dzmih@mailbox.com", "892312333", 110000, 45);
        persArray[4] = new Person("Yakubovich Leonid", "host of the show", "poleChudes@mailbox.com", "892312444", 300000, 77);
        persArray[5] = new Person("Milohin Daniil", "singer", "milokhin@mailbox.com", "892312555", 5000000, 22);


        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].getAge() >= 40) {
                System.out.println(persArray[i].toString());
            }
        }
    }

}
