//Recursive program for multiplication//
import java.util.*;
public class multiply{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    multiply m = new multiply();
    System.out.println( m.multiplication(x,y));
  }
  public int multiplication(int a,int b){
    if(a==0 || b==0){
      return 0;
    }
    else if(b>=1){
      return a+multiplication(a,b-1);
    }
    return -1;
  }
}