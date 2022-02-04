package PractisePackage;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class TestDeque {
	
	public void testArrayDeque() {
		
		Deque<Integer> objDeque = new ArrayDeque<>();
		 objDeque.add(1);
	       objDeque.add(2);
	       objDeque.add(3);
	       
	       System.out.println("The deque is: "+objDeque);
	       
	    // Remove the head of the Deque
	       objDeque.removeLast();
	       System.out.println("The size of deque: "+objDeque.size());
	       objDeque.addFirst(3);

	       
	       System.out.println("The deque is: "+objDeque);
	       System.out.println("The size of deque: "+objDeque.size());

	}

	
	public void testArrayDequeAdvanced()
    {  
		// Create an instance of ArrayDeque and view as a Deque
	       Deque<Integer> objDeque = new ArrayDeque<>();
	       // Adding object in the Deque
	       objDeque.offer(1);
	       objDeque.offer(2);
	       objDeque.offer(3);
	       
	       // Display the Deque
	       System.out.println("The deque is: "+objDeque);
	       
	       // Add an element at the head of the deque
	       objDeque.addFirst(4);
	       System.out.println("The deque is: "+objDeque);
	       System.out.println("The size of deque: "+objDeque.size());
	       System.out.println("The deque after adding at the head: "+objDeque.peekLast());
	       System.out.println("The deque after adding at the head: "+objDeque.peekFirst());

	       System.out.println("The deque after adding at the head: "+objDeque.element());
	       
	       objDeque.push(6);
	       objDeque.offer(30);
	       objDeque.push(61);


	       System.out.println("The head getf element: "+ objDeque.getFirst());
	       System.out.println("The head getl element: "+ objDeque.peekFirst());
	       // Add an element in the stack, that is, added at the front
	       System.out.println("The deque after push: "+objDeque);
	       System.out.println("The deque after push: "+objDeque.contains(66));
	       
	       Iterator<Integer> it =  objDeque.iterator();
	       
	       while(it.hasNext()) {
	    	   
	    	   System.out.println("Forward"+it.next());
	       }
	       
//	       while(it.hasPrevious()) {
//	    	   
//	       }

	       
    
    }
}
