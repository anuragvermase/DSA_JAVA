package Leetcode.LinkedList;

public class merge2SortedList_21 {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }


    public static void main(String[] args) {
        System.out.println("Linked List");

        // Test case for a linked list cycle
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(12);
        ListNode node3 = new ListNode(20);
        ListNode node4 = new ListNode(34);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = null;

        ListNode node5 = new ListNode(1);
        ListNode node6 = new ListNode(2);
        ListNode node7 = new ListNode(9);
        ListNode node8 = new ListNode(14);

        node5.next = node6;
        node6.next = node7;
        node7.next = node8;
        node8.next = null;

        ListNode result = mergeSortedList(node1, node5);
        printList(result); // Should print true
    }

    public static ListNode mergeSortedList(ListNode list1, ListNode list2){
        ListNode t1 = list1;
        ListNode t2 = list2;

        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;

        while (t1 != null && t2 != null) {

            if (t1.val < t2.val) {
                temp.next = t1;
                temp = t1;
                t1 = t1.next;
            } else {
                temp.next = t2;
                temp = t2;
                t2 = t2.next;
            }

        }
        if (t1 != null) {
            temp.next = t1;
        } else {
            temp.next = t2;
        }

        return dummy.next;

    }

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println();
    }
}

