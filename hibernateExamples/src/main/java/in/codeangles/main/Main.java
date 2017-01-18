package in.codeangles.main;

import in.codeangles.entity.Person;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
	 public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		Person p = new Person();
		
		p.setId(123);
		p.setName("ashish");
		session.persist(p);
		transaction.commit();
		System.out.println("Saved");
	}
}
