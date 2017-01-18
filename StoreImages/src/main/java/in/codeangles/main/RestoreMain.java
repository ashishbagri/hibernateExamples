package in.codeangles.main;

import in.codeangles.entity.MyClass;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RestoreMain {
	public static void main(String[] args) throws IOException {
		Session s = new Configuration().configure().buildSessionFactory().openSession();
		Transaction t = s.beginTransaction();
		MyClass myClass = (MyClass)s.get(MyClass.class, 1);
		byte[] b = myClass.getData();
		File outputfile = new File("myImage.jpg");
		FileOutputStream fileOutputStream = new FileOutputStream(outputfile);
		fileOutputStream.write(b);
		fileOutputStream.close();
		t.commit();
	}
}
