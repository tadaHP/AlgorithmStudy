
import java.util.Stack;

public class AboutStack {


    public void runStack(){

    Stack<Integer> stack = new Stack<>();

        for(int i = 0 ; i < 10 ; i ++){
            stack.push(i); //stack 0~9 <- top
        }
        
        System.out.println("pop: "+stack.pop()); // get and remove it
        System.out.println("peek: "+stack.peek());// just watch last
        System.out.println("size: "+stack.size());// stack size
        System.out.println("contains(1): "+stack.contains(1));
        System.out.println("before empty: "+stack.empty());
        stack.clear();
        System.out.println("after empty: "+stack.empty());
    }
        
}
