package builderpattern;

public class FacultyDean {
	
	private CourseBuilder CourseBuilder;
	
	public FacultyDean (CourseBuilder coursebuilder) {
		this.CourseBuilder = coursebuilder;
		
	}
	
	public Course getCourse() {
		return  this.CourseBuilder.getCourse();
	}
	
	public void StartCourse() {
		this.CourseBuilder.buildInstructor();
		this.CourseBuilder.buildDuration();
		this.CourseBuilder.buildtopic();
	}

}
