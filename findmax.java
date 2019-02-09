//finding max from a list 
public class findmax{
  public static void main(String[] args){
    int a[] = {10,20,30,40,50};
    Node head = new Node(a[0],null);
    Node tail= head;
    for(int i=1;i<a.length;i++){
      Node n = new Node(a[i],null);
      tail.next = n;
      tail = tail.next;
    }
    System.out.println(findmax(head));
  }
  public static int findmax(Node head){
    if(head.next==null){
      return head.elem;
    }
    else{
      return max(head.elem,findmax(head.next));
    }
  }
  public static int max(int k,int n){
    if(n>k){
      return n;
    }
    else{
      return k;
    }
  }
}