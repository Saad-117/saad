package main;
import util.PasswordValidator;
import users.UserManager;
import java.io.Console;
public class LoginSystem{
	public static void main(String args[]){
		System.out.println("enter username");
		Console co = System.console();
		String s=co.readLine();
		System.out.println("enter password");

		String p=String.valueOf(co.readPassword());
		
		if(UserManager.authenticate(s,p)==true){
			System.out.println("correct");}
			else{
			System.out.println("incorrect");}
				

}

}