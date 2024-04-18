package aop_17;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class University_17 {
    protected List<Student_17> student17List = new ArrayList<>();
    public void addStudents() {
        Student_17 st1 = new Student_17("Petr Ivanov", 1, 7.5);
        Student_17 st2 = new Student_17("Ivan Petrov", 2, 3.4);
        Student_17 st3 = new Student_17("Vladimir Sidorov", 3, 4.8);
        student17List.add(st1);
        student17List.add(st2);
        student17List.add(st3);
    }
    public List<Student_17> getStudent17List() {
        System.out.println("Information from method getStudent17List: ");
        System.out.println(student17List);
        return student17List;
    }
}
