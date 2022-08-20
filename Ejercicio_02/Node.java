public class Node<T> {
	protected T data; 
	protected Node<T> next; //puntero o referencia
	
    //Constructor
	public Node (T data) {
		this.data = data;
		this.next = null;
	}
	public Node (T data, Node<T> next) {
		this.data = data;
		this.next = next;
		
	}
    //Getters
	public T getData() {
		return this.data;
	}
	public Node<T> getNext() {
		return next;
	}

    //Setters
	public void setData(T data) {
		this.data = data;
	}
	public void setNext(Node<T> next) {
		this.next = next;
	}
}
