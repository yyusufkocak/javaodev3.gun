package odev2;

public class Instructor extends User{
	
	String branch;
	int subscribers=7500;  //Abone sayýsý set edilemesin yani deðer girilemesin bunu kullanan kiþi sadece bu deðeri okuyabilsin istersek bu þekilde kullanmalýyýz.
	
	
	public Instructor(int userId, String firstName, String lastName, String userName, String password, String eMail,
			String branch) {
		super(userId, firstName, lastName, userName, password, eMail);
		this.branch = branch;
		
	}
	
	public Instructor()
	{
		super();
	}
	 

	

	public String getBranch() {
		return branch;
	}


	public void setBranch(String branch) {
		this.branch = branch;
	}


	public int getSubscribers() {
		return subscribers=7500; 
	}


	
	
	 
}
