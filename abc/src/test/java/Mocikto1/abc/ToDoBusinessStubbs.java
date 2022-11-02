package Mocikto1.abc;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

public class ToDoBusinessStubbs {
	@Test
	public void test() {

		ToDoService doServiceStub = new ToDoServiceStubbs();

		ToDoBusiness business = new ToDoBusiness(doServiceStub);

		List<String> retrievedtodos = business.getTodosforSpring(" Dummy ");

		assertEquals(2, retrievedtodos.size());
		System.out.println(" Stub is working correctly...!!");
	}
}
