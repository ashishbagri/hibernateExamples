package in.codeangles.main;

import in.codeangles.model.Books;
import in.codeangles.model.SEBooks;
import in.codeangles.model.WBooks;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Store {
	public static void main(String[] args) {
		Session session = new Configuration().configure().buildSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		Books b = new Books();
		b.setBookTitle("Main BOOk");
		b.setAuthor("ABAGRI");
		b.setCost(20.32);
		
		SEBooks seBook = new SEBooks();
		seBook.setBookTitle("SE BOOK");
		seBook.setAuthor("XYZ");
		seBook.setCost(40.32);
		seBook.setSpecialFeature("JAVA");
		
		WBooks wBooks = new WBooks();
		wBooks.setBookTitle("WBOOKS");
		wBooks.setAuthor("abc");
		wBooks.setCost(100.08);
		wBooks.setBookLang("ORACLE");
		
		session.persist(b);
		session.persist(seBook);
		session.persist(wBooks);
		
		t.commit();
		session.close();
	}
}
