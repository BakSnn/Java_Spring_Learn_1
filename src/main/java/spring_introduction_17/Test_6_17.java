package spring_introduction_17;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test_6_17 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig_17.class);
        Person_17 person_17 = context.getBean("myPerson_17", Person_17.class);
        System.out.println(person_17.getSurname());
        System.out.println(person_17.getAge());
        //person_17.callYourPet();
        //Pet_17 myCat = context.getBean("cat_17", Pet_17.class);
        //myCat.say();
        context.close();
    }
}
