package homework2;

public class App {

    public int sumArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        int k;

        // 1. При подаче массива другого размера необходимо
        // бросить исключение MyArraySizeException.
        if (!(array.length == 4)) {
            throw new MyArraySizeException("Количество столбцов " + array.length);
        }
        for (String[] strings : array) {
            if (!(strings.length == 4)) {
                throw new MyArraySizeException("Количество строк " + strings.length);
            }
        }

        // 2. Далее метод должен пройтись по всем элементам массива,
        // преобразовать в int и просуммировать.
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.valueOf(array[i][j]);
                } catch (RuntimeException e) {
                    throw new MyArrayDataException(i, j, sum);
                }
            }
        }
        return sum;
    }

    //3. В методе main() вызвать полученный метод,
    // обработать возможные исключения MyArraySizeException
    // и MyArrayDataException и вывести результат расчета.
    public static void main(String[] args) {
        String[][] array1 = {{"0", "1", "2", "3"}, {"0", "1", "2", "3"}, {"0", "1", "2", "3"}, {"0", "1", "2", "3"}}; //positive case
        String[][] array2 = {{"0", "1", "2", "3"}, {"A", "1", "2", "3"}, {"5", "1", "2", "3"}, {"A", "1", "2", "3"}}; //wrong data
        String[][] array3 = {{"0", "1", "2", "3"}, {"№", "1", "2", "3"}, {"5", "1", "2", "3"}, {"A", "1", "2", "3"}}; //wrong data
        String[][] array4 = {{"0", "1", "2", "3", "5"}, {"0", "1", "2", "3"}, {"0", "1", "2", "3"}, {"0", "1", "2", "3"}}; //4x5
        String[][] array5 = {{"0", "1", "2", "3"}, {"0", "1", "2", "3"}, {"0", "1", "2", "3"}}; //3x4

        App app = new App();
        int sum = 0;
        try {
            //sum = app.sumArray(array1);
            sum = app.sumArray(array2);
            //sum = app.sumArray(array3);
            //sum = app.sumArray(array4);
            //sum = app.sumArray(array5);
        } catch (MyArraySizeException e) {
            System.out.println("Неверный размер массива!");
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            System.out.println("Не могу преобразовать строку в число!");
            sum = e.getSum();
            e.printStackTrace();
        }
        System.out.println("Сумма посчитанных элементов: " + sum);
    }
}
