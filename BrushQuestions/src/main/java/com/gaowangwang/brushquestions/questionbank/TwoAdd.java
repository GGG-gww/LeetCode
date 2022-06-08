package com.gaowangwang.brushquestions.questionbank;

import java.util.Arrays;

/**
 * 两数相加
 *
 * @author 无敌小南瓜
 */
public class TwoAdd {

    private static Integer[] towAdd1(Integer[] param1, Integer[] param2) {
        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();
        for (Integer integer : param1) {
            a.append(integer);
        }
        for (Integer integer : param2) {
            b.append(integer);
        }
        Integer int1 = Integer.valueOf(String.valueOf(a.reverse()));
        Integer int2 = Integer.valueOf(String.valueOf(b.reverse()));
        int result = int1 + int2;
        String[] split = String.valueOf(result).split("");
        Integer[] integers = new Integer[split.length];
        for (int i = 0; i < split.length; i++) {
            integers[i] = Integer.valueOf(split[i]);
        }
        return integers;
    }

    public static void main(String[] args) {
        Integer[] param1 = new Integer[]{2, 4, 3};
        Integer[] param2 = new Integer[]{5, 6, 4};
        Integer[] integers = towAdd1(param1, param2);
        System.out.println("integer = " + Arrays.toString(integers));
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null, tail = null;
        int add = 0;
        while (l1 != null || l2 != null) {
            int a = l1 == null ? 0 : l1.val;
            int b = l2 == null ? 0 : l2.val;
            add = a + b + add;
            if (head == null){
                head = tail = new ListNode(add % 10);
            }else {
                tail.next = new ListNode(add % 10);
                tail = tail.next;
            }
            add = add / 10;
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
        }
        if (add > 0 ){
            tail.next = new ListNode(add);
        }
        return head;
    }
}
