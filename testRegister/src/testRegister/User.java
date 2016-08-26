package testRegister;

public class User 
{
	String username;
	String pwd;
	String cpwd;
	
	public User(String username, String pwd, String cpwd) 
	{
		super();
		this.username = username;
		this.pwd = pwd;
		this.cpwd = cpwd;
	}
	
	@Override
	public String toString() 
	{
		return "User [username=" + username + ", pwd=" + pwd + ", cpwd=" + cpwd + "]";
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getCpwd() {
		return cpwd;
	}
	public void setCpwd(String cpwd) {
		this.cpwd = cpwd;
	}
}
