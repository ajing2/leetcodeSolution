package leetcodesolve.leetcode19;

import leetcodesolve.leetcode2.ListNode;

import java.util.List;

/**
 * @ClassName RemoveNthNodeFromEndofList
 * @Description TODO
 * @Author lingxiangxiang
 * @Date 3:43 PM
 * @Version 1.0
 **/
public class RemoveNthNodeFromEndofList {

    /**
        * @Description
        * @Date 4:09 PM 2019/1/29
        * @param:
        * @return:
     *
     * *  Given linked list: 1->2->3->4->5, and n = 2.
     *
     *      After removing the second node from the end, the linked list becomes 1->2->3->5.
     *
     *      time : O(n)
     *      space : O(1)
    **/


    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        ListNode slow = dummy;
        ListNode fast = dummy;
        dummy.next = head;
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

    }

}
