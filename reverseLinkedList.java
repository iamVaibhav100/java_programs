package java_programs;

import java.util.Scanner;

public class reverseLinkedList {

    // Definition for singly-linked list with function to add elements
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
        public void add(int x) {
            ListNode newNode = new ListNode(x);
            ListNode current = this;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        reverseLinkedList r = new reverseLinkedList();
        System.out.println("Enter length of linked list: ");
        int n = sc.nextInt();
        System.out.println("Enter elements of linked list: ");
        ListNode head = new ListNode(sc.nextInt());
        for (int i = 1; i < n; i++) {
            head.add(sc.nextInt());
        }
        // print original list
        ListNode curr = head;
        System.out.print("Original List: ");
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        // reverse list
        System.out.println();
        System.out.print("Reverse List: ");
        ListNode result = r.reverseList(head);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
