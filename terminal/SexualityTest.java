import java.util.Scanner;

public class SexualityTest{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("What is your gender? (male, female)");
    String gender = input.nextLine();
    if(gender.equals("male")||gender.equals("female")){
      System.out.println("What gender are you attracted to? (male, female, both)");
      String agender = input.nextLine();
      if(gender.equals(agender)){
        System.out.println("You are gay");
      } else if(!agender.equals(gender)&&!agender.equals("both")){
        System.out.println("You are straight");
      } else if(agender.equals("both")){
        System.out.println("You are bisexual");
      }
    } else{
      System.out.println("Enter the right things dummy!");
    }
  }
}
