public class Alt{
  public static void main(String[] args){
    System.out.println(AcCalc(120,1));
  }
  public static int AcCalc(int n, int x){
     if(n>=1500){
      return x-1;
    }
    else{
      return AcCalc(n+120,x+1);
    }
  }
}