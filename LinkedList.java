
/**
 * The class for our linked list. No backwards capabilities. 
 * 
 * @author Bee
 */
public class LinkedList<T extends Comparable<T>> implements List<T>{
	
	Node<T> head=null;
	private int size=0;
	
	
	@SuppressWarnings({ })
	@Override
	public void append(T elem) {
		
		Node<T> newNode = new Node<T>();
		newNode.value=elem;
		newNode.next=null;
		
		Node<T> current = head;
		//checks if head is null
		if(head==null){
			head=newNode;
		}
		else{
			//navigate to end of list
			while(current.next != null){
				current=current.next;
			}
			current.next=newNode;
			
		}
		size++;
		
	}

	@Override
	public void prepend(T elem) {
		//creates new node and set its value/elem
		Node<T> newNode = new Node<T>();
		newNode.value=elem;
		
		Node<T> temp=head;
		newNode.next=temp;
		//new node is now first(the head)
		head=newNode;
		size++;
		
	}

	@Override
	public void add(int idx, T elem) throws IndexOutOfBoundsException {
		//creates current node to navigate
		Node<T> current=head;
		
		for(int i=0; i<idx;i++)
		{
			current=current.next;
		}
		//once at desired loc, current node/element is replaced with desired value
		current.value=elem;
		
	}

	@Override
	public T get(int idx) throws IndexOutOfBoundsException {
		//creates current node to navigate
		Node<T> current=head;
		int counter=0;
		
		while((current !=null)&&(counter<idx)){
			current=current.next;
			counter++;
		}
		//once loop ends, current should be at right loc
		return current.value;
	}

	@Override
	public void remove(int idx) throws IndexOutOfBoundsException {
		//creates current node to navigate to 1 position before idx
		Node<T> current = head;
		
		if(idx==0){
			head=head.next;
		}
		else{
		for(int i=0; i<idx-1;i++){
			current=current.next;
		}
		//current node's next is set to skip the deleted node
		current.next=current.next.next;
		}
		
		size--;
		
	}

	@Override
	public int search(T s, int lo, int hi) throws IndexOutOfBoundsException {
	
		int position=-1;
		//creates current node to navigate
		Node<T> current = head;
		
		if(current.value.compareTo(s)==0){
			return 0;
		}
		
		for(int i=0;i<hi;i++){
			current=current.next;
			if((i>lo)&&((current.value).compareTo(s)==0)){
				return position=i+1;
			}
		}
		//else return not found(-1)
		return position;
	
	}

	@Override
	public int size() {
		return size;
	}

}
