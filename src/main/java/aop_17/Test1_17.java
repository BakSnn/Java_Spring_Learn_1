package aop_17;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1_17 {
    public static void main(String[] args)
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig_17.class);
        UniLibrary_17 uniLibrary = context.getBean("uniLibrary_17", UniLibrary_17.class);
        Book_17 book_17 = context.getBean("book_17", Book_17.class);
        uniLibrary.getBook();
        //uniLibrary.returnMagazine();
        uniLibrary.addBook("Sidorov", book_17);
        uniLibrary.addMagazine();
//        uniLibrary.returnBook();
//        SchoolLibrary_17 schoolLibrary = context.getBean("schoolLibrary_17", SchoolLibrary_17.class);
//        schoolLibrary.getBook();
        context.close();
    }
}
