package composite;
import java.util.ArrayList;
import java.util.List;
public class Main {

	public static void main (String [] args) {
		
		Room room1 = new Room (30.0, "white");
		Room room2 = new Room (25.5,"Beige");
		Room room3 = new Room (15, "blue");
		
		List <Room> rooms = new ArrayList <Room>();
		rooms.add(room1);
		rooms.add(room2);
		rooms.add(room3);
		
		 House house1 = new House(rooms);   
	        List<Room> room = house1.getRooms();   
	        for (Room rm : room) {   
	            System.out.println("Area of room = " + rm.getArea() +", Color of room is "+ rm.getColor()); 
		
		
		
	}
}
	}

