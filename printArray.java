//Recursive program for printing an array forward and reverse//
public class printArray{
  public static void main(String[] args){
    int a[] = {10,20,30,40,50};
    printArray p = new printArray();
    System.out.println("Forward :");
    p.printforward(a,a.length-1);
    System.out.println(" ");
    System.out.println("Backward :");
    p.printbackward(a,a.length-1);
  }
  public void printforward(int b[], int length){
    if(length!=-1){
      printforward(b,length-1);
      System.out.print(b[length]+" ");
    }
  }
  public void printbackward(int b[], int length){
    if(length!=-1){
      System.out.print(b[length]+" ");
      printbackward(b,length-1);
    }
  }
}