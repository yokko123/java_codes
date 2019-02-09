//Recursive Program for sequential search in a linked list//
public class seqsearch{
  public static void main(String[] args){
    int a[] = {10,20,30,40,50};
    Node head = new Node(a[0],null);
    Node tail= head;
    for(int i=1;i<a.length;i++){
      Node n = new Node(a[i],null);
      tail.next = n;
      tail = tail.next;
    }
    int c = 95;
    seqsearch l = new seqsearch();
    System.out.print(l.listLength(head,c)+" ");
  }
  public boolean listLength(Node head,int k){
    if(head==null){
      return false;
    }
    else if(head.elem==k){
       return true;
    }
    else{
      return listLength(head.next,k);
    }
  }
}