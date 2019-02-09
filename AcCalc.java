public class AcCalc{
  public static void main(String[] args){
    double sqft = 1500;
    System.out.println(AcCalc(sqft));
  }
  public static double AcCalc(double h){
     if(h>=120){
      return 1+AcCalc(h-120);
    }
    else{
      return h/120;
    }
  }
}