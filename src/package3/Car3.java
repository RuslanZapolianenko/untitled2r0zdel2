package package3;

public class Car3 {
    private int year;
    private double speed;
    private int weight;
    private int mileage;
    private String color;

    public Car3() {
        this.year = 1935;
        this.speed = 160.50;
        this.weight = 1750;
        this.mileage = 170500;
        this.color = "Green";
    }

    public Car3(int year) {
        this.year = year;
    }

    public Car3(int year, double speed, int weight, int mileage) {
        this(year);
        this.speed = speed;
        this.weight = weight;
        this.mileage = mileage;
    }

    public Car3(int year, double speed, int weight, int mileage, String color) {
        this(year, speed, weight, mileage);
        this.color = color;
    }

    public Car3(int year, int mileage) {
        this.year = year;
        this.mileage = mileage;
    }



    public Car3(int year, int weight, int mileage) {
        this(year, weight);
        this.mileage = mileage;
    }


    public Car3(int year, int mileage, double speed) {
        this(year, mileage);
        this.speed = speed;
    }


    public Car3(double speed, int year, int mileage) {
        this(year, mileage);
        this.speed = speed;
    }

    public Car3(String color, int year, double speed, int weight, int mileage) {
        this(year, speed, weight, mileage);
        this.color = color;
    }
}
//Используя Intelij IDEA создать проект, пакет. (Заново!) Создать класс Машина с полями год(int), скорость(double),
// вес(int) цвет(String). Создать конструктор по умолчанию, конструктор с 1-м параметром, 2-я, 3-я, 4-я.
// Перегрузить конструкторы вызывая конструктор из конструктора. Создать класс Main, в котором создать экземляры класса
// Машина с разными параметрами.