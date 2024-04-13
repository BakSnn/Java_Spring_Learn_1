package spring_introduction_17;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_4_17 {
    public static void main(String [] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
//        Dog_17 myDog = context.getBean("myPet_17", Dog_17.class);
//        myDog.setName("Belka");
//        Dog_17 yourDog = context.getBean("myPet_17", Dog_17.class);
//        yourDog.setName("Strelka");
//        //System.out.println("Переменные ссылаются на один и тот же объект?"+ (myDog==yourDog));
//        //System.out.println(myDog);
//        //System.out.println(yourDog);
//        System.out.println(myDog.getName());
//        System.out.println(yourDog.getName());
        context.close();
    }
}
