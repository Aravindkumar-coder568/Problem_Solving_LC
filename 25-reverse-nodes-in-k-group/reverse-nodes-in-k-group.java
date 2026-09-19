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
    // public void reverse(ListNode head,ListNode newHead){
    //     ListNode prev=null;
    //     ListNode curr=head;
    //     ListNode next1=null;
    //     while(curr!=null){
    //         next1=curr.next;
    //         curr.next=prev;
    //         prev=curr;
    //         curr=next1;
    //     }
    //     newHead.next=prev;
    // }
    public int len(ListNode head){
        int size=0;
        ListNode temp=head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        return size;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        if(k<=1) return head;
        // int size=0;
        // ListNode temp=head;
        // while(temp!=null){
        //     size++;
        //     temp=temp.next;
        // }
        int size=len(head);
        if(size<k) return head;
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode temp=head;
        ListNode previous=dummy;
        while(temp!=null){
            int n=len(temp);
            if(n<k){
                break;
            }
            ListNode prev=null;
            ListNode curr=temp;
            ListNode next1=null;
            for(int i=0;i<k;i++){
                next1=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next1;
            }
            previous.next=prev;
            temp.next=next1;
            previous=temp;
            temp=next1;
        }
        return dummy.next;
    }
}