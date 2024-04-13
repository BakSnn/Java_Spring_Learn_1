package spring_introduction_17;

public class Dog_17 implements Pet_17 {
    public Dog_17(){
        System.out.println("Dog been is created!");
    }
    @Override
    public void say(){
        System.out.println("Bow-Wow");
    }
}
