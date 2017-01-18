package in.codeangles.main;

import in.codeangles.entity.MyClass;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Blob;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainStrore {
	public static void main(String[] args) throws Exception {
		Session session = new Configuration().configure().buildSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		File file = new File("C:\\Users\\Public\\Pictures\\Sample Pictures\\Desert.jpg");
		byte[] b = new byte[(int)file.length()];
		FileInputStream fileInputStream = new FileInputStream(file);
		fileInputStream.read(b);
		System.out.println(b.length);
		fileInputStream.close();
		MyClass class1 = new MyClass();
		class1.setFilename("file1");
		class1.setData(b);
		session.save(class1);
		t.commit();
		System.out.println("Saved");
	}
}
