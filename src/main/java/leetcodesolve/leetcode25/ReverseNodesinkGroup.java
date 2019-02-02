package leetcodesolve.leetcode25;

import leetcodesolve.leetcode2.ListNode;

/**
 * @ClassName ReverseNodesinkGroup
 * @Description TODO
 * @Author lingxiangxiang
 * @Date 3:31 PM
 * @Version 1.0
 **/
public class ReverseNodesinkGroup {


    /**
        * @Description
        * @Date 3:38 PM 2019/2/2
        * @param:
        * @return:
     *
     * * For example,
     *      Given this linked list: 1->2->3->4->5
     *
     *      For k = 2, you should return: 2->1->4->3->5
     *
     *      For k = 3, you should return: 3->2->1->4->5
     *
     *      2->1->4->3->5 k = 2
    **/

    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || head.next == null) {
            return null;
        }
        int count = 0;
        ListNode cur = head;
        while (cur != null && count != k) {
            cur = cur.next;
            count++;
        }
//        1 , 2, 3, 4, 5
//        head   cur
//        2 -> 1 -> 3
        if (count == k) {
            cur = reverseKGroup(cur, k);
            while (count-- > 0) {
                ListNode temp = head.next;
                head.next = cur;
                cur = head;
                head = temp;
            }
            head = cur;
        }
        return head;
    }


}
