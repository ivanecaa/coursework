import java.util.*;

public abstract class Rotor {
	protected String name;
	protected int position;
	protected int[] mapping;
	protected static final int ROTORSIZE=26;
	
	Rotor(String name){
		this.name = name;
		this.mapping=new int[ROTORSIZE];
	}
	Rotor(){
	}
	public void setPosition(int Position) {
		if(Position>=0 && Position<=25) {
		this.position=Position;
		}
	}
	
	public int getPosition() {
		return position;
	}
	
	public abstract void initialise(String type);
	
	public abstract int substitute(int n);
	
	
	
}
