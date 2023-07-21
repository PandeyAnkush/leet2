public class ListReversal {
    public static void main(String[] args) {
        ListNode head=null;
        ListNode caller=new ListNode();
        //int val[]={1,2,3,4,5,6,7,8,9};
        int val[]={-18,-29,30,10,-45,-93,9,-4,-52,91,61,91,19,32,-100,34,38,99,-93,-37,73,-67,-29,52,6,-50,-87,-33,6,-72,72,89,-51,-48,-52,-45,-41,7,1,-42,-3,-38,-52,66,44,99,0,-19,47,7,44,19,-10,65,-30,96,-86,-17,-87,-29,-39,85,-41,-39,87,-43,-34,-54,65,67,4,-39,79,2,-73,23,0,-23,54,97,34,-2,-35,-77,-88,-14,69,78,19,82,-52,81,17,-43,92,3,14,-43,49,-22,74,-98,-10,53,4,-33,-75,54,44,79,50,-73,-74,66,-50,-61,-49,-82,-84,70,-100,-86,0,17,-29,-59,70,85,-2,19,-87,-78,-29,-47,75,26,-30,100,-21,64,28,80,91,55,45,-60,94,46,-42,60,15,-92,74,-85,-25,-56,-44,-55,79,5,14,42,-23,35,95,-49,-40,-86,-100,-10,78,28,-31,68,-18,64,-93,-75,-41,-84,85,74,75,8,39,-100,2,46,96,-69,-100,-41,73,-23,94,18,-22,-46,32,-22,44,10,56,63,-23,89,-24,-65,-87,35,-99,49,8,76,-44,98,26,9,43,21,40,-7,80,12,70,74,80,-53,-73,12,-25,21,72,-70,-17,-52,-82,59,-67,83,-7,-66,31,51,61,37,48,-14,-55,-60,58,85,33,37,-53,-48,-40,-74,-51,-63,-12,24,58,-41,5,91,-42,-27,49,-9,-95,92,-24,36,-7,87,-77,91,-78,-82,82,80,54,-36,-33,-100,17,27,77,16,65,-35,-60,-28,24,-5,-37,82,18,62,-77,24,4,-1,-41};
        for (int i=0;i<val.length;i++){
            head=caller.createList(head, val[i]);
        }
        head=caller.reverseBetween(head,209,286);
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
     //System.out.println("in function");
    ListNode reverseBetween(ListNode head, int left, int right) {
        int count=0;
        ListNode leftNode=null,rightNode=null,curr=head,prevLeft=null,nextRight=null;
        while(curr!=null){
            count++;
            //System.out.println("in while"+count+"  "+right+"  "+left);
            if(count==left-1){prevLeft=curr;}
            if(count==left){leftNode=curr;}
            if(count==right){rightNode=curr;}
            if(count==right+1){nextRight=curr;break;}
            //System.out.println("in while"+curr.val);
            curr=curr.next;
        }
        System.out.println("out of while   "+prevLeft.val+ "    "+ nextRight.val+"    "+leftNode.val+"   "+rightNode.val);
        ListNode prev=nextRight,next=null;
        curr=leftNode;
        while((curr!=nextRight)){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
           // System.out.println(" in second while   "+prev.val+ "    "+ curr.val+"    "+next.val+"   "+i);
            
        }
        if(prevLeft==null){head=prev;}
        else{prevLeft.next=prev;}
        
        return head;
    } 
}