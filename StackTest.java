package secondcode;

public class StackTest {
	public static void main(String[] args) {
		StackOperations<Integer> stack= new UserStack<>();
		System.out.println("stack empty: "+stack.empty());
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		
		System.out.println("Top element: "+stack.top());
		stack.pop();
		System.out.println("Top element: "+stack.top());
	}
}
