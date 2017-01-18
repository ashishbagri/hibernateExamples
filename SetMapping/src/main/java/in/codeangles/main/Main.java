package in.codeangles.main;

import in.codeangles.model.Employee;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
	public static void main(String[] args) {
		Session session = new Configuration().configure().buildSessionFactory().openSession();
		
		Transaction t = session.beginTransaction();
		Employee e = new Employee();
		e.setName("Ashish");
		Set<String> marks = new HashSet<String>();
		marks.add("1");
		marks.add("2");
		session.persist(e);
		t.commit();
		session.close();
		/*Query query = session.createQuery("from Employee");
		List<Employee> list = query.list();
		for(Employee e : list){
			Set<String> s = e.getMarks();
			Iterator<String> itr = s.iterator();
			while(itr.hasNext()){
				System.out.println(itr.next());
			}
		}
		session.close();*/
	}
}
