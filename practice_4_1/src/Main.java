enum Season {
    WINTER(0),
    SPRING(10),
    SUMMER(20),
    AUTUMN(5);
    private int avgtemp;

    Season(int avgtemp) {
        this.avgtemp = avgtemp;
    }

    public String getInfo() {
        switch (this) {
            case AUTUMN:
                return "Осень есть осень";
            case WINTER:
                return "Зима есть зима";
            case SUMMER:
                return "Лето есть лето";
            case SPRING:
                return "Весна есть весна";
            default:
                return "ты дурак?";
        }
    }

    public int getAvgtemp() {
        return this.avgtemp;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Да все времена хороши вы че?!");

        for (Season season : Season.values()) {
            System.out.println("Время года: " + season);
            System.out.println("Средняя температура: " + season.getAvgtemp() + "°C");
            System.out.println("Описание: " + season.getInfo());
            System.out.println();
        }
    }
}