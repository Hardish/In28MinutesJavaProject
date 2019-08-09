package webapp.todo;

import java.util.ArrayList;
import java.util.List;

public class TodoService {

	//static list of todo 
	
	private static List<Todo> todos = new ArrayList<Todo>();
	
	static {
		todos.add(new Todo("Learn Web Application Developement"));
		todos.add(new Todo("Learn Spring MVC "));
		todos.add(new Todo("Learn Spring Rest Services"));
	}
	
	public List<Todo> retriveTodos()
	{
		return todos;
	}
}