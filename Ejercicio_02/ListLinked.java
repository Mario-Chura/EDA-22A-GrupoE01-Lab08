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

	//Metodo search recibe un tipo data, retorna un tipo data
	public T search(T data) { //recibe como parametro el elemento
		Node<T> nodo = this.first; //nodo cabeza se mantiene fija
		while(nodo != null && !nodo.data.equals(data))//se va iterando mientras no se encuentre el elemento
			nodo = nodo.next;//se realiza el movimiento al sgte nodo
		if (nodo != null) //Al cumplirse, significa que el elemento existe
			return nodo.data;//por consiguiente se devuelve el dato del elemento que se busca
		return null; //cuando recorra toda la lista y no encuentre al elemento
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