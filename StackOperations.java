package secondcode;

interface StackOperations<T> {
	boolean push(T data);
	T pop();
	T top();
	boolean empty();
}
