package in.codeangles.model;

import java.util.List;
import java.util.Set;

public class Employee {
	
	private int id;
	private String name;
	private Set<String> marks;
	/*private List<String> records;
	
	public List<String> getRecords() {
		return records;
	}
	public void setRecords(List<String> records) {
		this.records = records;
	}*/
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<String> getMarks() {
		return marks;
	}
	public void setMarks(Set<String> marks) {
		this.marks = marks;
	}
}
