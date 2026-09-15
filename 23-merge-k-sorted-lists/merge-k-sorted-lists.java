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
    public static ListNode sort(ListNode head){
        for(ListNode i=head;i!=null;i=i.next){
            for(ListNode j=i.next;j!=null;j=j.next){
                if(i.val>j.val){
                    int temp=i.val;
                    i.val=j.val;
                    j.val=temp;
                }
            }
        }
        return head;
    }
    public ListNode mergeKLists(ListNode[] lists) {
        int n=lists.length;
        ListNode NN=new ListNode(0);
        ListNode temp=NN;
        for(int i=0;i<n;i++){
            temp.next=lists[i];
            while(temp.next!=null){
                temp=temp.next;
            }
        }
        ListNode head=NN.next;
        return sort(head);
    }
}