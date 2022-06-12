package homework9;

public class CourseImpl implements Course {
    String name;

    public CourseImpl(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "CourseImpl{" +
                "name='" + name + '\'' +
                '}';
    }
}
