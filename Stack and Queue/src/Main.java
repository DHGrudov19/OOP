import java.util.ArrayDeque;

public class Main {


    public static void main(String[] args) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        stack.push(4);
        stack.push(3);
        stack.push(1);
        stack.push(6);
        stack.push(8);
        stack.offer(9);
        stack.add(1);
        System.out.println(stack);
        System.out.println(stack.peekLast());
        System.out.println(stack.poll());
        System.out.println(stack);

    }
}
