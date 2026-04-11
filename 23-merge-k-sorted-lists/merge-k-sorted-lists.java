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
    private ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode i = list1;
        ListNode j = list2;
        ListNode dummy = new ListNode(-1);
        ListNode k = dummy;

        while(i != null && j != null){
            if(i.val <= j.val){
                k.next = i;
                i = i.next;
            }
            else{
                k.next = j;
                j = j.next;
            }
            k = k.next;
        }

        if(i==null) k.next = j;
        else{
            k.next = i;
        }
        return dummy.next;
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) return null;
        return mergeSort(lists, 0, lists.length - 1);
    }

    private ListNode mergeSort(ListNode[] lists, int left, int right) {
        if (left == right) return lists[left];

        int mid = (left + right) / 2;

        ListNode l1 = mergeSort(lists, left, mid);
        ListNode l2 = mergeSort(lists, mid + 1, right);

        return mergeTwoLists(l1, l2);
    }
}