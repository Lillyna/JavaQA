package lesson3;

public class Demo4 {
    //ограничение сверху
    public static class BoxWithNumbers<T extends Number>{
        private T[] nums;

        public BoxWithNumbers(T[] nums) {
            this.nums = nums;
        }
    }
    public interface Flyable{}
    public static abstract class Animal{}
    public static class Dog extends Animal{}
    public static class Eagle extends Animal implements Flyable{}

    public static class HouseForBird<T extends Animal & Flyable>{
        public T owner;

        public void setOwner(T owner) {
            this.owner = owner;
        }

    }

    public static void main(String[] args) {
        HouseForBird<Eagle> eagleHouseForBird = new HouseForBird();
        eagleHouseForBird.owner = new Eagle();
    }
}
