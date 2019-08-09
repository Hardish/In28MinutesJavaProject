package webapp.login;

public class LoginService {

	public boolean isUserValid(String user,String password)
	{
		if(user.equals("Disha") && password.equals("Disha"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
