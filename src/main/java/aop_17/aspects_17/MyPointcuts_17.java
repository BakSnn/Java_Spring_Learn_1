package aop_17.aspects_17;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointcuts_17 {
    @Pointcut("execution(* abc*(..))")
    public void allAddMethods() {}
}
