package spring_introduction_17;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_3_17 {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //Pet_17 pet_17 = context.getBean("myPet_17", Pet_17.class);

        //Pet_17 pet_17 = new Cat_17();
        Person_17 person_17 = context.getBean("myPerson_17", Person_17.class);
        person_17.callYourPet();
        System.out.println(person_17.getSurname());
        System.out.println(person_17.getAge());
        context.close();
    }
}
