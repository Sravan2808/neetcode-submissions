/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public void reorderList(ListNode head) {
        List<ListNode> list = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            list.add(temp);
            temp = temp.next;
        }
        List<ListNode> order = new ArrayList<>();
        int left = 0;
        int right = list.size()-1;
        while(left<right){
            order.add(list.get(left));
            order.add(list.get(right));
            left++;
            right--;
        }

        if(left==right) order.add(list.get(left));

         temp = order.get(0);
        
        for(int i=1;i<order.size();i++){
            temp.next=order.get(i);
            temp = temp.next;
        }
        temp.next = null;

    }
}
