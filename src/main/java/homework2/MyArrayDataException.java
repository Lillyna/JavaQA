package homework2;

public class MyArrayDataException extends Throwable {
    private final int sum;

    public MyArrayDataException(int i, int j, int sum) {
        super(String.format("Невозможно преобразовать в Integer значение в ячейке [%d][%d]", i, j));
        this.sum = sum;
    }

    public int getSum() {
        return this.sum;
    }
}
