import InterviewCourse.Level1.*;
import utils.ListNode;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ArrayList values = new ArrayList();
        for (int i=1; i<6; i++) {
            values.add(i);
        }
        ListNode listNode = ListNode.createListNode(values);
        ListNode.showAllElements(listNode);

        listNode = Problem206.reverseList(listNode);
        ListNode.showAllElements(listNode);
    }
}