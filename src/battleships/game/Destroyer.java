package battleships.game;

public class Destroyer extends Ship {
	public Destroyer(int col, int row, Direction direction) {
		size = getStaticSize();
		startup(col, row, direction);
	}
	
	public int getSize(){
		return size;
	}
	
	//this exists, since the Value is not instance-dependent, BUT you cant overwrite an abstract method with a static one
	public static int getStaticSize(){
		return 3;
	}
}
