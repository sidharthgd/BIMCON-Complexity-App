import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.*;

public class main {

	public static void main(String[] args) {
        
		
    	
		Scanner inScanner = new Scanner(System.in);
		while (true) {
			System.out.println("Design a Car - C\nAdd a family - F\nAdd a feature - E\nPrint families - P\nQuit - Q");
			String input = inScanner.nextLine().toUpperCase();
			
			if (input.equals("F")) {
				addFamily(inScanner);
			}
			
			else if(input.equals("P")){
				for (int i = 0; i < Family.families.size(); i++) {
					System.out.println(Family.families.get(i).name + " - " + 
									   Family.families.get(i).featuresToString());
				}
				System.out.println();
			}
			
			else if(input.equals("E")) {
				addFeature(inScanner);
			}
			
			else if(input.equals("Q")) {
				System.out.println("Quitting");
				inScanner.close();
				System.exit(0);
			}
			
			else if(input.equals("C")) {
				
			}
		}
	}
	
	public static void addFamily(Scanner inScanner) {
		System.out.println("What is the family called: ");
		String familyName = inScanner.nextLine();
		//System.out.println(familyName);
		System.out.println("What features does this family have (separated by commas): ");
		String[] featuresArr = inScanner.nextLine().replaceAll("\\s+","").split(",");
		new Family(familyName, featuresArr);
		System.out.println("New family created!\n");
	}
	
	
	public static void addFeature(Scanner inScanner) {
		System.out.println("Which family would you like to edit?");
		for (int i = 0; i < Family.families.size(); i++) {
			System.out.println(Family.families.get(i).name);	
		}
		String name = inScanner.nextLine();
		Family f = Family.getFamily(name);
		if (f == null) {
			System.out.println("No family found by that name");
		}
		else {
			System.out.println("The features currently in that family are: \n" + f.featuresToString());
			System.out.println("Enter a feature you would like to add (Q to quit): ");
			String input = inScanner.nextLine();
			if(input.equals("Q")) {
				return;
			}
			f.addFeature(new Feature(input));
			System.out.println("Added!");
		}
	}
	
	public static void setUpDesignPage(JFrame frame) {
		JPanel designPanel = new JPanel(new GridLayout());
    	frame.add(designPanel, BorderLayout.CENTER);    	

    	for(int i = 0; i < 6; i++) {
    		designPanel.add(new JLabel("TEST" + i), 0, i);
    	}
		
	}
	
}
