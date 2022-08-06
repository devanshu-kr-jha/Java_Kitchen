package Stacks_Queues;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;

    public CustomStack() {
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }

    public Boolean push(int item ) throws StackException{
        if (isFull()){
            throw new StackException("Cannot insert as stack is already full!");
        }
        data[++ptr] = item;
        return true;
    }

    public int pop() throws StackException {
        if (isEmpty()){
            throw new StackException("Cannot pop from an  empty stack!");
        }
       /* int removed = data[ptr];
        ptr--;
        return removed; */
        return data[ptr--];
    }

    public int peek() throws StackException {
        if (isEmpty()){
            throw new StackException("Cannot peek from an empty stack!");
        }
        return data[ptr];
    }
    public Boolean isFull(){
        return ptr == data.length-1; //pointer is at the last index
    }

    public Boolean isEmpty(){
        return ptr == -1;
    }
}
