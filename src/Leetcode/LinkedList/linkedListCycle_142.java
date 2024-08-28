package Leetcode.LinkedList;

public class linkedListCycle_142 {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static void main(String[] args) {

        // Test case for a linked list with a cycle
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(-4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = null; // Creates a cycle


        int cycleIndex = hasCycle(node1);
        if (cycleIndex != -1) {
            System.out.println("tail connects to node index " + cycleIndex);
        } else {
            System.out.println("no cycle");
        }
    }

    public static int hasCycle(ListNode head) {
//      if head is null
        if(head ==null){return -1;}

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                slow = head;
                int index = 0;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                    index++;
                }
                return index;
            }
        }
        return -1;
    }
}