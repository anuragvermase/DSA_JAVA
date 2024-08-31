/*
Reverse Linked List II
MEDIUM
Given the head of a singly linked list and two integers left and right where left <= right,
reverse the nodes of the list from position left to position right, and return the reversed list.

Example 1:
Input: head = [1,2,3,4,5], left = 2, right = 4
Output: [1,4,3,2,5]

Example 2:
Input: head = [5], left = 1, right = 1
Output: [5]

*/

package Leetcode.LinkedList;

public class reverseLinkedList2_92 {

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
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(-5);
        ListNode node5 = new ListNode(0);
        ListNode node6 = new ListNode(-9);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = null;

        int left = 3;
        int right =5;
        ListNode result = reverseBetween(node1, left, right);
        printList(result); // Should print true

    }

    public static ListNode reverseBetween(ListNode head, int left, int right){

        ListNode temp =head;

        ListNode dummy =new ListNode(0);
        dummy.next = temp;

        ListNode prevLeft = dummy;
        ListNode currNode = temp;
        for (int i = 1; i < left ; i++) {
            prevLeft = prevLeft.next;
            currNode = currNode.next;
        }
        ListNode subListNode = currNode;

        ListNode prevNode = null;
        for (int i = 0; i < right-left+1; i++) {
            ListNode currNodeP1 = currNode.next;
            currNode.next =prevNode;

            prevNode = currNode;
            currNode = currNodeP1;
        }

        prevLeft.next = prevNode;
        subListNode.next =currNode;

        return dummy.next;
    }




//    function to print link list
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
