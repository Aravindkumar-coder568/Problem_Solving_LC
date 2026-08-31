/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                ListNode ind1=head;
                ListNode ind2=slow;
                while(ind1!=ind2){
                    ind1=ind1.next;
                    ind2=ind2.next;
                }
                return ind1;
            }

        }
        return null;
    }
}