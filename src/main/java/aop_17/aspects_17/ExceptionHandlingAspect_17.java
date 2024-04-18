package aop_17.aspects_17;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(3)
public class ExceptionHandlingAspect_17 {
    @Before("aop_17.aspects_17.MyPointcuts_17.allAddMethods()")
    public void beforeGetExceptionHandlingAdvice() {
        System.out.println("beforeGetExceptionHandlingAdvice: ловим/обрабатываем "+" исключение при попытке получить книгу/журнал");
        System.out.println("------------------------------------------");
    }
}
