package lits.automation.java.at23.maven.team;

import java.util.Comparator;


public class EmployeeComparator implements Comparator<Employees>{

	public int compare(Employees o1, Employees o2) {
		 String firstName1 = o1.getFName();
         String firstName2 = o2.getFName();
         return firstName1.compareTo(firstName2);
         System.out.println("Hello Iryna!!!!");
	}
	

}
