/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/
class Solution {
    public Node copyRandomList(Node head) {
        
        // TC- O(n) and SC - O(1)
        
        if(head == null) return null;
        
        Node curr = head;
        while(curr != null){
            
            Node randomNode = new Node(curr.val);
            randomNode.next=curr.next;
            curr.next=randomNode;
            curr=randomNode.next;
            
        }
        
        curr = head;
        while(curr != null){
            
            if(curr.random != null)
                curr.next.random = curr.random.next;
            curr=curr.next.next;
        }
        
        curr = head;
        Node dummyList = new Node(0);
        Node cloneList = dummyList;
        Node next=null;
        Node copy =null;
        
        while(curr != null){
            
            next = curr.next.next;
            copy = curr.next;
            
            cloneList.next= copy;
            cloneList = copy;
            
            curr.next = next;
            curr = next;            
        }
        
        return dummyList.next;
    }
}