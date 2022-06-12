package homework9;

import java.util.List;

public class StudentImpl implements Student {
    String name;
    List<Course> allCourses;

    public StudentImpl(String name, List<Course> allCourses) {
        this.name = name;
        this.allCourses = allCourses;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public List<Course> getAllCourses() {
        return this.allCourses;
    }

    @Override
    public String toString() {
        return "StudentImpl{" +
                "name='" + name + '\'' +
                ", allCourses=" + allCourses +
                '}';
    }
}
