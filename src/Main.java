import InterviewCourse.Level1.*;
import utils.ListNode;

public class Main {
    public static void main(String[] args) {

        ListNode list1 = new ListNode();
        ListNode list12 = new ListNode();
        ListNode list13 = new ListNode();

        list1.val= 1;
        list12.val=2;
        list13.val=4;
        list1.next = list12;
        list12.next = list13;

        ListNode list2 = new ListNode();
        ListNode list22 = new ListNode();
        ListNode list23 = new ListNode();

        list2.val= 1;
        list22.val=3;
        list23.val=4;
        list2.next = list22;
        list22.next = list23;

        Problem21.mergeTwoLists(list1, list2);


    }
}