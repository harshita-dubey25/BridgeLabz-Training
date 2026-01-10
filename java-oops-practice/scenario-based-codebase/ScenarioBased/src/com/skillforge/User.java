package skillforge;

abstract public class User {
	int userId;
	String name;
	String email;
	
	User(int userId, String name, String email){
		this.userId = userId;
		this.name = name;
		this.email = email;
	}
	
	abstract void login();
}
