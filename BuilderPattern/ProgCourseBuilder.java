package builderpattern;

public class ProgCourseBuilder implements CourseBuilder {
	
	private Course course;
	
	public ProgCourseBuilder() {
		this.course = new Course();
	}
	
	
	@Override
	public void buildInstructor() {
		course.setInstructor("Dr Kareem");
	}

	@Override
	public void buildDuration() {
	   course.setDuration("4 months");
		
	}

	@Override
	public void buildtopic() {
		course.setTopic("Python");
		
	}


	@Override
	public Course getCourse() {
		
		return this.course;
	}
	
	

}
