package secondcode;

public class UserStack<T> implements StackOperations<T> {
	private T[] stackData;
	private T top;
	private int index=-1;
	UserStack(){
		stackData= (T[]) new Object[10];
	}
	@Override
	public boolean push(T data) {
		stackData[++index]=data;
		top=data;
		return true;
	}

	@Override
	public T pop() {
		T data=stackData[index--];
		top=stackData[index];
		return data;
	}

	@Override
	public T top() {
		return top;
	}

	@Override
	public boolean empty() {
		return index==-1;
	}

}
