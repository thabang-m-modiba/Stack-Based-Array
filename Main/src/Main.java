/**
 * @author Thabang Mamoloko
 */
import java.util.Scanner;
/**
 * The main method
 */
public class Main {

	/**
	 * The main method
	 * @param args command line arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Expression: ");
        String expression = scanner.next();
        
        ExpressionChecker ec = new ExpressionChecker(expression.length());
        
        if(ec.checkExpression(expression)) {
        	System.out.println("Expression is Valid");
        }else {
        	System.out.println("Expression is invalid");
        }
        
        scanner.close();
	}

}
