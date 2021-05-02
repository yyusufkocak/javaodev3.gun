package odev2;

public class Student extends User {

	String course;
	
	
	 public String getCourse() {
		return course;
	}


	public void setCourse(String course) {
		this.course = course;
	}


	public Student(int userId, String firstName, String lastName, String userName, String password, String eMail,
			String course) {
		super(userId, firstName, lastName, userName, password, eMail);
		this.course = course;
	}

	
	
	 
}
