package homework9;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        App app = new App();
        Course math = new CourseImpl("Math");
        Course science = new CourseImpl("Science");
        Course english = new CourseImpl("English");
        Course logic = new CourseImpl("Logic");
        Course arts = new CourseImpl("Arts");
        Course music = new CourseImpl("Music");
        List<Student> students = Arrays.asList(
                new StudentImpl("ABob", Arrays.asList(math, english)),
                new StudentImpl("BBob", Arrays.asList(math, english)),
                new StudentImpl("CBob", Arrays.asList(arts, math, english, science)),
                new StudentImpl("DBob", Arrays.asList(math, english, science)),
                new StudentImpl("EBob", Arrays.asList(math, english, logic)),
                new StudentImpl("FBob", Arrays.asList(arts, math, english, science, music)));
        System.out.println(app.uniqCourses(students));
        System.out.println(app.curiousStudents(students));
        System.out.println(app.courseStudents(science, students));
    }

    //1. Написать функцию, принимающую список Student и возвращающую список уникальных курсов, на которые подписаны студенты.
    List<Course> uniqCourses(List<Student> students) {
        return students.stream()
                .map(Student::getAllCourses)
                .flatMap(List::stream)
                .distinct()
                .collect(Collectors.toList());
    }

    //2. Написать функцию, принимающую на вход список Student и возвращающую список из трех самых любознательных
// (любознательность определяется количеством курсов).
    List<Student> curiousStudents(List<Student> students) {
        return students.stream()
                .sorted(Collections.reverseOrder(Comparator.comparingInt(o -> o.getAllCourses().size())))
                .limit(3)
                .collect(Collectors.toList());
    }

    //3. Написать функцию, принимающую на вход список Student и экземпляр Course, возвращающую список студентов,
// которые посещают этот курс.
    List<Student> courseStudents(Course course, List<Student> students) {
        return students.stream()
                .filter(x -> x.getAllCourses().contains(course))
                .collect(Collectors.toList());
    }
}
