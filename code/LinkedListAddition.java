class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}

public class LinkedListAddition {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        int carry = 0;
        
        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            
            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;
        }
        
        return dummyHead.next;
    }

   
    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val);
            if (node.next != null) {  
                System.out.print(" "); 
            }
            node = node.next;
        }
        System.out.println(); 
    }

    public static void main(String[] args) {
        LinkedListAddition solution = new LinkedListAddition();

        
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        System.out.print("Testcase 1:\n");
        printList(solution.addTwoNumbers(l1, l2));

        
        ListNode l3 = new ListNode(6);
        ListNode l4 = new ListNode(6);
        System.out.print("Testcase 2:\n");
        printList(solution.addTwoNumbers(l3, l4));

        
        ListNode l5 = new ListNode(9);
        l5.next = new ListNode(9);
        ListNode l6 = new ListNode(1);
        System.out.print("Testcase 3:\n");
        printList(solution.addTwoNumbers(l5, l6));

        
        ListNode l7 = new ListNode(9);
        l7.next = new ListNode(9);
        l7.next.next = new ListNode(9);
        ListNode l8 = new ListNode(1);
        System.out.print("Testcase 4:\n");
        printList(solution.addTwoNumbers(l7, l8));
    }
}
