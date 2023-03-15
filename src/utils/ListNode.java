package utils;

import java.util.ArrayList;
import java.util.Random;

public class ListNode {
    public int val;
    public ListNode next;
    public ListNode() {}
    public ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public static ListNode generateListNode(int size) {
        if (size < 1) return null;

        Random random = new Random();
        ListNode head = new ListNode();
        ListNode currentNode = head;
        for (int i=0; i<size; i++) {
            if (i==0)
                head.val = random.nextInt(100);
            else {
                ListNode listnode = new ListNode(random.nextInt(100));
                currentNode.next = listnode;
                currentNode = listnode;
            }
        }

        return head;
    }

    public static ListNode createListNode(ArrayList<Integer> values) {
        ListNode head = new ListNode();
        ListNode currentNode = head;
        for (int i=0; i<values.size(); i++) {
            if (i==0)
                head.val = values.get(i);
            else {
                ListNode listnode = new ListNode(values.get(i));
                currentNode.next = listnode;
                currentNode = listnode;
            }
        }

        return head;
    }

    public static void showAllElements(ListNode listNode) {
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}

