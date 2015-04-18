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

		if(this.isFull()) {
			//double size of the array and retain its contents
			Object[] tempArray = objects;
			objects = new Object[2*currentSize];
			for(int i = 0; i < currentSize; i++) {
				objects[i] = tempArray[i];
			}//endfor
		}//end if

		if(index == this.currentSize) { //put at end
			this.add(o);
		} else {
			//copy from given index into temp array
			Object[] tempArray = new Object[currentSize];
			for(int i = index; i < currentSize; i++) {
				tempArray[i] = objects[i];
			}

			objects[index] = o; //place object at given index

			//copy back from temp and shift right
			for(int i = index; i < currentSize; i++) {
				objects[i + 1] = tempArray[i]; 
			}

		}

		currentSize ++;

	}

	/** Clears all the objects from the list */
	public void clear() {
		currentSize = 0;
		objects = new Object[DEFAULT_CAPACITY];
	}

	/** Determines whether the list contains the given object
		@param o the object to look for
		@return true if the list contains the object, else false */
	public boolean contains(Object o) {
		boolean status = false;
		for(int i = 0; i < currentSize; i++) {
			if(objects[i].equals(o)){
				status = true;
				break;
			}
		}
		return status;
	}

	/** Retrieves the object from the given index
		@param index the integer index in the list of the object to retreive
		@return the object found at the given index */
	public Object get(int index) {
		if(index < currentSize) {
			return objects[index];
		} else {
			return null;
		}
	}
	/** Determines the first placement of the object in the list
		@param o the object to look for
		@return the integer index of the first occurrence of the object in the list */
	public int indexOf(Object o) {
		int index = -1;
		if(this.contains(o)) {
			for(int i = 0; i < currentSize; i++) {
				if(objects[i].equals(o)) {
					index = i;
					break;
				}
			}
		}
		return index;
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
		int index = -1;
		if(this.contains(o)) {
			for(int i = (currentSize - 1); i >= 0; i--) {
				if(objects[i].equals(o)) {
					index = i;
					break;
				}
			}
		}
		return index;
	}

	/** Removes the given object from the list
		@param o the object to remove from the list
		@return true if the removal was successfull, else false */
	public boolean remove(Object o) {
		boolean status = false;
		Object return_o;
		if(this.contains(o)) {
			status = true;
			int index = this.indexOf(o);
			return_o = objects[index];
			objects[index] = objects[currentSize - 1];
			objects[currentSize - 1] = null;
			currentSize --;
		}
		
		return status;
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
		Object return_o = null;
		if(index < currentSize) {
			return_o = objects[index];
			objects[index] = objects[currentSize - 1];
			objects[currentSize - 1] = null;
			currentSize --;
		}
		return return_o;
	}

	/** Sets the given object at the specified index while removing the
		existing item from its place
		@param o the object to set in the list
		@param index the integer index in the list to set the object 
		@return the object previously contained at the index */
	public Object set(int index, Object o) {
		Object return_o = null;
		if(index < currentSize) {
			return_o = objects[index];
			objects[index] = o;
		}
		return return_o;
	}

	private boolean isFull() {
		return (currentSize == objects.length);
	}

	public String toString() {
		return Arrays.toString(objects);
	}


}