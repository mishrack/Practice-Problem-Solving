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
    public ListNode middleNode(ListNode head) 
    {
        ListNode slow = head ;
        ListNode fast = head ;
        
        // move fast node twice fast till it reaches last node or
        // it last node next becomes null
        
        while(fast != null && fast.next != null)
        {
            slow = slow.next ;
            fast = fast.next.next ;
        }
        
        return slow ;  // slow is having the middle node 
    }
}