package aop_17;


import org.springframework.stereotype.Component;

@Component
public class SchoolLibrary_17 extends AbstractLibrary_17 {
    //@Override
    public void getBook() {
        System.out.println("Мы берем книгу из SchoolLibrary");
    }
}
