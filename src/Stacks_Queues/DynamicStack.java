package Stacks_Queues;

public class DynamicStack extends CustomStack {

    public DynamicStack() {
        super(); // this will call CustomStack()
    }
    public DynamicStack(int size){
        super(); // this will call CustomStack(int size)
    }

    @Override
    public Boolean push(int item) throws StackException {
        if (isFull()){
            //double the array size
            int[] temp = new int[data.length*2];

            //copy all previous items to new array
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }

            data = temp;
        }
        //at this point array is not full
        //inset normally
        return super.push(item);
    }
}


