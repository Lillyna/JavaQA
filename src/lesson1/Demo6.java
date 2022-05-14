package lesson1;

public class Demo6 {
    public static void main(String[] args) {
        Demo5.Animal dog = new Demo5.Dog("Шарик");
        System.out.println(dog.getClass());
        System.out.println(dog.toString());

    }
}
