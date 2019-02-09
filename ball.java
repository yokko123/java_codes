public class ball{
  public static void main(String[] args){
    double k = 1000;
    System.out.println(kick(k));
  }
  public static double kick(double k){
    if(k>=27){
      return 4+kick(k-27);
    }
    else{
      return k/27;
    }
  }
}