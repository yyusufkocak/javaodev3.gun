package odev2;

public class StudentManager extends UserManager {

	@Override
	public void add(User user) {
		
		System.out.println(user.firstName + " isimli öðrenci kayýt edildi");
	}

	@Override
	public void multipleAdd(User[] users) {
		
		 for (User user : users) {
    		 
 			System.out.println(user.firstName + " isimli kiþi kayýt edildi ");
		}
		
	}

	@Override
	public void delete(User user) {
		System.out.println(user.firstName + " isimli öðrenci silindi");
	}

	@Override
	public void update(User user) {
		System.out.println(user.firstName + " isimli öðrenci bilgileri güncellendi");
	}

	
	

}
