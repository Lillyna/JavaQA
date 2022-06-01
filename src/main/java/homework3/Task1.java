package homework3;

public class Task1<T> {

    public T[] swap (T[] array, int a, int b){
        T element = array[a];
        array[a] = array[b];
        array[b] = element;
        return array;
    }
}
