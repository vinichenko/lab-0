/**
 * Created with IntelliJ IDEA.
 * User: Dima
 * Date: 07.09.13
 * Time: 17:10
 * To change this template use File | Settings | File Templates.
 */

public class MyStack {
    private double[] stackArray;
    private final int size = 5;
    private int index;

    MyStack() {
        index = 0;
        stackArray = new double[size];
    }

    public void push(double value) {
        try {
            stackArray[index] = value;
            System.out.println("Value " + value + " has been added.");
            index++;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Stack overflow!");
        }
    }

    public double pop() {
        try {
            index--;
            return stackArray[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Stack is empty!");
            index++;
            return -1;
        }
    }
}
