package package2;

public class Main {
    public static void main(String[] args) {
    Car2 car2=new Car2(2000);
    Car2 car3=new Car2(1970,"blue");
    Car2 car4=new Car2("red",230,1300 );
    Car2 car5=new Car2(2018,160,2000,"blek");
    Car2 car6=new Car2("blue",200,1300);
        System.out.println("car5 год: " + car5.getYears() + " скорость: " + car5.getSpeed() + " вес: " + car5.getWeight());
        car6.setYearsWeight(2019,1000);
        System.out.println("car6 изменили год/вес " + car6.getYears() + " / " + car6.getWeight());
    }
    }


