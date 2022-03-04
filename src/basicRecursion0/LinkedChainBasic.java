package basicRecursion0;

import basicRecursion0.LinkedChainBasic.Node;

public class LinkedChainBasic {
	
	public class LinkedChain<T> {
	    private Node<T> firstNode;
	    private int numberOfEntries;

	    public LinkedChain() {
	        firstNode = null;
	        numberOfEntries = 0;
	    }// end default constructor


	    public int getNumberOfEntries() {
	        return numberOfEntries;
	    }



	    public void push(T newEntry) {
	        // TODO Auto-generated method stub
	        firstNode = new Node<T>(newEntry, firstNode);
	        numberOfEntries++;
	    }
	    
		/**
		 * get middle node
		 * @param <T>
		 * @return
		 */
		public Node<T> getMiddleNode() {
			   Node<T> slow = firstNode; 
			 Node<T> fast = firstNode;
			    int counter = 0;
			    while(fast.getNext() != null){
			        fast = fast.getNext();
			        if(counter%2 ==0){
			            slow = slow.getNext();
			        }
			        counter++;
			        
			    }
			    return slow; 
		}
	}
	
	public class Node<T> {
	     private T data; // Entry in bag
	     private Node<T> next; // Link to next node

	     public Node(T dataPortion) {
	         this(dataPortion, null);
	     } // end constructor


	     public Node(T dataPortion, Node<T> nextNode) {
	         data = dataPortion;
	         next = nextNode;
	     } // end constructor


	     public T getData() {
	         if (data != null) {
	             return data;
	         }
	         return null;
	     }


	     public Node getNext() {
	         return next;
	     }


	     public void setNext(Node<T> newNext) {
	         next = newNext;
	     }
	}
}
