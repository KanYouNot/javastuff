import java.util.Scanner;

public class Grading{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("How many points did you get?");
    float userP = input.nextFloat();
    System.out.println("What was the maximum ammount of points?");
    float allP = input.nextFloat();
    System.out.println();
    float perc = userP/allP*100;
    System.out.println("Your percentage: "+perc);
    if(perc<40){
      System.out.println("You got an F");
    } else if(perc>=40&&perc<60){
      System.out.println("You got a C");
    } else if(perc>=60&&perc<90){
      System.out.println("You got a B");
    } else if(perc>=90){
      System.out.println("You got an A");
    } else{
      System.out.println("Enter the right things, dummy!");
    }
  }
}
