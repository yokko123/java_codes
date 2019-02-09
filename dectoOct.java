//Recursive program for decimal to octal//
import java.util.*;
public class dectoOct{
  public static void main(String [] artf){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    dectoOct d = new dectoOct();
    d.toOct(x);
  }
  public void toOct(int a){
    if(a>0){
      toOct(a/8);
      System.out.print(a%8);
    }
  }
}