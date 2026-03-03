/**
 * @author Thabang Mamoloko
 */

/**
 * This class implements the operations for the array based stack
 */
public class ArrayStack implements IStack{
	private char[] data;
	private int top = -1;
	private int capacity;
	/**
	 * Constructor
	 * @param capacity
	 */
	public ArrayStack(int capacity) {
		this.capacity = capacity;
		data = new char[capacity];
	}

	@Override
	public void push(char elem) {
		// TODO Auto-generated method stub
		if(top == capacity - 1) {
			throw new IllegalStateException("Stack Overflow");
		}
		data[++top] = elem;
		
	}

	@Override
	public char pop() {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			throw new IllegalStateException("Stack is null");
		}
		return data[top--];
	}

	@Override
	public char peek() {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			throw new IllegalStateException("Stack is null");
		}
		return data[top];
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return top == -1;
	}

}
