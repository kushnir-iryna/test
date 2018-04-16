package lits.automation.java.at23.maven.team;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Employees implements Comparable<Employees>{
	private String firstName;
	private String lastName;
	private String position;
	private int salary;

	@JsonCreator
	public Employees(@JsonProperty("firstName") String firstName, @JsonProperty("lastName") String lastName,
			@JsonProperty("position") String position, @JsonProperty("salary") int salary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.position = position;
		this.salary = salary;
	}

	public String getFName() {
		return firstName;
	}

	public String getLName() {
		return lastName;
	}

	public String getPosition() {
		return position;
	}

	public int getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Employees [firstName=" + firstName + ", lastName=" + lastName + ", position=" + position + ", salary="
				+ salary + "]";
	}

	public int compareTo(Employees anotherEmployee) {
		if (anotherEmployee.lastName.equals(lastName)) {
			return firstName.compareToIgnoreCase(anotherEmployee.firstName);
		}
		return lastName.compareToIgnoreCase(anotherEmployee.lastName);	
	}
}
