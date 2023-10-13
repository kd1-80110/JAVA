import java.util.Scanner;

public class StringLength {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String string;
					
		try {
			System.out.println("Enter the string");
			string = sc.next();
			
			System.out.println("Length of string is : "+string.length());
			if(string.length() > 80)
			{
				throw new ExceptionLineTooLong("The strings is too long");
//				throw new ExceptionLineTooLong();
			}
					
			System.out.println("string entered is : "+string);			
		} catch(ExceptionLineTooLong exception) {
			System.out.println(exception.getMessage());
		}
		sc.close();
	}		

}
