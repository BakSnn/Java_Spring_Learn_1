package spring_introduction_17;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class ScopeTest_17 {
    public static void main(String [] args){
        ClassPathXmlApplicationContext context = new
                ClassPathXmlApplicationContext("applicationContext3.xml");

        Dog_17 myDog = context.getBean("dog_17",Dog_17.class);
        myDog.say();
//        Dog_17 yourDog = context.getBean("dog_17", Dog_17.class);
//        System.out.println("Переменные ссылаются на один и тот же объект? "+ (myDog==yourDog));
//        System.out.println(myDog);
//        System.out.println(yourDog);
        context.close();
    }}