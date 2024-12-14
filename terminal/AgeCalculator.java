import java.util.Scanner;

public class AgeCalculator{
  public static void main(String[] args){
    System.out.println("AGE CALCULATOR");
    System.out.println();
    Scanner input = new Scanner(System.in);
    System.out.println("Enter your age:");
    String age = input.nextLine();
    System.out.println("Calculating...");
    try{
      Thread.sleep(5000);
    } catch (InterruptedException e){
      System.out.println(e.getMessage());
    }
    System.out.println("You are "+age+" years old!");
  }
}
