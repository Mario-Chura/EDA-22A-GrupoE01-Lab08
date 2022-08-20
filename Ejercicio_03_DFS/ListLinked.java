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

	public T search(T data) { ////Recibe como argumento al elemento
		Node<T> nodo = this.first; //Nodo cabeza se mantiene fijo
		while(nodo != null && !nodo.data.equals(data))//Se va iterando mientras aun no encuentre el elemento
			nodo = nodo.next; //se realiza el movimiento
		if (nodo != null) //Cumple, cuando exista el elemento
			return nodo.data;//Retorna el dato del elemento buscado
		return null; //Retorna null, cuando termine de recorrer la lista
	}
	public void insertFirst(T data) { //Inserción al inicio de una lista
		System.out.println("pasó 1");
		this.first = new Node<T>(data, this.first);
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