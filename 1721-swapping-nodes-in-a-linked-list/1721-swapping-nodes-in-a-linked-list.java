class Solution {
    public ListNode swapNodes(ListNode head, int k) {
     List<ListNode> ls=new ArrayList<>();
        ListNode current=head;
        while(current!=null){
            ls.add(current);
            current=current.next;
        }
        int size=ls.size();
        int swap=size-k;
        int temp=ls.get(k-1).val;
        ls.get(k-1).val=ls.get(swap).val;
        ls.get(swap).val=temp;
        return head;
        
    }
}