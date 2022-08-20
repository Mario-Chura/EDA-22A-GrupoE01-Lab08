
 //Clase Nodo
public class Node<T> {
	//Atributos
	protected T data;
	protected Node<T> next;

	//Constructores
	public Node(T data) {
		this.data = data;
		this.next = null;
	}

	public Node(T data, Node<T> next) {
		this.data = data;
		this.next = next;

	}

	//Getters and Setters

	public T getData() {
		return this.data;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setData(T data) {
		this.data = data;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}
}