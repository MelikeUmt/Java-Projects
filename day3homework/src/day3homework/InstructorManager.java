package day3homework;

public class InstructorManager extends UserManager{
	
	public void add (Instructor instructor) {
		System.out.println(instructor.getId() + " " + instructor.getFirstName() +" " + instructor.getLastName() + " isimli eğitmenimiz başarı ile kayıt edilmiştir.");
	}
	public void delete (Instructor instructor) {
		System.out.println(instructor.getId() + " " + instructor.getFirstName() +" " + instructor.getLastName() + " isimli eğitmenimizin bilgileri başarı ile silinmiştir.");
	}
	public void update (Instructor instructor) {
		System.out.println(instructor.getId() + " " + instructor.getFirstName() +" " + instructor.getLastName() + " isimli eğitmenimizin bilgileri başarı ile güncellenmiştir.");
	}
	
	

	

}
