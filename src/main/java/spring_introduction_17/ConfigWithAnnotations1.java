package spring_introduction_17;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotations1 {
    public static void main(String [] args){
        ClassPathXmlApplicationContext context = new
                ClassPathXmlApplicationContext("applicationContext3.xml");
        Person_17 myPerson = context.getBean("myPerson_17", Person_17.class);
        myPerson.callYourPet();
        System.out.println(myPerson.getSurname());
        System.out.println(myPerson.getAge());
        //Cat_17 myCat = context.getBean("cat_17", Cat_17.class);
        //myCat.say();
        context.close();
}}
