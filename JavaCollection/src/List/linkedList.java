package List;

import java.util.LinkedList;

public class linkedList {

	
	/*
	 * use add, addFirst, addLast, removeFirst,removeLast ( recommended use proper method in linkedList)
	 * 
	 */
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		LinkedList<Comparable<?>> ll = new LinkedList<Comparable<?>>();
		

		
		//1.) add new elements to list	
		ll.add("Kathan");
		ll.add(101);
		ll.add(1, "patel");
		ll.add("IT");
		ll.add("Texas");
		ll.add("Software Engineer");
		ll.add(true);
		ll.add(null);
		System.out.println("Original LinkedList:                  " +ll);
		
		
		//2.) total element size of list Object 
		System.out.println("Number of elements in Linked list:    " + ll.size());
		
		//3.) Remove
		ll.remove(7);
		ll.remove(null);
		System.out.println("After Removing some Elements:        " +ll);
		
		//4. insert new element anywhere in list Providing Via Index Number
		ll.add(6, "Java");                          
		System.out.println("Adding some elements in Linked list:    " + ll);
		
		ll.addFirst("USAA");
		System.out.println("Adding first index elements in LL:    " + ll);
		
		ll.addLast("PL3d512");
		System.out.println("Adding Last index elements in LL:    " + ll);
		
	
//		System.out.print("Adding Last index elements in LL:    ");
//		ll.clear();
		
		@SuppressWarnings("unchecked")
		LinkedList<Comparable<?>> ll1 = (LinkedList<Comparable<?>>) ll.clone();             // Cloning existing LinkedList in New LL1 
		System.out.println(ll);
		
		ll1.add(null);
		System.out.println(ll);
		
		ll.set(4, "KAthan");
		System.out.println(ll);
		
		System.out.println(ll.contains(null));
		
		
	}
}      



/*


//
//add(int index, E element)	            This method Inserts the specified element at the specified position in this list.
//add(E e)	   						    This method Appends the specified element to the end of this list.
//addAll(int index, Collection<E> c)	This method Inserts all of the elements in the specified collection into this list, starting at the specified position.
//addAll(Collection<E> c)	    		This method Appends all of the elements in the specified collection to the end of this list, in the order that they are returned by the specified collection’s iterator.
//addFirst(E e)							This method Inserts the specified element at the beginning of this list.
//addLast(E e)							This method Appends the specified element to the end of this list.
//clear()								This method removes all of the elements from this list.
//clone()								This method returns a shallow copy of this LinkedList.
//contains(Object o)					This method returns true if this list contains the specified element.
//descendingIterator()					This method returns an iterator over the elements in this deque in reverse sequential order.
//element()								This method retrieves but does not remove, the head (first element) of this list.
//get(int index)						This method returns the element at the specified position in this list.
//getFirst()							This method returns the first element in this list.
//getLast()								This method returns the last element in this list.
//indexOf(Object o)						This method returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.
//lastIndexOf(Object o)					This method returns the index of the last occurrence of the specified element in this list, or -1 if this list does not contain the element.
//listIterator(int index)				This method returns a list-iterator of the elements in this list (in proper sequence), starting at the specified position in the list.
//offer(E e)							This method Adds the specified element as the tail (last element) of this list.
//offerFirst(E e)						This method Inserts the specified element at the front of this list.
//offerLast(E e)						This method Inserts the specified element at the end of this list.
//peek()								This method retrieves but does not remove, the head (first element) of this list.
//peekFirst()							This method retrieves, but does not remove, the first element of this list, or returns null if this list is empty.
//peekLast()							This method retrieves, but does not remove, the last element of this list, or returns null if this list is empty.
//poll()								This method retrieves and removes the head (first element) of this list.
//pollFirst()							This method retrieves and removes the first element of this list, or returns null if this list is empty.
//pollLast()							This method retrieves and removes the last element of this list, or returns null if this list is empty.
//pop()									This method Pops an element from the stack represented by this list.
//push(E e)								This method pushes an element onto the stack represented by this list.
//remove()								This method retrieves and removes the head (first element) of this list.
//remove(int index)						This method removes the element at the specified position in this list.
//remove(Object o)						This method removes the first occurrence of the specified element from this list if it is present.
//removeFirst()							This method removes and returns the first element from this list.
//removeFirstOccurrence(Object o)		This method removes the first occurrence of the specified element in this list (when traversing the list from head to tail).
//removeLast()							This method removes and returns the last element from this list.
//removeLastOccurrence(Object o)		This method removes the last occurrence of the specified element in this list (when traversing the list from head to tail).
//set(int index, E element)				This method replaces the element at the specified position in this list with the specified element.
//size()								This method returns the number of elements in this list.
//spliterator()							This method creates a late-binding and fail-fast Spliterator over the elements in this list.
//toArray()								This method returns an array containing all of the elements in this list in proper sequence (from first to last element).
//toArray(T[] a)						This method returns an array containing all of the elements in this list in proper sequence (from first to last element); the runtime type of the returned array is that of the specified array.
//toString()							This method returns a string containing all of the elements in this list in proper sequence (from first to the last element), each element is separated by commas and the String is enclosed in square brackets.

*/