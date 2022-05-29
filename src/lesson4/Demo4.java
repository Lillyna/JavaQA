package lesson4;

import java.util.*;

public class Demo4 {
    public static class Cat{
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Cat cat = (Cat) o;
            return name!=null? name.equals(cat.name): cat.name == null;
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat("Murzik");
        Cat cat2 = new Cat("Murzik");
        System.out.println(cat1.equals(cat2));
        System.out.println(Integer.toHexString(cat1.hashCode()));
        System.out.println(Integer.toHexString(cat2.hashCode()));

        Set<Cat> catSet = new HashSet<>(List.of(cat1, cat2));//Set хранит уникальные объекты с точки зрения equals & hashCode
        System.out.println(catSet.size());// два кота, а размер сета = 1, плохо

        Set<Integer> uniqElems = new HashSet<>(Arrays.asList(1,0,2,3,100,2,2,50,5,6,7,6));
        System.out.println(uniqElems);

        //Добавление по порядку (в порядке добавления)
        Set<Integer> linkedUniqlems = new LinkedHashSet<>(Arrays.asList(1,0,2,3,100,2,2,50,5,6,7,6));
        System.out.println(linkedUniqlems);

        //Множествоб которое сортирует при добавлении
        Set<Integer> sortedUniqElems = new TreeSet<>(Arrays.asList(1,0,2,3,100,2,2,50,5,6,7,6));
        System.out.println(sortedUniqElems);

        Set<Cat> sortedCatList = new TreeSet<>(Arrays.asList(new Cat("Murzik"), new Cat("Barsik"))); //Comparable надо реализовать



    }
}
