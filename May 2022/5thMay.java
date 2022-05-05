//LeetCode 225. Implement Stack using Queues

class MyStack {

    private Queue<Integer> queue = new LinkedList<>();
    
    public void push(int x) {
        queue.add(x);
        int size = queue.size() - 1;
        while(size > 0){
            queue.add(queue.poll());
            size--;
        }
    }
    
    public int pop() {
        return queue.poll();
    }
    
    public int top() {
        return queue.peek();
    }
    
    public boolean empty() {
        return queue.isEmpty();
    }
}
