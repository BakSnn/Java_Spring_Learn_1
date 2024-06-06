package hibernate_test_17;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1_4 {
    public static void main(String [] args){
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Car_4.class)
                .buildSessionFactory();
        Session session = factory.getCurrentSession();
        Car_4 emp = new Car_4("BMW", "X5", "Sale", 70000);
        session.beginTransaction();
        session.save(emp);
        session.getTransaction().commit();

        factory.close();
    }
}