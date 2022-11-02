package Mocikto1.abc;

import java.util.Arrays;
import java.util.List;

public class ToDoServiceStubbs implements ToDoService {
	public List<String> getToDos(String user) {

		return Arrays.asList(" Use Core Java ", " Use Spring Core ", " Use Hibernate ", " Use Spring MVC ");
	}
}
