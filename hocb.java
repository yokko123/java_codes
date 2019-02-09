public class hocb{
  public static void main(String[] args){
    int h = 3;
    System.out.println(hocb(h));
  }
  public static int hocb(int h){
    if(h==0){
      return 0;
    }
    else if(h==1){
      return 8;
    }
    else{
      return 5+hocb(h-1);
    }
}
}