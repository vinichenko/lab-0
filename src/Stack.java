/**
 * Created with IntelliJ IDEA.
 * User: Dima
 * Date: 07.09.13
 * Time: 17:51
 * To change this template use File | Settings | File Templates.
 */

public class Stack {
    public static void main(String[] args) {
        MyStack stack = new MyStack();

        stack.pop();

        for (int i = 0; i < 6; i++) {
            stack.push(i + 1);
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(stack.pop());
        }
    }
}
