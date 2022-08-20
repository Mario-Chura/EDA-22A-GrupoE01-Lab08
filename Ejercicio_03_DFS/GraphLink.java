public class GraphLink<E> {
	//Atributo
	protected ListLinked<Vertex<E>> listVertex;

	//Constructor
	public GraphLink() { //Crea una lista vacía 	
		listVertex = new ListLinked<Vertex<E>>();//Se declara una lista vacìa de aristas
	}

	//Metodos
	public void insertVertex(E data) {
		Vertex<E> nuevo = new Vertex<E>(data);
		if (this.listVertex.search(nuevo) != null) {
			System.out.println("Vertice ya fue insertado anteriormente ... ");
		}
		this.listVertex.insertFirst(nuevo);
		System.out.println("vertice " + nuevo + " insertado");
	}

	public void insertEdge(E verOri, E verDest) {
		this.insertEdge(verOri, verDest, -1);
	}

	public void insertEdge(E verOri, E verDest, int weight) {
		Vertex<E> refOri = this.listVertex.search(new Vertex<E>(verOri)); //Se busca en la lista de vértices, el origen
		Vertex<E> refDest = this.listVertex.search(new Vertex<E>(verDest)); //Asimismo se busca el destino
		if (refOri == null || refDest == null) {
			System.out.println("Vertice origen y/o destino no existen ... ");
			return;
		}
		if (refOri.listAdj.search(new Edge<E>(refDest)) != null) {
			System.out.println("Arista ya fue insertada anteriormente ... ");
			return;
		}
		refOri.listAdj.insertFirst(new Edge<E>(refDest, weight)); //Se inserta en origen(refOri), cuyo destino es "refDest"
		refDest.listAdj.insertFirst(new Edge<E>(refOri, weight)); //Se inserta en destino(refDest), cuyo destino es origen(refOri), en caso de ser no dirigido se elimina esta linea
	}


}