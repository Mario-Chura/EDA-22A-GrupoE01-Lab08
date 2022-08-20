public class ListLinked<T> {
	//Atributo
	protected Node<T> first;

	// Constructor
	public ListLinked () {
		this.first = null;
	}

	//Metodos

	public boolean isEmpty() {
		return this.first == null;	
	}
	
}