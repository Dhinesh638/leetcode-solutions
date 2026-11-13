class MyCircularQueue {

    int[] arr;
    int front;
    int rear;
    int count;
    int k;

    public MyCircularQueue(int k) {

        this.k=k;
        arr=new int[k];
        rear=-1;
        count=0;
        front=0;

        
    }
    
    public boolean enQueue(int value) {

        if(isFull())
        {
            return false;
        }
        rear=(rear+1)%k;
        arr[rear]=value;
        count++;
        return true;
        
    }
    
    public boolean deQueue() {

        if(isEmpty())
        {
            return false;
        }
        front=(front+1)%k;
        count--;
        return true;
        
    }
    
    public int Front() {

        if(isEmpty())
        {
            return -1;
        }
        return arr[front];
        
    }
    
    public int Rear() {

        if(isEmpty())
        {
            return -1;
        }
        return arr[rear];
        
    }
    
    public boolean isEmpty() {

        return count==0;
        
    }
    
    public boolean isFull() {

        return count==k;
        
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