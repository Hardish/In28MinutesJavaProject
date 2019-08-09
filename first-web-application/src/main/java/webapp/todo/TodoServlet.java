package webapp.todo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import webapp.login.LoginService;
import webapp.todo.TodoService;


@WebServlet(urlPatterns = "/todo.do")
public class TodoServlet extends HttpServlet {

	LoginService userValidationService = new LoginService();
	TodoService todoService = new TodoService();
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		request.setAttribute("todos", todoService.retriveTodos());
		request.getRequestDispatcher("/WEB-INF/views/todo.jsp").forward(request, response);
	}

	/*
	 * @Override protected void doPost(HttpServletRequest request,
	 * HttpServletResponse response) throws IOException, ServletException {
	 * 
	 * String name = request.getParameter("name"); String password =
	 * request.getParameter("password");
	 * 
	 * boolean isUserValid = userValidationService.isUserValid(name, password);
	 * 
	 * if(isUserValid) { request.setAttribute("name",name );
	 * //request.setAttribute("password",password ); request.setAttribute("todos",
	 * todoService.retriveTodos());
	 * request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request,
	 * response); }
	 * 
	 * else { request.setAttribute("errorMessage", "Invalid Credentials !");
	 * request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request,
	 * response); }
	 * 
	 * }
	 */

}

