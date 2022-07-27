import java.util.HashMap;
import java.util.Map;

public class Car {
	
	//<Family,Feature>
	Map<String, String> featureMap = new HashMap<String, String>();	

	String name;
	int penalty;
	
	public Car(String name, int penalty, String...strings) {
		for (int i = 0; i < strings.length; i+=2) {
			featureMap.put(strings[i], strings[i+1]);
		}
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPenalty() {
		return penalty;
	}

	public void setPenalty(int penalty) {
		this.penalty = penalty;
	}
}
