import java.util.ArrayList;

public class Family {

	public static ArrayList<Family> families = new ArrayList<Family>();
	
	ArrayList<Feature> features = new ArrayList<Feature>();
	String name;
	int penalty;
	
	public Family(String name, String[] features) {
		for (String f : features) {
			this.name = name;
			this.features.add(new Feature(f));
			//this.penalty = penalty;
		}
		families.add(this);
	}
	
	public static Family getFamily(String name) {
		for (int i = 0; i < families.size(); i++) {
			if (families.get(i).name.equals(name)) {
				return families.get(i);
			}
		}
		return null;
	}
	
	public void addFeature(Feature feature) {
		this.features.add(feature);
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
	
	
	public String featuresToString() {
		String s = features.get(0).name;
		for (int i = 1; i < features.size(); i++) {
			s = s + ", " + features.get(i).name;
		}
		return s;
	}
	
	
}
