package in.codeanles.main;

import in.codeangles.model.Student;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreData {

	public static void main(String[] args) {
		Session session = new Configuration().configure().buildSessionFactory()
				.openSession();
		Transaction t = session.beginTransaction();
		List<String> list = new ArrayList<String>();
		list.add("UP");
		list.add("Delhi");
		Student student = new Student();
		student.setStudentName("Ashish");
		student.setAddress(list);
		session.save(student);
		t.commit();
		session.close();

	}
}
