import java.util.Scanner;
public class VoteTest{
  public static void main(String[] args){
    System.out.println("Here's a test to see if you could vote in the United States in the 1800s");
    System.out.println("What is your gender? (male, female)");
    Scanner input = new Scanner(System.in);
    String ui = input.nextLine();
    if (ui.equals("female")){Fail();}
    System.out.println("Are you white?");
    ui = input.nextLine();
    if (ui.equals("no")){Fail();}
    System.out.println("Are you atleast 21 years old?");
    ui = input.nextLine();
    if (ui.equals("no")){Fail();}
    System.out.println("Are you a citizen?");
    ui = input.nextLine();
    if (ui.equals("no")){Fail();}
    System.out.println("Do you own property in this state?");
    ui = input.nextLine();
    if (ui.equals("no")){Fail();}
    System.out.println("Are your taxes paid?");
    ui = input.nextLine();
    if (ui.equals("no")){Fail();}
    System.out.println("Can you read and write in english?");
    ui = input.nextLine();
    if (ui.equals("no")){Fail();}
    System.out.println("have you been convicted of a crime?");
    ui = input.nextLine();
    if (ui.equals("no")){Fail();}
    System.out.println("Have you lived in this state for 1 year?");
    ui = input.nextLine();
    if (ui.equals("no")){Fail();}
    System.out.println("You are eligible to vote!");
  }
  public static void Fail(){
    System.out.println("You are not eligible to vote!");
    System.exit(0);
  }
}
