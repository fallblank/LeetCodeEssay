package fallblank;
import java.util.Stack;

/**
*通过递归函数逆置一个栈，不能使用其他数据结构
*/

public class ReverseStack{
	public static int getLastItem(Stack<Integer> stack){
		int result = stack.pop();
		if (stack.isEmpty()) {
			return result;
		}else{
			int last = getLastItem(stack);
			stack.push(result);
			return last;
		}
	}

	public static void reverse(Stack<Integer> stack){
		if (stack.isEmpty()) {
			return;
		}
		int last = getLastItem(stack);
		reverse(stack);
		stack.push(last);
	}

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0;i<10 ; i++) {
			stack.push(i);
		}

		reverse(stack);

		for (int i = 0;i<10 ; i++) {
			System.out.println(stack.pop());
		}


	}
}