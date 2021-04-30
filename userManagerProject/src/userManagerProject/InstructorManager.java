package userManagerProject;

public class InstructorManager  extends UserManager  {

	public InstructorManager(Logger[] logger) {
		super(logger);

	}

	public void addInstructorTitle(Instructor instructor) {
		
		System.out.println(instructor.getFirstName()+" "+instructor.getLastName()+" isim ve soyisimli kullanýcýya Öðretmen ünvaný baþarýyla verilmiþtir.");
		
		for(Logger log: getLoggers()) {
			
			log.log();
			
		}
		
		
	}
	
}
