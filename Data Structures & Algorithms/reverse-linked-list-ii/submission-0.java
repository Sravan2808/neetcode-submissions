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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        List<ListNode> list = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            list.add(temp);
            temp = temp.next;
        }
        left--;
        right--;
        while(left<right){
            ListNode node = list.get(left);
            list.set(left,list.get(right));
            list.set(right,node);
            left++;
            right--;
        }
        for(int i=0;i<list.size()-1;i++){
            list.get(i).next = list.get(i+1);
        }
        list.get(list.size()-1).next = null;
        return list.get(0);
    }
}