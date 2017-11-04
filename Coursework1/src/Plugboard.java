import java.util.ArrayList;
import java.util.Iterator;


public class Plugboard {
private static ArrayList<Plug> plugList;
	
	public Plugboard() {
		plugList = new ArrayList<Plug>();
	}
	
	public boolean addPlug(char end1, char end2) {
		
		Plug newPlug = new Plug(end1, end2);
		boolean plugInserted = false;
		
		if (plugList.isEmpty()) {
			
			plugList.add(newPlug);
			plugInserted = true;
		
		} else {
			
			Iterator<Plug> itr = plugList.iterator();
			while (itr.hasNext() && !itr.next().clashesWith(newPlug)) {
					plugInserted = true;
			}
			
			if (plugInserted) {
				plugList.add(newPlug);
			}
			
		}
		
		return plugInserted;
	}
	
	public int getNumPlugs() {
		return plugList.size();
	}
	
	public void clear() {
		plugList.clear();
	}
	
public char substitute(char letterIn) {
		
		Iterator<Plug> itr = plugList.iterator();
		if (!plugList.isEmpty()) {
			while (itr.hasNext()) {
				letterIn = itr.next().encode(letterIn);
			}
		}
		
		return letterIn;
	}
	
}
