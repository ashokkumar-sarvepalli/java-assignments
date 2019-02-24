package assignment.oopsconcept.problem5;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of shipment entity :");
		int n = Integer.parseInt(buff.readLine());
		String[] values = new String[n];
		Object[] object = new Object[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter the entity "+(i+1)+" details :");
			values[i] = buff.readLine();
			if(values[i].substring(0,2).equalsIgnoreCase("CO")) {
				object[i] = new Company(values[i]);
			}
			else if(values[i].substring(0,2).equalsIgnoreCase("AG")) {
				object[i] = new Agent(values[i]);
			}
			else if(values[i].substring(0,2).equalsIgnoreCase("CA")) {
				object[i] = new Carrier(values[i]);
			}
		}
		System.out.println("Enter the entity id :");
		String id = buff.readLine();
		for(int i=0;i<n;i++) {
			String[] val = values[i].split(",");
			if(val[0].equalsIgnoreCase(id)) {
				if(id.substring(0,2).equalsIgnoreCase("CO")) {
					Company c = (Company)object[i];
					c.displayMenu();
					c.choiceAction(Integer.parseInt(buff.readLine()));
				}
				else if(id.substring(0,2).equalsIgnoreCase("AG")) {
					Agent a = (Agent)object[i];
					a.displayMenu();
					a.choiceAction(Integer.parseInt(buff.readLine()));
				}
				else if(id.substring(0,2).equalsIgnoreCase("CA")) {
					Carrier c = (Carrier)object[i];
					c.displayMenu();
					c.choiceAction(Integer.parseInt(buff.readLine()));
				}
			}
		}
	}
}