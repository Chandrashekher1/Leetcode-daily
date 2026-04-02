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
    public ListNode middleNode(ListNode head) {
        // ListNode temp = head;
        // int len = 0;

        // while(temp != null){
        //     len++;
        //     temp = temp.next;
        // }

        // temp = head;
        // for(int i=0; i<len/2; i++){
        //     temp = temp.next;
        // }

        // return temp;

        // using slow and fast approach

        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}