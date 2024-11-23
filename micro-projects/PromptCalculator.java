import java.util.Scanner;

class PromptCalculator{
	public static void main(String[] args){
	
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first number:");
		double n1 = input.nextDouble();
		
		System.out.println("Enter the second number:");
		double n2 = input.nextDouble();
		input.nextLine();

		System.out.println("Enter the operation:  + - * /");
		String op = input.nextLine();

		double ou;

		switch(op){
			case "+":
				ou = n1+n2;
				System.out.println("The result is "+ ou);
				break;
			case "-":
				ou = n1-n2;
				System.out.println("The result is "+ ou);
				break;
			case "*":
				ou = n1*n2;
				System.out.println("The result is "+ ou);
				break;
			case "/":
				ou = n1/n2;
				System.out.println("The result is "+ ou);
				break;
			default:
				System.out.println("Enter the right things dummy!");
				break;
		}
	input.close();
	}
}
