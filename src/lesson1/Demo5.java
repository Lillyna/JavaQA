package lesson1;

public class Demo5 {
    public abstract static class Animal {
        protected final String name; // финальная переменная инициализируется при создании
        // и должна быть обязательно передана в конструктор

        public Animal(String name) {
            this.name = name;
        }

        public void eat(Demo2.CatFood catFood) {
            System.out.println(name + " eats " + catFood.title);
        }

        public String getName() {
            return name;
        }


        abstract public void sayHello();
    }

    public static class Cat extends Animal {

        public Cat(String name) {
            super(name);
        }

        @Override
        public void sayHello() {
            System.out.println(this.name + " делает мяу");
        }
    }

    public static class Dog extends Animal {

        public Dog(String name) {
            super(name);
        }

        @Override
        public void sayHello() {
            System.out.println(this.name + " делает гав");
        }
    }
}
