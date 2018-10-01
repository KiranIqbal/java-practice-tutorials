import java.util.Scanner;


public class LoopsCondition {
	public static void main(String[] args) {
	
		//while loop
		/*int value = 0;
		while (value < 10)
		{
		System.out.println("Excute While loop"+ value);
		value = value + 1;
		}*/
		
		// for loop
	/*	for (int i =0 ; i <10; i++)
		{
			System.out.println("value of i is:" +" "+i);
			
		}*/
		
		// While loop with If condition
		
	/* int i = 0;
		while (true)
		{
			System.out.println("the value is of i is: "+i);
			 
			if (i == 5)
			{
				break;
			}
		i++;
		
		System.out.println("running");
		} 
		*/
		// User Input practice
		
	/*	Scanner input =  new Scanner(System.in);
		System.out.println("Enter a line");
		String line = input.nextLine();
		System.out.println("You entered:" + line);
		*/
		
		// Do while loop
		/*Scanner value = new Scanner (System.in);
		
		int num = 0;
		
		do{
			System.out.println("Enter a number");
			num = value.nextInt();
		}
		while (num!=5);
		System.out.println("Got 5");
		
		*/
		// Switch operation in Java - Switch is more efficient in some circumstances
		Scanner input = new Scanner(System.in);
		System.out.println("Enter input");
		String value = input.nextLine();
		
		switch(value)
		{
			case "Start":
			System.out.println("Machine started!");
			break;
			
			case "stop":
			System.out.println("Machine stopped!");
			break;
			
			default:
				System.out.println("error code");
			
		}
		
		
	}

}
