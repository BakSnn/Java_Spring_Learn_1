package spring_introduction_17;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component
public class Dog_17 implements Pet_17 {
    //private String name;
    public Dog_17(){
        System.out.println("Dog been is created!");}
    //}

//    public void setName(String name) {
//        this.name = name;
//    }

//    public String getName() {
//        return name;
//    }

    public void say(){
        System.out.println("Bow-Wow");
    }
//    @PostConstruct
//    private void init(){
//        System.out.println("Class Dog: init method");
//    }
//    @PreDestroy
    protected void destroy(){
        System.out.println("Class Dog: destroy method");
    }
}
