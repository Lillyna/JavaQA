package lesson4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Demo1 {

    public static void main(String[] args) {
        Collection<Integer> integers = new ArrayList<>(Arrays.asList(1,2,3,4));
        integers.retainAll(new ArrayList<>(Arrays.asList(2,3,4,4,5,6,67,7)));
        System.out.println(integers);
        Object[] integerArray = integers.toArray();
        System.out.println(integerArray.toString());
    }
}
