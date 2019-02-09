public class hagu{
  public static void main(String[] args){
    double hagu = 5335;
    System.out.println(hcount(hagu));
  }
  public static double hcount(double hagu){
    if(hagu>=3){
      return 2+hcount(hagu-3);
    }
    else{
      return hagu/3;
    }
  }
}