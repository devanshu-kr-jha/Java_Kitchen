package Stacks_Queues;

public class StackMain {
    public static void main(String[] args) throws StackException {
        //  CustomStack stack = new CustomStack(5);
        DynamicStack stack = new DynamicStack();
        stack.push(34);
        stack.push(45);
        stack.push(2);
        stack.push(9);
        stack.push(18);
        stack.push(6);  //will throw Exception as size is predetermined, DynamicStack solves this!

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        //  System.out.println(stack.pop()); //will throw an exception, empty stack

    }
}

