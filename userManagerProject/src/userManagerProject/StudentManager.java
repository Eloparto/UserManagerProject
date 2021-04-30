package userManagerProject;

public class StudentManager extends UserManager {

	
	public StudentManager(Logger[] logger) {
		super(logger);
	}

	public void addStudentTitle(Student student) {
		
		System.out.println(student.getFirstName()+" "+student.getLastName()+" isim ve soyisimli kullan�c�ya ��renci �nvan� ba�ar�yla verilmi�tir.");
		
		for(Logger log: getLoggers()) {
			
			log.log();
			
		}
	}
	
	
}
