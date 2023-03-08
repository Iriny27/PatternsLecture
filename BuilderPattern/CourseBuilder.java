package builderpattern;

public interface CourseBuilder {
	public void buildInstructor();
	public void buildDuration();
	public void buildtopic();
	public Course getCourse();

}
