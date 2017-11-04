

public class Plug {
	private char end1;
	private char end2;
	
	Plug(char end1, char end2)
	{
		this.end1=end1;
		this.end2=end2;
	}
	
	public char getEnd1() {
		return end1;
	}
	
	public void setEnd1(char End1) {
		end1=End1;
	}
	
	public char getEnd2() {
		return end2;
	}
	
	public void setEnd2(char End2) {
		end2=End2;
	}
	
	public char encode(char letterIn) {
		if(end1==letterIn)
			return end2;
		else if(end2==letterIn)
			return end1;
		else
			return letterIn;
	}
	
public boolean clashesWith(Plug plugin) {
		
		boolean clashes = false;
		
		if (plugin.getEnd1() == end1 || plugin.getEnd1() == end2
				|| plugin.getEnd2() == end1 || plugin.getEnd2() == end2) { 
			clashes = true;
		}
		
		return clashes;
	}

}

