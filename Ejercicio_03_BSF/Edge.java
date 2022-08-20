public class Edge<E> { //Lo que se encapsula en cada elemento de la lista enlazada

	//Atributos
	protected Vertex<E> refDest; //tiene la referencia de nuestro destino, que es un vértice
	protected int weight; //ponderado (parámetro), no ponderado (-1)
	protected int label; // 0 = inexplorado , 1 = discovery , 2 = Cross

	//Constructores
	public Edge(Vertex<E> refDest) {
		this(refDest, -1);
	}

	public Edge(Vertex<E> refDest, int weight) {
		this.refDest = refDest;
		this.weight = weight;
	}
}