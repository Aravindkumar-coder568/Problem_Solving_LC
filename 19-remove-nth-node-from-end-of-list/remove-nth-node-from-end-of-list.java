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
    public static int length(ListNode head){
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        return count;
    }
    public static ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode current=head;
        ListNode next=null;
        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        //head=prev;
        return prev;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len=length(head);
        if(n==len) return head.next;
        int pos=len-n;
        ListNode temp=head;
        for(int i=1;temp!=null && i<pos;i++) {
            temp=temp.next;
        }
        if (temp==null|| temp.next==null) return head;
        temp.next = temp.next.next;
        //ListNode NH=reverse(head);
        // int count=0;
        // ListNode prev=null;
        // ListNode temp=NH;
        // while(temp!=null){
        //     count++;
        //     if(count%n==0){
        //         if(prev!=null){
        //             prev.next=temp.next;
        //         }else{
        //             NH=temp.next;
        //         }
        //     }else{
        //         prev=temp;
        //     }
        //     temp=temp.next;
        // }
        // ListNode NH2=reverse(NH);
        // temp.next=temp.next.next;
        //return NH2;

        return head;
    }
}