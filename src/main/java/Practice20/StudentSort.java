package Practice20;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentSort {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("A", 20, 90));
        studentList.add(new Student("G", 22, 91));
        studentList.add(new Student("P", 21, 89));
        studentList.add(new Student("D", 23, 86));
        studentList.add(new Student("Y", 19, 97));
        studentList.add(new Student("L", 21, 85));

        studentList.sort(Comparator.comparing(Student::getName));
        System.out.println("按照姓名字典序：");
        studentList.forEach(System.out::println);

        studentList.sort(Comparator.comparing(Student::getAge));
        System.out.println("按照年龄从小到大：");
        studentList.forEach(System.out::println);

        studentList.sort(Comparator.comparing(Student::getScore));
        System.out.println("按照成绩由小到大：");
        studentList.forEach(System.out::println);
    }


}
