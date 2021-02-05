package org.example.lesson5;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Test3 {
    public static List<Car> createThreeCars(Supplier<Car> carSupplier){
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < 3; i++) cars.add(carSupplier.get());
        return cars;

    }
    public static void changeCar(Car car, Consumer<Car> carConsumer){
        carConsumer.accept(car);
    }
    public static void main(String[] args) {

        List<Car> ourCars = createThreeCars(() ->new Car("Nissan", "White", 1.6));
        System.out.println(ourCars);

        changeCar(ourCars.get(0), car -> {
            car.color="red";
            car.engine=2.4;
            System.out.println("Upgraded car:" + car);
        } );
        System.out.println(ourCars);
    }
}

class Car {
    String model;
    String color;
    double engine;

    public Car(String model, String color, double engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                '}';
    }
}
