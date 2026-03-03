/**
 * @author Thabang Mamoloko
 */

/**
 * This class checks the validity of the expression
 */
public class ExpressionChecker {
	private ArrayStack stack;
	private int capacity;
	/**
	 * Constructor
	 */
	public ExpressionChecker(int capacity) {
		this.capacity = capacity;
		stack = new ArrayStack(capacity);
	}
	/**
	 * A method to validate the expression
	 * @param expression
	 * @return
	 */
	public boolean checkExpression(String expression) {
		for(int i = 0; i < expression.length(); i++) {
			char ch = expression.charAt(i);
			
			if(ch == '(' || ch == '[' || ch == '{') {
				stack.push(ch);
			}
			
			if(ch == ')' || ch == ']' || ch == '}') {
				if(stack.isEmpty()) {
					return false;
				}
				
				char top = stack.pop();
				
				if(!isMatchingPair(top, ch)) {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}
	/**
	 * A method to check if a pair of char is matching
	 * @param top
	 * @param ch
	 * @return
	 */
	private boolean isMatchingPair(char open, char close) {
		// TODO Auto-generated method stub
		if(open == '(' && close == ')') {
			return true;
		}
		if(open == '[' && close == ']') {
			return true;
		}
		if(open == '{' && close == '}') {
			return true;
		}
		return false;
	}

	/**
	 * A getter method that returns stack
	 * @return the stack
	 */
	public ArrayStack getStack() {
		return stack;
	}
	
	/**
	 * A getter method that returns capacity
	 * @return the capacity of the stack
	 */
	public int getCapacity() {
		return capacity;
	}

}
