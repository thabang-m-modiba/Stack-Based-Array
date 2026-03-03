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
	 * @param stack - Expression to be validated
	 */
	public ExpressionChecker(int capacity) {
		this.capacity = capacity;
		stack = new ArrayStack(capacity);
	}
	
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
	 * 
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
	 * @return the stack
	 */
	public ArrayStack getStack() {
		return stack;
	}
	
	/**
	 * @return
	 */
	public int getCapacity() {
		return capacity;
	}

}
