//Recursive Program for length of a linked list//
public class lOl{
  public static void main(String[] args){
    int a[] = {10,20,30,40,50};
    Node head = new Node(a[0],null);
    Node tail= head;
    for(int i=1;i<a.length;i++){
      Node n = new Node(a[i],null);
      tail.next = n;
      tail = tail.next;
    }
    lOl l = new lOl();
    System.out.print(l.listLength(head)+" ");
    System.out.println(" ");
    printList(head);
  }
  public int listLength(Node head){
    if(head==null){
      return 0;
    }
    else{
      return 1+listLength(head.next);
    }
  }
  public static void printList(Node head){
    
    if(head!=null){
      System.out.print(head.elem+" ");
      printList(head.next.next);
    }
  }
}