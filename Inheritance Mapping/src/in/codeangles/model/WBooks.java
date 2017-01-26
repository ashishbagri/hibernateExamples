package in.codeangles.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="wb")
public class WBooks extends Books {
	private String bookLang;

	public String getBookLang() {
		return bookLang;
	}

	public void setBookLang(String bookLang) {
		this.bookLang = bookLang;
	}
}
