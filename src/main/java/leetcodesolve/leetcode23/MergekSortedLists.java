package leetcodesolve.leetcode23;

import leetcodesolve.leetcode2.ListNode;

import java.util.List;
import java.util.PriorityQueue;

/**
 * @ClassName MergekSortedLists
 * @Description TODO
 * @Author lingxiangxiang
 * @Date 10:41 AM
 * @Version 1.0
 **/
public class MergekSortedLists {
    /**
        * @Description
        * @Date 10:47 AM 2019/2/2
        * @param:
        * @return:
     *
     *
     * l1: 2, 3, 4, 5
     * l2: 8, 10, 11    -> m
     *                              -> return
     * l3: 0, 9, 12
     * l4: 1, 99, 100   -> n
     *
    **/

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null && lists.length == 0) {
            return null;
        }
        return sort(lists, 0, lists.length - 1);
    }

    private ListNode sort(ListNode[] lists, int low, int high) {
        if (low >= high) {
            return lists[low];
        }
        int mid = (high - low) / 2 + low;
        ListNode l1 = sort(lists, low, mid);
        ListNode l2 = sort(lists, mid + 1, high);
        return merge(l1, l2);

    }

    private ListNode merge(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        if (l1.val < l2.val) {
            l1.next = merge(l2.next, l2);
            return l1;
        } else {
            l2.next = merge(l1, l2.next);
            return l2;
        }
    }

    public ListNode mergeKLists2(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }
        PriorityQueue<ListNode> queue = new PriorityQueue<>(lists.length, (a, b) -> a.val - b.val);
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        for (ListNode item : lists) {
            if (item != null) {
                queue.add(item);
            }
        }
        while (! queue.isEmpty()) {
            cur.next = queue.poll();
            cur = cur.next;
            if (cur.next != null) {
                queue.add(cur.next);
            }
        }
        return dummy.next;
    }

}
