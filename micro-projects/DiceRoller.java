public class DiceRoller{
  public static void main(String[] args){
    int d6 = (int)(Math.random()*6)+1;
    System.out.println("Rolled D6:"+d6);
    int d6 = (int)(Math.random()*20)+1;
    System.out.println("Rolled D20: "+d20);
    int d6 = (int)(Math.random()*8)+1;
    System.out.println("Rolled D8: "+d8);
    int d6 = (int)(Math.random()*4)+1;
    System.out.println("Rolled D4: "+d4);
  }
}
