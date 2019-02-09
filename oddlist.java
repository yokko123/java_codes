public class oddlist{
  public static void main(String[] args){
    int a[] = {10,20,30,40,50};
    Node head = new Node(a[0],null);
    Node tail= head;
    for(int i=1;i<a.length;i++){
      Node n = new Node(a[i],null);
      tail.next = n;
      tail = tail.next;
    }
    odd(head);
  }
  public static void odd(Node h){
    
    if(h.next!=null){
      System.out.print(h.elem+" ");
      odd(h.next.next);
    }
    else {
      System.out.print(h.elem+" ");
    }
}
}