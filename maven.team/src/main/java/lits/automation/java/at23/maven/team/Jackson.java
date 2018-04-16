package lits.automation.java.at23.maven.team;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class Jackson {
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		InputStream input = new FileInputStream("employees.json");

		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
		TypeFactory typeFactory = TypeFactory.defaultInstance();
		List<Employees> employees = objectMapper.readValue(input,
				typeFactory.constructCollectionType(ArrayList.class, Employees.class));
		Collections.sort(employees);
		System.out.println(employees);

		EmployeeComparator empComparator = new EmployeeComparator();
		System.out.println("\nSorted list of students by First Name:");
		Collections.sort(employees, empComparator);
		System.out.println(employees);

		System.out.println("Hello Iryna!!!!");
		System.out.println("Hello Ivan!!!!");
	}

}
