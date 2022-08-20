public class Vertex<E>{
	//Atributos
	protected E data; //contiene un dato (una información)
	protected ListLinked<Edge<E>> listAdj; //lista de adyacencia de cada vértice, es otra lista enlazada, que guarda tipos arista
	
	//Constructor
	public Vertex(E data) { //cada vez que creo un vèrtice le mando un dato
		this.data = data;
		listAdj = new ListLinked<Edge<E>>();//creo la lista de adyacencia vacía, como para poder insertar aristas
	}

	//Metodos
	public boolean equals(Object o) {
		if( o instanceof Vertex<?>) {
			Vertex<E> v = (Vertex<E>)o;
			return this.data.equals(v.data);
		}
		return false;
	}
	
}