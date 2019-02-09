//Recursive program for summation of N numbers//
import java.util.*;
public class sum{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    sum s = new sum();
    int a = s.summation(x);
    System.out.println(a);
  }
  public int summation(int a){
    int sum = 0;
    if(a==0){
      return sum;
    }
    else if(a>0){
      sum=sum+a;
      return sum+summation(a-1);
    }
    else{
      return -1;
    }
  }
}