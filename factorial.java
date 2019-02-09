// Recursive program for factorial//
import java.util.*;
public class factorial{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    factorial f = new factorial();
    System.out.println(f.fact(x));
  }
  public int fact(int a){
    if(a<=1){
      return 1;
    }
    else{
      return a*fact(a-1);
    }
  }
}