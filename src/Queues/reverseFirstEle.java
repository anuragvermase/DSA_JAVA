/*
// Reverse first K element
Given a Queue, Reverse it's first K elements.

eg: 3 10 2 12 19 6 8 10 14
 k=4

So the final output will be : 12 2 10 3  19 6 8 10 14

//Idea 1:

step 1: push 'k' elements from queue to stack
step 2: put 'k' elements back from stack to queue
step 3: remove the first n-k elements from the 'front' and add at the 'end' of the queue

//Pseudo code

Queue<> reverseKElements (Queue<>q, int k){
Stack <Integer> s = new Stack<>();

for(int i=1; i<=k; i++){
int temp = q.remove();
s.push(temp);
}

for(int i=1; i<=k; i++){
int temp = s.pop();
q.add(temp);
}

for(int i=1; i<=n-k; i++){
int temp = q.remove();
q.add(temp);
}
}

TC : O(k)+O(k)+O(n-k) = O(n+k) =O(n)
SC : O(k)

*/
package Queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reverseFirstEle {
    public static void main(String[] args) {
        Queue <Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        int k = 3;
        System.out.println(reverseKEle(q, k));

    }

    public static Queue<Integer> reverseKEle (Queue<Integer> q ,int k){
        int n = q.size();
        Stack<Integer> st = new Stack<>();

        for (int i = k; i > 0 ; i--) {
            st.push(q.remove());
        }

        for (int i = st.size(); i > 0 ; i--) {
            q.add(st.pop());
        }

        for (int i = 0; i < n-k; i++) {
            q.add(q.remove());
        }

        return q;
    }
}
