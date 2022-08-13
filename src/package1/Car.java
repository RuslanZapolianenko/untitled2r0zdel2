package package1;

public class Car {
    private int year;
    private String color;
    public Car(){
    }
    public Car(int year){
        this.year=year;
    }
    public Car(String color){
    }
    public Car(int year,String color){
        this.year=year;
        this.color=color;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }


}



//Используя Intelij IDEA создать проект, пакет. Создать класс Машина с полями год(int), цвет(String).
// Создать конструктор по умолчанию, конструктор с одним и 2-я параметрами. Создать класс package1.Car.Main в котором
// создать экземпляры вызывая разные конструкторы.