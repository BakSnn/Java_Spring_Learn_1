package spring_introduction_17;

public class Cat_17 implements Pet_17{
    public Cat_17(){
        System.out.println("Cat bean is created!");
    }
    @Override
    public void say(){
        System.out.println("Meow-meow");
    }
}
