package lesson_4.park;

public class Attraction {
    private String thematics;
    private String name;
    private int workMinute;
    private int price;

    public Attraction(String thematics, String name, int workMinute, int price) {
        this.thematics = thematics;
        this.name = name;
        this.workMinute = workMinute;
        this.price = price;
    }

    public String getThematics() {
        return thematics;
    }

    public void setThematics(String thematics) {
        this.thematics = thematics;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWorkMinute() {
        return workMinute;
    }

    public void setWorkMinute(int workMinute) {
        this.workMinute = workMinute;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Аттракцион " +
                "Тематика: '" + thematics + '\'' +
                ", название: '" + name + '\'' +
                ", минут на аттракционе: " + workMinute +
                ", цена: " + price +
                " руб.";
    }
}