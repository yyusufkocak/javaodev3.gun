package odev2;

public class InstructorManager extends UserManager{

	@Override
	public void add(User user) {
	
		System.out.println(user.firstName + " isimli eðitmen kayýt edildi");
	}

	@Override
	public void multipleAdd(User[] users) {
	
		 for (User user : users) {
    		 
	 			System.out.println(user.firstName + " isimli eðitmen kayýt edildi ");
			}
			
	}

	@Override
	public void delete(User user) {
	
		System.out.println(user.firstName + " isimli eðitmen silindi");
	}

	@Override
	public void update(User user) {
		
		System.out.println(user.firstName + " isimli eðitmen bilgileri güncellendi");

	}
	

}
