//Recursive Program for sequential search in an array//
public class binarysearch{
  public static void main(String[] args){
    int a[] = {10,20,30,40};
    int c = 50;
    int l = 0;
    int r = 3;
    binarysearch k = new binarysearch();
    System.out.print(k.bins(a,c,l,r)+" ");
  }
  public boolean bins(int a[],int c, int l, int r){
    if(l>r){
      return false;
    }
    else {
      int mid = (l+r)/2;
      if(c==a[mid]){
        return true;
      }
      else if(c>a[mid]){
        return bins(a,c,mid+1,r);
      }
      else{
         return bins(a,c,l,mid-1);
      }
  }
}
}