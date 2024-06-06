package hibernate_test_17;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2_4 {
    public static void main(String [] args){
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Car_4.class)
                .buildSessionFactory();
        Session session = factory.getCurrentSession();
        Car_4 emp = new Car_4("Mercedes-Benz", "S-Class", "Sales", 100000);
        session.beginTransaction();
        session.save(emp);
        //session.getTransaction().commit();
        int myId = emp.getId();
        //session = factory.getCurrentSession();
        //session.beginTransaction();
        Car_4 car4 = session.get(Car_4.class, myId);
        session.getTransaction().commit();
        System.out.println(car4);
        System.out.println("Done!");
        factory.close();
    }
}