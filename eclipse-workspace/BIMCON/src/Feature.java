
public class Feature {

	String name;
	int penalty;
	
	public Feature (String name) {
		this.name = name;
		//this.penalty = penalty;
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
