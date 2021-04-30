package userManagerProject;

public class Main {

	public static void main(String[] args) {
		
		Student student = new Student(1,"Ka�an","�ELENK","99999999999","eloparto@google.com");
		
		Instructor �nstructor = new Instructor(2,"Engin","DEM�RO�","88888888888","engindemirog@microsoft.com");
		
		Logger[] logers = {new DatabaseLogger(), new FileLogger()};
		
		StudentManager studentManager = new StudentManager(logers);
		
		studentManager.add(student);
		studentManager.addStudentTitle(student);
		studentManager.delete(student);
		
		//ELOPARTO
		
		InstructorManager instructorManager = new InstructorManager(logers);
		
		instructorManager.add(�nstructor);
		instructorManager.addInstructorTitle(�nstructor);
		instructorManager.delete(�nstructor);

	}

}
