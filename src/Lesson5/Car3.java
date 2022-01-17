package Lesson5;

public class Car3 {
    Car3(String cvet, String motor) {
        System.out.println("Object is created!!!");
        color=cvet;
        engine=motor;
        System.out.println("Цвет машины: "+color+" мотор машины: "+engine);
    }

    String color;
    String engine;
}

class CarTest {
    public static void main(String[] args) {
        Car3 car1 = new Car3("yellow", "V4");
        Car3 car2 = new Car3("black", "v8");
    }
}
