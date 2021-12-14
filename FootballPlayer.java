import java.util.ArrayList;

public class FootballPlayer extends Athlete {

	private Position position;
	private int superbowlRings;
	
	/* If you can't this constructor to compile, leave it empty, but DO NOT REMOVE 
	 * IT or you will get 0 points on the entire coding part of the quiz. */
	public FootballPlayer(String name, int number, Position position, int rings) {
		super(name, number);
		setPosition(position);
		superbowlRings = rings;
	}
	
	/* If you can't get this method to compile, remove it. */
	public String toString() {
		return super.toString() + " " + position + " " + superbowlRings;    // remove this statement and implement it correctly
	}
	
	/* If you can't get this method to compile, remove it. */
	public static ArrayList<Position> method1(ArrayList<FootballPlayer> team) {
		ArrayList<Position> unfilled = new ArrayList<Position>();
		ArrayList<Position> filled = new ArrayList<Position>();
		
		for (FootballPlayer player : team) {
			filled.add(player.position);
		}
		for (Position position : Position.values()) {
			if (!filled.contains(position)) {
				unfilled.add(position);
			}
		}
		return unfilled;   // remove this statement and implement it correctly
	}
	
	
	
	
	
	
	
	
	/* Don't modify this method -- we need it for testing purposes */
	public void setPosition(Position p) {
		this.position = p;
	}
	
}
