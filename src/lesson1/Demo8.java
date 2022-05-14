package lesson1;

import java.util.Objects;

public class Demo8{}

class TunedDogHashCode extends Demo5.Dog{

    private int dogRegNumber;

    public TunedDogHashCode(String name, int dogRegNumber) {
        super(name);
        this.dogRegNumber = dogRegNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dogRegNumber);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if(obj == null || getClass() != obj.getClass() ){
            return false;
        }
        TunedDogHashCode dog = (TunedDogHashCode) obj;
        return dogRegNumber == dog.dogRegNumber;
    }
}
