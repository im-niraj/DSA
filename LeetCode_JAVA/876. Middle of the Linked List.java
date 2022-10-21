// Approch 1 using slow and fast technique
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head;
        while(fast !=null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}



// Approch 2 by finding length of the nodes and traverse over half of the length

class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode node = head;
        int len=0;
        while(node!=null){
            len++;
            node=node.next;
        }
        for(int i=0; i<len/2; i++)head=head.next;
        
        return head;
    }
}
