package Stacks_Queues;

public class CircularQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    protected int end = 0;
    protected int front = 0;
    private int size = 0;

    public CircularQueue() {
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size){
        this.data = new int[size];
    }

    public Boolean isFull(){
        return size == data.length;
    }

    public Boolean isEmpty(){
        return size == 0;
    }

    public Boolean insert(int item) throws Exception{
        if (isFull()){
            throw new Exception("Queue is full!");
        }
        data[end++] = item;
        end = end % data.length;
        size++;
        return true;
    }

    public int remove() throws Exception{
        if (isEmpty()){
            throw new Exception("Cannot remove from an empty Queue!");
        }
        int removed = data[front];
        front %= data.length;
        front++;
        size--;
        return removed;
    }

    public int front() throws Exception{
        if (isEmpty()){
            throw new Exception("Queue is empty!");
        }
        return data[front];
    }

    public void display() throws Exception{
        if (isEmpty()){
            throw new Exception("Queue is empty!");
        }
        int i = front;
        do{
            System.out.print(data[i] + " -> ");
            i++;
            i %= data.length;
        } while(i != end);
        System.out.println("END");
    }

}
