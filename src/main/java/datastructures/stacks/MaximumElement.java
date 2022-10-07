package datastructures.stacks;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MaximumElement {

    // Solution
    public static List<Integer> getMax(List<String> operations) {
        List<Integer> answer = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> additionalStack = new Stack<>();
        for (String operation : operations) {
            if(operation.charAt(0) == '1'){
                int toAdd = Integer.parseInt(operation.substring(2));
                stack.push(toAdd);
                if(additionalStack.isEmpty()){
                    additionalStack.push(toAdd);
                    continue;
                }
                if(toAdd > additionalStack.peek()){
                    additionalStack.push(toAdd);
                } else {
                    additionalStack.push(additionalStack.peek());
                }

            }
            if(operation.charAt(0) == '2'){
                stack.pop();
                additionalStack.pop();
            }
            if(operation.charAt(0) == '3'){
                answer.add(additionalStack.peek());
            }
        }
        return answer;
    }

}
