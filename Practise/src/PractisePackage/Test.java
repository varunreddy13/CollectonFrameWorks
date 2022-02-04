package PractisePackage;

public class Test {
	
	public static void testQueue() {
		
		TestQueue objTestQueue = new TestQueue();
		//objTestQueue.testPriorityQueue();
		objTestQueue.testPriorityQueueAdvanced();
	}
	
	public static void testDeque() {
		
		TestDeque objTestDeque = new TestDeque();
		//objTestDeque.testArrayDeque();
		objTestDeque.testArrayDequeAdvanced();
	}
	
	public static void testStack() {
		
		TestStack ts = new TestStack();
		ts.testStack();
	}
	
	public static void testList() {
		
		TestList tl = new TestList();
		tl.testArrayList();
	}

}
