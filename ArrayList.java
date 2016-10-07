/**
 * This is our array list class.
 * 
 * @author Bee
 */

public class ArrayList<T extends Comparable<T>> implements List<T> {

@SuppressWarnings("unchecked")
private T[] array = (T[]) new Comparable[0];

@Override
public void append(T elem) {

// create a temporary array
@SuppressWarnings("unchecked")
T[] tmp = (T[]) new Comparable[array.length + 1];

// copy elements from the original array into the temp array
for (int i = 0; i < array.length; i++) {
tmp[i] = array[i];
} // for

// add the element to the last position in the temp array
tmp[tmp.length - 1] = elem;

// replace the array with the temp array
array = tmp;

} // append

@Override
public void add(int idx, T elem) throws IndexOutOfBoundsException {
	array[idx]=elem;
} // add

@Override
public T get(int idx) throws IndexOutOfBoundsException {
	return array[idx];
} // get

@Override
public void prepend(T elem) {
	// create a temporary array
	@SuppressWarnings("unchecked")
	T[] tmp = (T[]) new Comparable[array.length + 1];

	// copy elements from the original array into the temp array
	for (int i = 1; i < array.length+1; i++) {
	tmp[i] = array[i-1];
	} // for

	// add the element to the first position in the temp array
	tmp[0] = elem;

	// replace the array with the temp array
	array = tmp;
} // prepend

@Override
public void remove(int idx) throws IndexOutOfBoundsException {
	// create a temporary array with 1 element less
		@SuppressWarnings("unchecked")
		T[] tmp = (T[]) new Comparable[array.length - 1];
		
		int tmpCounter=0;
		for(int i=0; i<array.length;i++){
			if (i!=idx){
				tmp[tmpCounter]=array[i];
				tmpCounter++;
			}
		}
		array=tmp;

} // remove

@Override
public int search(T s, int lo, int hi) throws IndexOutOfBoundsException {

	int position=-1;
	for(int i=lo; i<=hi;i++)
	{
		if (s.compareTo(array[i])==0){
			return position=i;
		}
	}
	
return position;
} // search

@Override
public int size() {
return array.length;
} // size

} // ArrayList