package lesson1;

public class Demo4 {

    public static void main(String[] args) {
        Demo3.Animal cat = new Demo3.Cat();
        Demo3.Animal dog = new Demo3.Dog();

        Demo3.Dog dog1 = new Demo3.Dog();

        Demo2.CatFood catFood = new Demo2.CatFood();
        catFood.setTitle("Китикет");

        Demo3.Animal[] animals = {cat, dog};

       for (Demo3.Animal animal: animals){
           animal.eat(catFood);
       }
       Demo3.Dog[] dogs = {dog1};

    }
}
