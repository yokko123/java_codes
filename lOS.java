//Recursive program for length of a String//
import java.util.*;
public class lOS{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    String s = sc.nextLine();
    lOS l = new lOS();
    System.out.println(l.strLength(s));
  }
  public int strLength(String s){
    if(s.equals("")){
      return 0;
    }
    else{
      return 1+strLength(s.substring(1));
    }
  }
}