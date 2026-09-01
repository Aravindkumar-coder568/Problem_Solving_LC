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
    public static ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        ListNode next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public void reorderList(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;// slow is at the middle 
            fast=fast.next.next;
        }
        // split the LL
        ListNode secondHalf=slow.next;
        slow.next=null;
        // now reverse the second half
        ListNode revHalf=reverse(secondHalf);
        ListNode first=head;
        ListNode second=revHalf;

        while (second!=null) {
            ListNode firstNext=first.next;
            ListNode secondNext=second.next;

            first.next=second;
            second.next=firstNext;
            first=firstNext;
            second=secondNext;
        }
        // ListNode dummy=new ListNode(0);
        // while(curr!=null || rev_Half!=null){
        //     if(curr!=null){
        //         ListNode prev=curr;
        //         dummy.next=curr;
        //         curr=curr.next;
        //         prev.next=null;
        //     }
        //     if(rev_Half!=null){
        //         ListNode prev=rev_Half;
        //         dummy.next=rev_Half;
        //         rev_Half=rev_Half.next;
        //         prev.next=null;
        //     }
        // }
        // return dummy.next;
    }
}