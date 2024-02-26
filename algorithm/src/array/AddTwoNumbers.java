package array;

import model.ListNode;

public class AddTwoNumbers {
    public static void main(String args[]) {

    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry =0;
        ListNode result = new ListNode();
        ListNode current = result;
        while(l1!=null || l2 !=null || carry!=0) {
            int val1 = 0, val2 =0;
            if(l1 != null)
                val1 = l1.val;
            if(l2 !=null) {
                val2 = l2.val;
            }

            int total = val1 + val2 + carry;
            carry = total/10;
            int digit = total % 10;

            if(l1!=null) {
                l1 = l1.next;
            }

            if(l2!=null) {
                l2 = l2.next;
            }

            current.next = new ListNode(digit);

            current = current.next;

        }
        return  result.next;
    }
}