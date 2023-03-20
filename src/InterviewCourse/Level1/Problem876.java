package InterviewCourse.Level1;

import utils.ListNode;

import java.util.ArrayList;
import java.util.List;

public class Problem876 {
    /*Given the head of a singly linked list, return the middle node of the linked list.
If there are two middle nodes, return the second middle node.*/

    public static ListNode middleNode(ListNode head) {
        int size = 0;
        ListNode currentNode = head;
        while (currentNode != null) {
            currentNode = currentNode.next;
            size ++;
        }

        ListNode middleNode;
        for (int i=0; i!=size/2; i++) {
            head = head.next;
        }

        return head;
    }

    public static ListNode middleNode2(ListNode head) {
        int size = 0;
        List<ListNode> listOfNodes = new ArrayList<>();
        while (head != null) {
            listOfNodes.add(head);
            size++;
            head = head.next;
        }

        return listOfNodes.get(size/2);
    }

    public static ListNode middleNodeBest(ListNode head){
        ListNode middle = head;
        ListNode current = head;
        int i = 0 ;

        while(current!=null){
            current = current.next;
            i++;
            if( i%2==0) middle = middle.next;
        }

        return middle;
    }
}
