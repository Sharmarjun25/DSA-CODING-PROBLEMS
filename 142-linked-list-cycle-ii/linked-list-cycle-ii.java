/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        /*HashMap<ListNode , Integer> map = new HashMap<>();
        ListNode temp  = head;
        while(temp != null){
            if(map.containsKey(temp)){
                return temp;
            }
            map.put(temp , 1);
            temp = temp.next;
        }
        return null;*/
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast){
                slow = head;
                // = fast.next;
                //slow = slow.next;
                while(slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
               
            }
        }
        return null;
        
    }
}