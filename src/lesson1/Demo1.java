package lesson1;

public class Demo1 {
    public static class Cat{
        public String name;
        public void eat(CatFood catFood){
            System.out.println(name + " eats " + catFood.title);
        }
    }

    public static class CatFood{
        public String title;
    }

    public static void main(String[] args) {
        CatFood catFood = new CatFood();
        catFood.title = "Wiskas";
        Cat cat = new Cat();
        cat.name = "Murzik";
        cat.eat(catFood);
    }
}
