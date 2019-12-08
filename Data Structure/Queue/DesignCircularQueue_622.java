/**
 * 
 * @author Shrinath Joshi 
 * date :- 8 December 2019
 *
 * https://leetcode.com/problems/design-circular-queue/
 * Difficulty:- Medium
 *
 *
 */


class MyCircularQueue {
    
    private int myQueue[];
    private int start=0;
    private int end=0;
    private int count=0;
    private int size;
    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
        myQueue=new int[k];
        this.size=k;
        start=k-1;
    }
    
    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        if(isFull())
            return false;
        else
        {
            count++;
            start = (start+1)%size;
            myQueue[start]=value;
            return true;
        }
    }
    
    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if(isEmpty())
            return false;
        else {
            count--;
            end=(end+1)%size;
            return true;
        }
    }
    
    /** Get the front item from the queue. */
    public int Front() {
        return count ==0?-1:myQueue[end];
    }
    
    /** Get the last item from the queue. */
    public int Rear() {
        return count ==0?-1:myQueue[start];
    }
    
    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        if(count == 0)
            return true;
        else
            return false;
    }
    
    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        if(count == size){
            return true;
        }
        return false;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */