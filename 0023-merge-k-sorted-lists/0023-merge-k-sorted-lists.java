
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        while (true) {
            int minIndex = -1;

     
            for (int i = 0; i < lists.length; i++) {
                if (lists[i] != null &&
                    (minIndex == -1 ||
                     lists[i].val < lists[minIndex].val)) {
                    minIndex = i;
                }
            }

            if (minIndex == -1) {
                break;
            }

            tail.next = lists[minIndex];
            tail = tail.next;

        
            lists[minIndex] = lists[minIndex].next;
        }

        return dummy.next;
    }
}