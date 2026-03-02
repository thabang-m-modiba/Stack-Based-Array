# Stack-Based-Array
# Stack ADT
* Stack ADT is a linear data structure that follows the principle LIFO (Last In, First Out).
  * This means that the first element inserted is the last to be removed.
  * Last element added is the first to be removed.
* Main Stack Operation:
  * <code>push() // inserts an element</code>
  * <code>Oject push() // removes and returns the last inserted element</code>
* Auxiliary Stack operstions:
  * <code>Object top() // returns the last inserted element without removing it</code>
  * <code>Integer size() // returns the number of elements stored</code>
  * <code>boolean isEmpty() // indicates whether no elements are stored</code>

# Mini Project: Expression Checker Using Array-Based Stack
## Project Title: Balanced Parentheses and Expression Validator
* Create a Java program that uses a stack implemented with an array to check whether an expression has:
  * Balanced parentheses ()
  * Balanced brackets []
  * Balanced braces {}
* Example:
  * <code>(a+b)</code> is valid
  * <code>{[a+b]*(c-d)}</code> is valid
  * <code>(a+b]</code> is invalid
  * <code>((a+b)</code> is invalid
 
* Algorithm guidline:
  * Scan expression from left to right
  * If opening bracket -> push to stack
  * If closing bracket:
    * If stack is empty -> invalid
    * pop and check if matching pair
  * After scanning:
    * If stack empty -> valid
    * Otherwise -> invalid
