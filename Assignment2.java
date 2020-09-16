import java.util.Scanner;
public class Assignment2 
{
	public static void main(String[] args)
	{
		Scanner Num = new Scanner(System.in);
		System.out.print("Enter binary number: ");
		String input = Num.nextLine();
		int deci2 = Assignment2.binaryToDecimal(input);
		
		System.out.println(deci2);
		String answer2 = Assignment2.decimalToHex(deci2);
		System.out.println(answer2);
		
	}
	public static int binaryToDecimal(String input)
	{
		int num2 = Integer.parseInt(input,2);
		return num2;
	}
	
	public static String decimalToHex(int num2)
	{
		String answer = "";
		String map = "0123456789ABCDEF";
		while(num2 != 0)
		{
			int temp = num2 %16;
			answer = map.charAt(temp) + answer;
			num2 = num2 / 16;
		}
		return answer;		
		}
		
	
}

	
