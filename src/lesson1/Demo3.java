package lesson1;

public class Demo3 {
    public abstract static class Animal {
        protected String name;

        public void eat(Demo2.CatFood catFood){
            System.out.println(name + " eats " + catFood.title);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
        abstract public void sayHello();
    }
    public static class Cat extends Animal{


        @Override
        public void sayHello() {
            System.out.println(this.name + " делает мяу");
        }
    }

    public static class Dog extends Animal {


        @Override
        public void sayHello() {
            System.out.println(this.name + " делает гав");
        }
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Cat");
        cat.sayHello();
        Dog dog = new Dog();
        dog.setName("Dog");
        dog.sayHello();
    }
}
