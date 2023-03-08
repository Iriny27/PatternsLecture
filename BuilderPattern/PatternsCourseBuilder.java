package builderpattern;

public class PatternsCourseBuilder implements CourseBuilder {
	private Course course;
	
	public PatternsCourseBuilder () {
		this.course = new Course();
	}

	@Override
	public void buildInstructor() {
		course.setInstructor("Dr Youssef");
	}

	@Override
	public void buildDuration() {
		course.setDuration("4 months");
		
	}

	@Override
	public void buildtopic() {
		course.setTopic("Design Patterns");
		
	}

	@Override
	public Course getCourse() {
		// TODO Auto-generated method stub
		return this.course;
	}
	

}
