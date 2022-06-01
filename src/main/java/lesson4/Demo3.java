package lesson4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Demo3 {
    public static abstract class Vehicle{
        protected String model;

        public Vehicle(String model) {
            this.model = model;
        }
    }
    public static class Car extends Vehicle{

        public Car(String model) {
            super(model);
        }
    }

    public static class Bike extends Demo3.Vehicle {

        public Bike(String model) {
            super(model);
        }

    }

        public static void main(String[] args) {
        //Коллекции ковариантны
            ArrayList<Demo3.Vehicle> garageList = new ArrayList<>(
                    Arrays.asList(new Bike("Cometa"), new Demo3.Car("Zil"))
            );
            Bike b = new Bike("Yava");
            Demo3.Car c = new Demo3.Car("Vaz");
            garageList.add(b);
            garageList.add(c);
            System.out.println(garageList.indexOf(b));
            //Сортировка
            Integer[] ints = new Integer[]{1,23,3,4,4,5};
            ArrayList<Integer> integers = new ArrayList<>(Arrays.asList(ints));
            Collections.sort(integers);
            System.out.println(integers);
            Collections.reverse(integers);
            System.out.println(integers);
            integers.set(4,100);
            System.out.println(integers);

        }
}
