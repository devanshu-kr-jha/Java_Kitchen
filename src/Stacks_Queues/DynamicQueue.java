package Stacks_Queues;

public class DynamicQueue extends CustomQueue {

    public DynamicQueue() {
        super();
    }

    public DynamicQueue(int size) {
        super(size);
    }

    @Override
    public Boolean insert(int item) throws Exception {
        if (isFull()){
            int[] temp = new int[data.length*2];
            for (int i = 0; i <data.length ; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }
        return super.insert(item);
    }
}
