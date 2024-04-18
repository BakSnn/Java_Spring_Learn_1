package aop_17;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Test2_17 {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig_17.class);
        University_17 university = context.getBean("university_17", University_17.class);
        university.addStudents();
        List<Student_17> student17List = university.getStudent17List();
        System.out.println(student17List);
        context.close();
    }
}
