package spring_introduction_17;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_2_17 {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Pet_17 pet17 = context.getBean("myPet_17", Pet_17.class);
        pet17.say();

        context.close();
    }
}
