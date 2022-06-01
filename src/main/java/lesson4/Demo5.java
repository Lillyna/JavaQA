package lesson4;

import java.util.HashMap;
import java.util.Map;

public class Demo5 {
    public static void main(String[] args) {
        Map<String, Integer> months = new HashMap<>();
        months.put("Jan", 1);
        months.put("Feb", 2);
        System.out.println(months);

        //Обновление значения по ключу
        months.put("Jan", 111);

        for (String key: months.keySet()){
            System.out.printf("key=%s, val=%d \n", key, months.get(key));
        }
        for(Map.Entry<String,Integer> pair: months.entrySet()){
            System.out.printf("Pair: key %s value %d \n",pair.getKey(), pair.getValue() );
        }
        System.out.println(months);
    }

}
