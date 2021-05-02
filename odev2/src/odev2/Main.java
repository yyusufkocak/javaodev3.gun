package odev2;

public class Main {

	public static void main(String[] args) {
		
		Instructor instructor1=new Instructor();
		instructor1.setUserId(1);
		instructor1.setFirstName("Engin");
		instructor1.setLastName("Demiro�");
		instructor1.setUserName("engin123");
		instructor1.setPassword("123123");
		instructor1.seteMail("engin@hotmail.com");
		instructor1.setBranch("Java");
		
		
		
		System.out.println("E�itmenin abonesi : "+ instructor1.subscribers); //Encapsulation ile subscribers �zelli�ini sadece get ettik
		
		
		System.out.println("------------------------------------------------------------");
		
		
		InstructorManager instructorManager=new InstructorManager();
		
		instructorManager.add(instructor1);
			
		
		System.out.println("------------------------------------------------------------");
				
		
		instructorManager.update(instructor1);
		

		System.out.println("------------------------------------------------------------");
		
		
		Student student1=new Student(0, "Yusuf", "Ko�ak", "�ifre123", "11111", "yusuf@hot...", "C#"); //De�erleri Constructor ile set ettik. 
		
		Student student2=new Student(1, "Batuhan", "C�mert", "�ifre123", "11111", "batu�@hot...", "C#,Java");
		
		Student student3=new Student(2, "Ey�p", "C�mert", "�ifre123", "11111", "ey�p@hot...", "null");
				
		
		StudentManager studentManager=new StudentManager();
		
		
		studentManager.add(student1);
		System.out.println("------------------------------------------------------------");
		
		System.out.println("Alttaki bilgileri dizi yoluyla giriyoruz");
		System.out.println("------------------------------------------------------------");
		
		Student[] students= {student1,student2,student3};
		
		
		studentManager.multipleAdd(students);
		
		
		System.out.println("------------------------------------------------------------");
		
		
		studentManager.delete(student1);
		
		
		
	
	
	
		


	

}
}