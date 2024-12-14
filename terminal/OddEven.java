public class OddEven{
  public static void main(String[] args){
    int value = 1;
    char s = '"';
    System.out.println("if(value==0){");
    System.out.println("  System.out.println("+s+"The Value is even!"+s+");");
    for (int i=0; i<100; i++){
      System.out.println("} else if(value=="+value+"{");
      System.out.println("  System.out.println("+s+"The Value is odd!"+s+");");
      value++;
      System.out.println("} else if(value=="+value+"{");
      System.out.println("  System.out.println("+s+"The Value is even!"+s+");");
      value++;
    }
  }
}
