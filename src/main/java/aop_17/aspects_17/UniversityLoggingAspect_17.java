package aop_17.aspects_17;

import aop_17.Student_17;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect_17 {
    @Before("execution(* getStudent17List())")
    public void BeforeGetStudentsLoggingAdvice() {
        System.out.println("BeforeGetStudentsLoggingAdvice: логируем получение "+" " + " списка студентов перед метода getStudents()");
    }
    @AfterReturning(pointcut = "execution(* getStudent17List())", returning = "student17List")
    public void AfterReturningGetStudentsLoggingAdvice(List<Student_17> student17List) {
        Student_17 firstStudent = student17List.get(0);
        String nameSurname = firstStudent.getNameSurname();
        nameSurname = "Mr. " + nameSurname;
        firstStudent.setNameSurname(nameSurname);
        Double avgGrade = firstStudent.getAvgGrade();
        avgGrade = avgGrade + 1;
        firstStudent.setAvgGrade(avgGrade);
        System.out.println("AfterReturningGetStudentsLoggingAdvice: логируем получение "+" " + " списка студентов после работы метода getStudents()");
    }

}
