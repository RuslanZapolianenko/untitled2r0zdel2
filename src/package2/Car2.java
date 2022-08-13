package package2;

public class Car2 {
    private int years;
    private String color;
    private double speed;
    private int weight;

    public Car2() {
      this.years=2000;
      this.color="blue";
      this.speed=160;
      this.weight=1300;
    }
    public Car2(int years){
        this.years=years;
    }
    public Car2(int years,String color){
        this.years=years;
        this.color=color;
    }
    public Car2(String color,double speed,int weight){
        this.color=color;
        this.speed=speed;
        this.weight=weight;
    }
    public Car2(int year, double speed, int weight, String color){
        this.years = year;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }
    public void setYearsWeight(int year, int weight){
        this.years = year;
        this.weight = weight;
    }

    public int getYears() {
        return years;
    }

    public int getWeight() {
        return weight;
    }

    public double getSpeed() {
        return speed;
    }

    public String getColor() {
        return color;
    }

}




//Используя Intelij IDEA создать проект, пакет. (Заново!) Создать класс Машина с полями год(int), скорость(double),
// вес(int) цвет(String). Создать конструктор по умолчанию, конструктор с 1-м параметром, 2-я, 3-я, 4-я.
// Перегрузить конструкторы. Создать класс Main, в котором создать экземляры класса Машина с разными параметрами.
