import java.util.Scanner;

class PromptCalculator{
	public static void main(String[] args){
	
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first number:");
		int n1 = input.nextInt();
		
		System.out.println("Enter the second number:");
		int n2 = input.nextInt();
		input.nextLine();

		System.out.println("Enter the operation:  + - * /");
		String op = input.nextLine();

		int ou = 0;

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
        double nd1 = n1;
        double nd2 = n2;
				double oud = ou;
        oud = nd1/nd2;
				System.out.println("The result is "+ oud);
				break;
			default:
				System.out.println("Enter the right things dummy!");
				break;
		}
	input.close();
	}
}
