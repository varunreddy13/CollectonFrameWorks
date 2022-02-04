package PractisePackage;

import java.util.PriorityQueue;
import java.util.Queue;

public class TestQueue {
	

public void testPriorityQueue() {
		
		Queue<Integer> objQueue  =new  PriorityQueue<>();
		    objQueue.add(12);
		    objQueue.add(23);
	       objQueue.add(43);
	       
	       // Display the Queue
	       System.out.println("Priority queue is: "+objQueue);
	        
	       // Access the head element of the queue
	       System.out.println("The head element is: "+objQueue.element());
	       // Removal of an element
	       objQueue.remove();   //remove delete the head of the element       
	       
	       //Display the Queue
	       System.out.println("The queue after the removal "
	       						+ "of head element: "+objQueue);
	       
	       if(objQueue.isEmpty()) {
	    	   System.out.println("yes");
	       }
	       else {
	    	   System.out.println("NO");
	       }
	       
	       
	       

}


public void testPriorityQueueAdvanced()
{  
	 // Create an instance of PriorityQueue and view as a queue
    Queue<Integer> objQueue = new PriorityQueue<>();
    // Adding object in the Queue
    objQueue.offer(1);
    objQueue.offer(2);
    objQueue.offer(3);
    
    System.out.println("The queue is: "+objQueue);
    
    // Access the head element of the Queue and throw exception if empty
    System.out.println("Head of the queue is: "+objQueue.element());
    

    // Add an element if there is space in the queue
    objQueue.offer(4);
    // Access the head of the element and returns null if empty
    System.out.println("Head of the queue peek is: "+objQueue.peek());
    System.out.println("The queue is: "+ objQueue);
    // Access the head of the element and returns null if empty
    System.out.println("Head of the queue poll is: "+objQueue.poll());
    System.out.println("The queue is: "+ objQueue);
    System.out.println("The remove queue is: "+ objQueue.remove());
    System.out.println("The queue is: "+ objQueue);
    
}
}
