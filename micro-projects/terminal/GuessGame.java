import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        int random = (int) (Math.random() * 10) + 1;
		System.out.println("Guess a number (1-10) You have 2 tries!");
    	Scanner input = new Scanner(System.in);
		int userinput1 = input.nextInt();
		if (userinput1==random){
			System.out.println("Congrats, you won!");
			System.exit(0);
		}
		else if (userinput1>random) {
			System.out.println("Try lower!");
		}
		else {
			System.out.println("Try higher!");
		}
		int userinput2 = input.nextInt();
		if (userinput2==random){
			System.out.println("Congrats, you won!");
			System.exit(0);
		}
		else{
			System.out.println("Unlucky :(");
		}
	}
}

