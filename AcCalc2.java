public class AcCalc2{
  public static void main(String[] args){
    double sqft = 12.5;
    System.out.println(AcCalc(sqft));
  }
  public static double AcCalc(double h){
     if(h>=1){
      return 120+AcCalc(h-1);
    }
    else{
      return h*120;
    }
  }
}