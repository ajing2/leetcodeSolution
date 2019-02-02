package leetcodesolve.leetcode24;

import leetcodesolve.leetcode2.ListNode;

/**
 * @ClassName SwapNodesinPairs
 * @Description TODO
 * @Author lingxiangxiang
 * @Date 2:25 PM
 * @Version 1.0
 **/
public class SwapNodesinPairs {


    /**
        * @Description
        * @Date 2:28 PM 2019/2/2
        * @param:
        * @return:
     *
     * 1 -> 2 -> 3 ->4
     * 2 -> 1 -> 4 -> 3
     *
    **/

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode l1 = dummy;
        ListNode l2 = head;
        while (l2 != null && l2.next != null) {
            ListNode nextStart = l2.next.next;
            l1.next = l2.next;
            l2.next.next = l2;
            l2.next = nextStart;
            l1 = l2;
            l2 = l2.next;
        }
        return dummy.next;
    }
}
