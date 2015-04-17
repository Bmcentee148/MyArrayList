/**
	This will simulate Java's ArrayList class via an array based 
	implementation
	@author Brian McEntee
	@version 1.0
*/

import java.util.Arrays;

public class MyArrayList {

	private static final int DEFAULT_CAPACITY = 16;
	private Object[] objects;
	private int currentSize;


	/**	Creates a new object with initial capacity of 16*/
	public MyArrayList() {
		objects = new Object[DEFAULT_CAPACITY];
		currentSize = 0;
	}

	/** Appends a new object to the end of the list
		@param o the object to be added to the list */
	public void add(Object o) {

		if(this.isFull()) {
			//double size of the array and retain its contents
			Object[] tempArray = objects;
			objects = new Object[2*currentSize];
			for(int i = 0; i < currentSize; i++) {
				objects[i] = tempArray[i];
			}//endfor
		}//end if

		objects[currentSize] = o;
		currentSize++;
	}

	/** Appends a new object to the list at the given index
		@param index the integer index in the list the object is placed 
		@param o the object to be placed in the list */
	public void add(int index, Object o) {
		//TODO
	}

	/** Clears all the objects from the list */
	public void clear() {
		//TODO
	}

	/** Determines whether the list contains the given object
		@param o the object to look for
		@return true if the list contains the object, else false */
	public boolean contains(Object o) {
		//TODO
		return false;
	}

	/** Retrieves the object from the given index
		@param index the integer index in the list of the object to retreive
		@return the object found at the given index */
	public Object get(int index) {
		//TODO
		return null;
	}
	/** Determines the first placement of the object in the list
		@param o the object to look for
		@return the integer index of the first occurrence of the object in the list */
	public int indexOf(Object o) {
		//TODO
		return -1;
	}

	/** Determines if the list is empty
		@return true if the list is empty, else false */
	public boolean isEmpty() {
		return (this.currentSize == 0);
	}

	/** Determines the last placement of the object in the list
		@param o the object to look for
		@return the integer index of the last occurrence of the object in the list */
	public int lastIndexOf(Object o) {
		//TODO
		return -1;
	}

	/** Removes the given object from the list
		@param o the object to remove from the list
		@return true if the removal was successfull, else false */
	public boolean remove(Object o) {
		//TODO
		return false;
	}

	/** Determines the current size of the list
		@return the integer number of objects in the list */
	public int size() {
		return currentSize;
	}

	/** Removes the object at the given index from the list
		@param index the integer index of the object to remove
		@return the object removed from the list */
	public Object remove(int index) {
		//TODO
		return null;
	}

	/** Sets the given object at the specified index while removing the
		existing item from its place
		@param o the object to set in the list
		@param index the integer index in the list to set the object 
		@return the object previously contained at the index */
	public Object set(int index, Object o) {
		//TODO
		return null;
	}

	private boolean isFull() {
		return (currentSize == objects.length);
	}

	public String toString() {
		return Arrays.toString(objects);
	}


}