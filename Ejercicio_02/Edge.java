public class Edge<E> { //Lo que se encapsula en cada elemento de la lista enlazada
	//Atributos
	protected Vertex<E> refDest; //Contiene la referencia de nuestro destino, que es un vértice
	protected int weight; // - ponderado (parámetro) / no ponderado (-1)
	
	//Constructores
	public Edge (Vertex<E> refDest, int weight) {
		this.refDest = refDest;
		this.weight = weight;
	}

	public Edge (Vertex<E> refDest) {
		this(refDest, -1); 
	}
	
	//Metodos
	
	public boolean equals(Object o) {
		if(o instanceof Edge<?>) {
			Edge<E> e = (Edge<E>) o;
			return this.refDest.equals(e.refDest);
		}
		return false;
	}	
	
}
 