package users;
public class UserManager{
	static final String storedUsername="ABC";
	static final String storedPassword="123";
	
	public static boolean authenticate(String username,String password){
		if(username.equals(storedUsername) && password.equals(storedPassword)){
		return true;}
		else{
		return false;}
}
}