public class ListLinked<T> {
	//Atributo
	protected Node<T> first;

	// Constructor
	public ListLinked () {
		this.first = null;
	}

	//Metodos

	//Metodo Booleano que define la existencia del grafo
	public boolean isEmpty() {
		return this.first == null;	
	}

	//Para mostrar la informacion del Grafo
	public String toString() {
		String r = "";
		Node<T> aux = this.first;
			while(aux != null) { //Mientras existan los nodos
				r = r + aux.data; //la informacion se va concatenando 
				aux = aux.next; //aux toma el valor del sgte Nodo
			}
			return r; 
	}
}