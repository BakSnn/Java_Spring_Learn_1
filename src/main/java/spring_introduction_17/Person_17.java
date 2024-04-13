package spring_introduction_17;

import spring_introduction_17.Pet_17;

public class Person_17 {
    private Pet_17 pet_17;
    private String surname;
    private int age;

    public Person_17() {
        System.out.println("Person bean is created");
    }

    public void setPet_17(Pet_17 pet_17) {
        System.out.println("Class Person: set ");
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