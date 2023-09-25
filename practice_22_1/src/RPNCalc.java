import java.util.*;

public class RPNCalc {
    private static final Stack<Integer> stack = new Stack<>();
    private static final Scanner input = new Scanner(System.in);


    public static void calculator() {

        System.out.println("Welcome to the RPN Calculator program!");

        takeInput();
    }

    private static void takeInput() {
        String numOrOperand = " ";
        while (!numOrOperand.equals("x")) {
            System.out.println("Enter next input: ");
            numOrOperand = input.next();
            try {
                int intNumOrOperand = Integer.parseInt(numOrOperand);
                stack.push(intNumOrOperand);
            } catch (Exception e) {
                switch (numOrOperand) {
                    case "*" -> stack.push(stack.pop() * stack.pop());
                    case "/" -> stack.push((int) stack.pop() / stack.pop());
                    case "+" -> stack.push(stack.pop() + stack.pop());
                    case "-" -> stack.push(stack.pop() - stack.pop());
                    case "=" -> System.out.println(stack.pop());
                    case "c" -> {
                        if (!stack.empty()) {
                            for (int i = 0; i < stack.size(); i++) {
                                stack.pop();
                            }
                        }
                    }
                    case "w" -> {
                        for (Integer integer : stack) {
                            System.out.println(integer);
                        }
                    }
                }
            }

        }
    }


    public static void main(String[] args) {
        try {
            calculator();
        } catch (Exception e) {
            System.out.println("Oops, that doesn't work... ");
        }

    }
}