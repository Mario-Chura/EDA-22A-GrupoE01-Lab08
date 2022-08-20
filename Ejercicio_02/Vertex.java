public class Vertex<E>{
	//Atributos
	protected E data; //Contiene un dato (una información)
	protected ListLinked<Edge<E>> listAdj; //Lista de adyacencia de cada vértice, es otra lista enlazada, que guarda tipos arista
	
	//Constructor
	public Vertex(E data) { //Cada vez que se crea un vertice se le envia un dato
		this.data = data;
		listAdj = new ListLinked<Edge<E>>();//crea la lista de adyacencia vacía, para poder insertar aristas
	}

	//Metodos
	public boolean equals(Object o) {
		if( o instanceof Vertex<?>) {
			Vertex<E> v = (Vertex<E>)o;
			return this.data.equals(v.data);
		}
		return false;
	}

	public String toString() {
		return this.data + " --> " + this.listAdj.toString()+ "\n"; //tiene un dato y una lista enlazada
	}
}