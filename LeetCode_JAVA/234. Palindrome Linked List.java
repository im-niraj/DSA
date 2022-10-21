/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        ListNode node = head;
        while(node!=null){
            list.add(node.val);
            node = node.next;
        }

        int leftP=0;
        int rightP=list.size()-1;
    
        while(leftP < rightP){
            if(list.get(leftP) == list.get(rightP)){
                leftP++;
                rightP--;
            }
            else{
                return false;
            }
        }
        return true;
        
    }
}
