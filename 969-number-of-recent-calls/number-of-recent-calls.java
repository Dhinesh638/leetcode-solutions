class RecentCounter {

    Deque<Integer> arr;

    public RecentCounter() {
        arr=new ArrayDeque<>();
        
    }
    
    public int ping(int t) {
        arr.addLast(t);
        
        while(!arr.isEmpty() && arr.peekFirst() < t-3000)
        {
            arr.removeFirst();
        }
        return arr.size();
        
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */