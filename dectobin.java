//Recursive program for decimal to binary//
import java.util.*;
public class dectobin{
  public static void main(String [] artf){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    dectobin d = new dectobin();
    d.toBin(x);
  }
  public void toBin(int a){
    if(a>0){
      toBin(a/2);
      System.out.print(a%2);
    }
  }
}