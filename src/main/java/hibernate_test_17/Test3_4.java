package hibernate_test_17;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test3_4 {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        configuration.addAnnotatedClass(Car_4.class);
        SessionFactory factory = configuration.buildSessionFactory();
        Session session = factory.getCurrentSession();
        session.beginTransaction();
        List<Car_4> cars = session.createQuery("from Car_4 where department = 'Sales' and cost > 50000").getResultList();
        for (Car_4 e: cars)
            System.out.println(e);
        session.getTransaction().commit();
        System.out.println("Done!");
        factory.close();
    }
}