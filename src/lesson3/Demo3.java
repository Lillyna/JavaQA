package lesson3;

public class Demo3 {
    public static class BoxWithTwoGens<T,U>{
        private T obj1;
        private U obj2;

        public BoxWithTwoGens(T obj1, U obj2) {
            this.obj1 = obj1;
            this.obj2 = obj2;
        }

        public T getObj1() {
            return obj1;
        }

        public void setObj1(T obj1) {
            this.obj1 = obj1;
        }

        public U getObj2() {
            return obj2;
        }

        public void setObj2(U obj2) {
            this.obj2 = obj2;
        }
    }

    public static void main(String[] args) {
        BoxWithTwoGens<Integer, Integer> box1 = new BoxWithTwoGens<>(1,1);
        BoxWithTwoGens<Integer, String> box2 = new BoxWithTwoGens<>(145, "Narod");
        int people = box2.getObj1();
        int i = box1.getObj1() + box2.getObj1();
    }
}
