//Recursive program for decimal to Hexadecimal//
import java.util.*;
public class dectoHex{
  public static void main(String [] artf){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    dectoHex d = new dectoHex();
    d.toHex(x);
  }
  public void toHex(int a){
    if(a>0){
      toHex(a/16);
      System.out.print(a%16);
    }
  }
}