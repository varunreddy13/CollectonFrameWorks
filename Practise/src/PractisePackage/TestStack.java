package PractisePackage;

import java.util.Iterator;
import java.util.Stack;

public class TestStack {
	
	public void testStack()
    {
        
        // Create an instance of Stack class
        Stack<Integer> objStack = new Stack<>();
                
        // Push the first three prime number
        objStack.push(2);
        objStack.push(3);
        objStack.push(5);
        System.out.println(objStack);
        System.out.println("Top element of the stack: " + objStack.peek());
        
        Iterator<Integer> objIterator = objStack.iterator();
        while(objIterator.hasNext())
        {
        	
        	System.out.print(objIterator.next()+" ");
        }
        System.out.println();
         
        
        // Pop the top element
        objStack.pop();
        
        System.out.println("Display after pop operation: "+objStack);
        //objStack.push(5);
        System.out.println("Top element of the stack: " + objStack.peek());
    }
	

}
