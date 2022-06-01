package homework2;

public class MyArraySizeException extends Throwable {

    public MyArraySizeException(String message) {
        super("Размерность массива должна быть 4x4! " + message);

    }

}
