package OOPexp;

import java.util.ArrayList;

// we will create a class called classes that are taught at an academy
// a class will have a name, a code, a professor that teaches the class and a room number
public class classes {
	
	private String name; // of the class
	private String professor;
	private int room;
	
	public classes(String name, String professor, int room) {
		this.name = name;
		this.professor = professor;
		this.room = room;
		
	}
	
	public void lecture() {
		System.out.println(this.professor + " will teach " + this.name + " in room number " + this.room);
	}
	
	public int getRoom() {
		return this.room;
	}
	
	// sometimes the room is closed for cleaning, so we need another room
	
	public void newRoom(int room) {
		this.room = room;
	}

}
