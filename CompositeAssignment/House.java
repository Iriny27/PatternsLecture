package composite;

import java.util.List;

public class House {

	private final List<Room> rooms;
	
	public House (List <Room> rooms) {
		this.rooms = rooms;
	}
	
	public List <Room> getRooms(){
		return rooms;
	}
	
}
