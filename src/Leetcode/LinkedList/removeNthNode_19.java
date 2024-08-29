/*
Remove Nth Node From End of List:
MEDIUM
Given the head of a linked list, remove the nth node from the end of the list and return its head.

Example 1:
Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]

Example 2:
Input: head = [1], n = 1
Output: []

Example 3:
Input: head = [1,2], n = 1
Output: [1]
*/

package Leetcode.LinkedList;

public class removeNthNode_19 {
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
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        int n = 2;
        ListNode result = removeNthElement(node1, n);
        printList(result);
    }

    public static ListNode removeNthElement(ListNode head, int n){
        if(head.next ==null){return null;}
        ListNode current = head;
        int size = 0;

        while(current!=null){
            current = current.next;
            size++;
        }

        if(n==size){
            return head.next;
        }

        int indexToSearch = size - n;
        ListNode previous = head;

        for (int i = 1; i < indexToSearch; i++) {
            previous = previous.next;
        }
        previous.next = previous.next.next;

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
