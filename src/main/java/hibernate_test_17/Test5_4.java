package hibernate_test_17;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test5_4 {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        configuration.addAnnotatedClass(Car_4.class);
        SessionFactory factory = configuration.buildSessionFactory();

        Session session = factory.getCurrentSession();
        session.beginTransaction();

//        Car_4 car = session.get(Car_4.class, 2);
//        session.delete(car);
        session.createQuery("delete Car_4 where cost = '40000'").executeUpdate();
        session.getTransaction().commit();


        System.out.println("Done!");
        factory.close();
    }
}
