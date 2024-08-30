/*
Palindrome Linked List:
EASY :
Given the head of a singly linked list, return true if it is a
palindrome
or false otherwise.

Example 1:
Input: head = [1,2,2,1]
Output: true

Example 2:
Input: head = [1,2]
Output: false

*/
package Leetcode.LinkedList;

public class reverseLinkedList_206 {
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
        ListNode node4 = new ListNode(1);
        ListNode node5 = new ListNode(2);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = null; // Creates a cycle

        boolean result = palindrome(node1);
        System.out.println(result); // Should print true

    }

    public static boolean palindrome(ListNode head){

        ListNode temp = head;

        if(head==null || head.next==null) {return true;}

        ListNode midNode = findMid(temp);
        ListNode secondHalfStart = reverse(midNode.next);

        ListNode firstHalfStart = head;
        while(secondHalfStart != null){
            if(secondHalfStart.val != firstHalfStart.val){
               return false;
            }
            firstHalfStart = firstHalfStart.next;
            secondHalfStart = secondHalfStart.next;

        }
        return true;

    }

    public static ListNode findMid(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public  static ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;

        while(curr!=null){
            ListNode currp1 = curr.next;
            curr.next = prev;

            prev = curr;
            curr = currp1;
        }
        head = prev;
        return head;

    }
}
