package composite;

public class Room {

	private double area;
	private String color;
	
	public Room(double area, String color) {
		this.area= area;
	    this.color = color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setArea(double area) {
		this.area = area;

	}
	public double getArea() {
		return area;
	}
	
	
}
