package lesson1;

public class Demo7 {
    public static void main(String[] args) {
        Demo5.Animal dog1 = new Demo5.Dog("Шарик");
        Demo5.Animal dog2 = new Demo5.Dog("Шарик");

        TunedDog dog3 = new TunedDog("Шарик",1);
        TunedDog dog4 = new TunedDog("Шарик1",12);

        System.out.println(dog3.equals(dog4));

    }

}
class TunedDog extends Demo5.Dog{
    private final int dogRegNumber;

    public TunedDog(String name, int dogRegNumber) {
        super(name);
        this.dogRegNumber = dogRegNumber;
    }
    public boolean equals1(Object obj){
        TunedDog dog = (TunedDog) obj;
        return dogRegNumber == dog.dogRegNumber;
    }
    public boolean equals2(Object obj){
        if(getClass() != obj.getClass()){
            return false;
        }
        TunedDog dog = (TunedDog) obj;
        return dogRegNumber == dog.dogRegNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if(obj == null || getClass() != obj.getClass() ){
            return false;
        }
        TunedDog dog = (TunedDog) obj;
        return dogRegNumber == dog.dogRegNumber;
    }
}
