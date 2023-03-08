package builderpattern;

public class Course implements CourseOutline {
	private String Instructor;
	private String Duration;
	private String topic;

	@Override
	public void setInstructor(String Instructor) {
	  this.Instructor = Instructor;
		
	}

	@Override
	public void setDuration(String Duration) {
		this.Duration = Duration;
		
	}

	@Override
	public void setTopic(String topic) {
	   this.topic = topic;
		
	}

}
