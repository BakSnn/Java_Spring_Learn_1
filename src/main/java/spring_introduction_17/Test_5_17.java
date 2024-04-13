package spring_introduction_17;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_5_17 {
    public static void main(String [] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
        Dog_17 myDog = context.getBean("myPet_17", Dog_17.class);
        myDog.say();
        Dog_17 yourDog = context.getBean("myPet_17", Dog_17.class);
        yourDog.say();
        context.close();

    }
}
