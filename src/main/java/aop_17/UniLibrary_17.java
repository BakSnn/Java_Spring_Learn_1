package aop_17;

import org.springframework.stereotype.Component;


@Component
public class UniLibrary_17 extends AbstractLibrary_17 {
    //@Override
    public void getBook(){
        System.out.println("Мы берем книгу из UniLibrary ");
        System.out.println("---------------------------------");
    }
     void returnBook(){
        System.out.println("Мы возвращаем книгу в UniLibrary");
        System.out.println("---------------------------------");
    }
    public void getMagazine(){
        System.out.println("Мы берем журнал из UniLibrary");
        System.out.println("---------------------------------");
    }
    public void returnMagazine(){
        System.out.println("Мы возвращаем журнал в UniLibrary");
        System.out.println("---------------------------------");
    }
    public void addBook(String person_name, Book_17 book_17){
        System.out.println("Мы добавляем книгу в UniLibrary");
        System.out.println("---------------------------------");
    }
    public void addMagazine(){
        System.out.println("Мы добавляем журнал в UniLibrary");
        System.out.println("---------------------------------");
    }
}
