package spring_introduction_17;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
//@Component("myPerson_17")
public class Person_17 {
    private Pet_17 pet_17;
    @Value("${person.surname}")
    private String surname;
    @Value("${person.age}")
    private int age;


    @Autowired
    public Person_17(@Qualifier("cat_17") Pet_17 pet_17) {
        System.out.println("Person bean is created");
        this.pet_17 = pet_17;
    }


    public void setPet_17(Pet_17 pet_17) {
        System.out.println("Class Person: set pet");
        this.pet_17 = pet_17;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public void setSurname(String surname) {
        System.out.println("Class Person: set surname ");
        this.surname = surname;
    }

    public void setAge(int age) {
        System.out.println("Class Person: set age ");
        this.age = age;
    }

    public void callYourPet() {
        System.out.println("Hello, my lovely Pet!");
        pet_17.say();
    }
}