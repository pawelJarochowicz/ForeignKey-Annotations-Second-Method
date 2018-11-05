package exercise.hibernate.pp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Application {

    public static void main(String[] args) {

        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        SessionFactory factory = configuration.buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        City city1 = new City();
        city1.setName("Memphis");
        city1.setSize(950000);
        session.save(city1);

        City city2 = new City();
        city2.setName("Denver");
        city2.setSize(1700000);
        session.save(city2);

        Team team1 = new Team();
        team1.setLeague("NBA");
        team1.setCity(city1);
        session.save(team1);

        Team team2 = new Team();
        team2.setLeague("NFL");
        team2.setCity(city2);
        session.save(team2);


        transaction.commit();
        session.close();
        System.out.println("SUCCESFULLY");


    }
}
