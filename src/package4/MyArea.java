package package4;

public class MyArea {
    private static final double PI = 3.14;
    public static double areaOfCircle(double r) {
    double s=PI*Math.pow(r,2);
    return s;
    }
}

//Используя Intelij IDEA создать проект, пакет. Создать класс MyArea, в нем объявить константу PI = 3.14 и статический
// метод areaOfCircle, который должен принимать радиус и используя PI посчитать площадь круга. Создать класс Main,
// где запустить данный метод.
