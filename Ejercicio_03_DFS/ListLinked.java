public class ListLinked<T> {
	//Atributos
	protected Node<T> first;

	//Constructor
	public ListLinked() {
		this.first = null;
	}

	//Metodos
	public boolean isEmpty() {
		return this.first == null;
	}
	public String toString() {
		String r = "";
		Node<T> aux = this.first;
			while(aux != null) {
				r = r + aux.data; //voy concatenando la información
				aux = aux.next;
			}
			return r; 
	}
}