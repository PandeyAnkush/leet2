public class ListReversal {
    public static void main(String[] args) {
        ListNode head=null;
        ListNode caller=new ListNode();
        int val[]={1,2,3,4,5};
        for (int i=0;i<val.length;i++){
            head=caller.createList(head, val[i]);
        }
        caller.print(head);
    }
    
}
  class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     ListNode createList(ListNode head,int n){
        if(head==null){
            head=new ListNode(n, null);
        }
        else{
            ListNode temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=new ListNode(n, null);
        }

        return head;
     }
     void print(ListNode head){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        ListNode temp=head;
        while(temp!=null){

            System.out.print(temp.val+"  ");
            temp=temp.next;
        }
        System.out.println();
     }
}