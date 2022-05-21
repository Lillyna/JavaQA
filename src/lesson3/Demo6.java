package lesson3;

public class Demo6 {
    public static class Box implements Comparable{
        private int size;

        public Box(int size) {
            this.size = size;
        }

        @Override
        public int compareTo(Object o) {
           if(!(o instanceof Box)) {
               throw new RuntimeException("Invalid type " + o.getClass().getSimpleName());
           }
           Box another = (Box) o;
           return this.size - another.size;
        }
    }
    public static class Box$ implements Comparable<Box$>{
        private int size;

        public Box$(int size) {
            this.size = size;
        }

        @Override
        public int compareTo(Box$ o) {

            Box$ another = o;
            return this.size - another.size;
        }
    }
}
