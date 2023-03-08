package builderpattern;

public class Main {
	public static void main (String [] args) {
		CourseBuilder Patterns = new PatternsCourseBuilder();
		FacultyDean Dean = new FacultyDean (Patterns);
		
		Dean.StartCourse();
		Course course = Dean.getCourse();
		
		System.out.println("Course started " + course);
		
	}

}
