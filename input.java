import java.util.Scanner;
public class input{

	public static void main(String args[]){
		
		Scanner scanner = new Scanner(System.in);
		int i;
		String name;
		System.out.println("enter value");
		i=scanner.nextInt();
		System.out.println("value "+i);
		scanner.nextLine();
		System.out.println("enter name");
		name=scanner.nextLine();
		System.out.println("value "+name);

		
	}
}