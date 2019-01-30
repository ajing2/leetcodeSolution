package leetcodesolve.leetcode21;

import leetcodesolve.leetcode2.ListNode;

/**
 * @ClassName MergeTwoSortedLists
 * @Description TODO
 * @Author lingxiangxiang
 * @Date 9:20 AM
 * @Version 1.0
 **/
public class MergeTwoSortedLists {

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                cur.next = new ListNode(l1.val);
                l1 = l1.next;
            } else {
                cur.next = new ListNode(l2.val);
                l2 = l2.next;
            }
            cur = cur.next;
        }
//        while (l1 != null) {
//            cur.next = new ListNode(l1.val);
//            l1 = l1.next;
//            cur = cur.next;
//        }
//        while (l2 != null) {
//            cur.next = new ListNode(l2.val);
//            l2 = l2.next;
//            cur = cur.next;
//        }
//        以上两种方法都可以了

        if (l1 == null) {
            cur.next = l2;
        } else {
            cur.next = l1;
        }

        return dummy.next;
    }




    public static ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        if (l1.val < l2.val) {
            l1.next = mergeTwoLists2(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists2(l1, l2.next);
            return l2;
        }
    }
}
