package jsonDeserializationread;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class jsonRead {
	public static void main(String[] args) throws StreamReadException, DatabindException, IOException  {
		File file=new File("C:\\Users\\Admin\\eclipse-workspace\\Apiprogramjan\\src\\test\\resources\\jsonfile\\sample.json");
	
ObjectMapper mapper=new ObjectMapper();
	Rootclass readValue = mapper.readValue(file, Rootclass.class);
	int id = readValue.getId();
	System.out.println(readValue.getId());
	System.out.println(readValue.getName());
	Employee emp=readValue.getEmployee();
	System.out.println(emp.getEmpid());
	System.out.println(emp.isWorkingStatus());
	ArrayList<String> course = readValue.getCourse();
	System.out.println(course.get(1));
System.out.println("**********************");
	for (int i = 0; i <course.size() ; i++) {
		String string = course.get(i);
		System.out.println(string);
		
	}

	
	}}