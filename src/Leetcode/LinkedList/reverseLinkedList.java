package Leetcode.LinkedList;

public class reverseLinkedList {
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
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(-4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = null; // Creates a cycle

        ListNode result = reverse(node1);
        printList(result);

    }

    public static ListNode reverse(ListNode head){

        ListNode temp = head;

        ListNode prev = null;
        ListNode curr = temp;

        while(curr!=null){
            ListNode currP1 = curr.next;
            curr.next = prev ;

            prev = curr;
            curr = currP1;
        }
        head = prev;
        return head;
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
