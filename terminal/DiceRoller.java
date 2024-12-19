import java.util.Scanner;

public class DiceRoller{
  public static void main(String[] args){
    System.out.println("What die do you want to roll?");
    System.out.println("(d4)");
    System.out.println("(d6)");
    System.out.println("(d8)");
    System.out.println("(d12)");
    System.out.println("(d20)");
    System.out.println("(d100)");
    Scanner scanner = new Scanner(System.in);
    String diceType = scanner.nextLine();
    System.out.println("How many rolls?");
    int rollAmmount = scanner.nextInt();
    System.out.println();
    int sum = 0;
    for (int i = 0; i < rollAmmount; i++) {
      int roll = roll(diceType);
      if(roll==-1){
        System.out.println("Enter the right things dummy!");
        return;
      }
      System.out.println(roll);
      sum += roll;
    }
    System.out.println("The sum is: "+sum);
  }
  public static int roll(String diceType){
    int sides;
    switch (diceType.toLowerCase()) {
      case "d4":
        sides = 4;
        break;
      case "d6":
        sides = 6;
        break;
      case "d8":
        sides = 8;
        break;
      case "d12":
        sides = 12;
        break;
      case "d20":
        sides = 20;
        break;
      case "d100":
        sides = 100;
        break;
      default:
        return -1;
    }
  return (int) (Math.random()*sides)+1;
  }
}
