package aop_17.aspects_17;

import aop_17.Book_17;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import org.aspectj.lang.reflect.MethodSignature;


@Component
@Aspect
@Order(1)
public class LoggingAspect_17 {
    @Before("aop_17.aspects_17.MyPointcuts_17.allAddMethods()")
    public void beforeGetLoggingAdvice(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature - "+methodSignature);
        System.out.println("methodSignature.getMethod() - "+methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType() - "+methodSignature.getReturnType());
        System.out.println("methodSignature.getName() - "+methodSignature.getName());
        System.out.println("beforeGetLoggingAdvice: логирование "+" попытка получить книгу/журнал");

        if (methodSignature.getName().equals("addBook")){
            Object [] arguments = joinPoint.getArgs();
            for (Object obj : arguments){
                if (obj instanceof Book_17){
                    Book_17 myBook = (Book_17) obj;
                    System.out.println("Информация о книге: название - "+myBook.getName()+", автор - "+myBook.getAuthor()+", год издания - "+myBook.getYearOfPublication());
                } else if (obj instanceof String){
                    System.out.println("Книгу в библиотеку добавляет: "+obj);
                }
            }
        }
        System.out.println("beforeGetLoggingAdvice: логирование "+" попытка получить книгу/журнал");

    }




















//    @Pointcut("execution(* aop_17.UniLibrary_17.*(..))")
//    private void allGetMethodsFromUniLibrary() {}
//    @Pointcut("execution(public void aop_17.UniLibrary_17.returnMagazine())")
//    private void returnMagazineFromUniLibrary() {}
//
//    @Pointcut("allGetMethodsFromUniLibrary() && !returnMagazineFromUniLibrary()")
//    private void allMethodsExceptReturnMagazineFromUniLibrary() {}
//
//    @Before("allMethodsExceptReturnMagazineFromUniLibrary()")
//    public void beforeAllMethodsExceptReturnMagazineAdvice() {
//        System.out.println("beforeAllMethodsExceptReturnMagazineAdvice: writing Log #10");
//    }

    @Pointcut("execution(* get*())")
    private void allGetMethods() {}
//    @Before("allGetMethods()")
//    public void beforeGetLoggingAdvice() {
//        System.out.println("beforeGetLoggingAdvice: логирование "+" попытка получить книгу/журнал");
//    }
//    @Before("allGetMethods()")
//    public void beforeGetSecurityAdvice() {
//        System.out.println("beforeGetSecurityAdvice: проверка прав на получение "+" книги/журнала");
//    }

}