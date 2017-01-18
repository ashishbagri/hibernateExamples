package in.codeangles.model;

import java.util.List;

public class Student {
	private long studentId;
	private String studentName;
	private List<String> address;

	public long getStudentId() {
		return studentId;
	}

	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public List<String> getAddress() {
		return address;
	}

	public void setAddress(List<String> address) {
		this.address = address;
	}

	@Override
	public String toString() {
		String str = String.format("%s | %s ", studentId, studentName);
		return str;
	}
}
