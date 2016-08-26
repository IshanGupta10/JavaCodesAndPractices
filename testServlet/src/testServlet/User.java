package testServlet;

public class User 
{
	String username, password, confpass;

	public User(String string, String string2, String string3) 
	{
		this.username = string;
		this.password = string2;
		this.confpass = string3;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfpass() {
		return confpass;
	}

	public void setConfpass(String confpass) {
		this.confpass = confpass;
	}

	@Override
	public String toString()
	{
		return "User username = " + username + ", password = " + password + ", confpass = " + confpass;
	}

	
}
