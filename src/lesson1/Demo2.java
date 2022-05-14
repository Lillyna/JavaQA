package lesson1;

public class Demo2 {
    public static class Cat{
        int age;
        protected double weight;
        private String name;
        public void eat(CatFood catFood){
            System.out.println(name + " eats " + catFood.title);
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public double getWeight() {
            return weight;
        }

        public void setWeight(double weight) {
            this.weight = weight;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            if (name == null || name.isEmpty()){
                throw new RuntimeException("Имя не может быть пустым!");
            }
            this.name = name;
        }
    }

    public static class CatFood{
        public String title;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }

    public static void main(String[] args) {
        CatFood catFood = new CatFood();
        catFood.setTitle("Wiskas");
        Cat cat = new Cat();
        cat.setName("Murzik");
        cat.eat(catFood);
    }
}
