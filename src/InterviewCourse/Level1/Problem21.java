package InterviewCourse.Level1;

import utils.ListNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem21 {
    /*You are given the heads of two sorted linked lists list1 and list2.
Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.
Return the head of the merged linked list.*/

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        List<Integer> listOfValues = new ArrayList<>();
        ListNode currentNode = list1;

        do {
            listOfValues.add(currentNode.val);
            currentNode = currentNode.next;
        } while((currentNode != null));

        currentNode = list2;
        currentNode.next = list2.next;
        do {
            listOfValues.add(currentNode.val);
            currentNode = currentNode.next;
        } while((currentNode != null));

        Collections.sort(listOfValues);

        ListNode firstNode = new ListNode(listOfValues.get(0));
        firstNode.next = new ListNode(listOfValues.get(1));
        ListNode prevListNode = firstNode.next;

        for (int i=2; i<listOfValues.size(); i++) {
                prevListNode.next = new ListNode(listOfValues.get(i));
                prevListNode = prevListNode.next;
        }

        ListNode showNode = firstNode;

        do{
            System.out.println(showNode.val);
            showNode = showNode.next;
        } while (showNode != null);


        return firstNode;
    }

}