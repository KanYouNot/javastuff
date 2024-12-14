import java.util.Scanner;


public class SingleCalculator{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    String data = input.nextLine();
    char op = ' ';
    for (char c : data.toCharArray()){
      if (!Character.isDigit(c)){
        op = c;
        break;
      }
    }

    String[] parts = data.split("\\"+op);
    int n1 = Integer.parseInt(parts[0].trim());
    int n2 = Integer.parseInt(parts[1].trim());

    int out = 0;
    switch (op){
      case '+':
        out = n1+n2;
        break;
      case '-':
        out = n1-n2;
        break;
      case '*':
        out = n1*n2;
        break;
      case '/':
        out = n1/n2;
        break;
      default:
        System.out.println("Go fuck yourself");
        return;
    }
    System.out.println(out);
  }
}
