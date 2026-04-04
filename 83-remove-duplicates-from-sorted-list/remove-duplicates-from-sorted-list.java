class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;

        // ListNode i = head;
        // ListNode j = head.next;

        // while (j != null) {
        //     if (i.val == j.val) {
        //         j = j.next;
        //     } else {
        //         i.next = j;
        //         i = j;
        //         j = j.next; 
        //     }
        // }

        // i.next = j; 
        // return head;

        // Cleaner Approach

        ListNode curr = head;

        while(curr != null && curr.next != null){
            if(curr.val == curr.next.val){
                curr.next = curr.next.next;
            }
            else{
                curr = curr.next;
            }
        }

        return head;
    }
}