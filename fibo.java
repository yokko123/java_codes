//Recursive program for fibonacci series//
import java.util.*;
public class fibo{
  public static void main(String [] artf){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    fibo d = new fibo();
    System.out.println(d.fibonacci(x));
  }
  public int fibonacci(int n) {
  if(n==0){
      return 0;
  }
  else if(n==1){
    return 1;
  }
  else{
    return fibonacci(n-1)+fibonacci(n-2);
  }
}

}