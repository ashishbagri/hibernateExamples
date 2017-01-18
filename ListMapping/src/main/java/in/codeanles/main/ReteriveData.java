package in.codeanles.main;

import in.codeangles.model.Student;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ReteriveData {
	 public static void main(String[] args) {
		Session session = new Configuration().configure().buildSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		Query query = session.createQuery("from Student");
		List<Student> list = query.list();
		for(Student st : list){
			System.out.println(st);
			List<String> add = st.getAddress();
			for(String s: add){
				System.out.println(s);
			}
		}
	}
}
