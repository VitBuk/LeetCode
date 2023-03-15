package InterviewCourse.Level1;

import utils.ListNode;

public class Problem206 {
    /*Given the head of a singly linked list, reverse the list, and return the reversed list.*/

    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode prevNode = head;
        ListNode currentNode = head.next;
        ListNode nextNode;
        prevNode.next = null;

        do{
            nextNode = currentNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = nextNode;
        } while (nextNode != null);

        return prevNode;
    }
}

