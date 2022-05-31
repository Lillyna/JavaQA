package homework4;

import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class TaskOneApp {
    public static void main(String[] args) {

        //Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
        ArrayList<String> months = new ArrayList<>();
        for (int i = 1; i < 13; i++) {
            months.add(Month.of(i).name());
            if(i%2==0){
                months.add(Month.of(i).name());
            }
        }
        HashMap<String,Integer> map = new HashMap<>();
        months.forEach(month ->
                map.merge(month,1, (old, nouvelle) -> old + nouvelle));

        //Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
        System.out.println(map.keySet().toString());

        //Посчитать, сколько раз встречается каждое слово.
        System.out.println(map.entrySet().toString());
    }
}
