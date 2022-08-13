package package1;

public class Main {

        public static void main(String[] args) {
            Car car1=new Car();
            System.out.println("Конструктор по умолчанию (year=0 color=null), объект car1");
            System.out.println("year = " + car1.getYear()+ " color = " + car1.getColor());

            Car car = new Car(2020);
            System.out.println("Конструктор принимает только год, объект car");
            System.out.println("year = " + car1.getYear());

            Car car2 = new Car("Белый");
            System.out.println("Конструктор принимает только цвет, объект car2");
            System.out.println("year = " + car2.getColor());

            Car car3 = new Car(2018,"Черный");
            System.out.println("Конструктор принимает год и цвет, объект car3");
            System.out.println("year = " + car3.getYear()+ " color = " + car3.getColor());
        }
    }

