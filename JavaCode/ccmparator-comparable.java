import java.util.*;

class Car {
    String carName;
    String carType;
    Car(String carName, String carType) {
        this.carName = carName;
        this.carType = carType;
    }
};

class Main {
    public static void main(String[] args) {
        Integer[] arr = {
            1,
            4,
            3,
            2,
            5
        };
        Arrays.sort(arr);
        //   for(int a: arr) {
        //     System.out.print(a + ",");
        // }
        Arrays.sort(arr, (Integer a, Integer b) -> b - a);
        // for(int a: arr) {
        //     System.out.println("Sorted array " + a);
        // }
        Car[] carArray = new Car[3];
        carArray[0] = new Car("Bmw", "Suv");
        carArray[1] = new Car("Mercedes", "Sedan");
        carArray[2] = new Car("Suzuki", "HatchBack");

        Arrays.sort(carArray, (Car obj1, Car obj2) -> obj2.carName.compareTo(obj1.carName));
        for (Car car: carArray) {
            System.out.println("car is: " + car.carName);
        }
        // System.out.println("Sorted array " + arr);
    }
}
