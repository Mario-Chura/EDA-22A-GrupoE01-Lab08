public class GraphLink<E> {
	//Atributos
	protected ListLinked<Vertex<E>> listVertex;

	//Constructor
	public GraphLink() {
		listVertex = new ListLinked<Vertex<E>>();
	}

	//Metodos
	public void insertVertex(E data) { //Recibe de argumento la informacion que va almacenar el vertice
		Vertex<E> nuevo = new Vertex<E>(data); //Se declara e inicializa nuevo vertice
		if (this.listVertex.search(nuevo) != null) { //Si es distinto de nulo, significa que ese vértice ya esta dentro de la lista
			System.out.println("Vertice ya fue insertado anteriormente ... ");
		}
		this.listVertex.insertFirst(nuevo);//En caso de no encontrarse, se inserta en la lista, el vértice
		System.out.println("vertice " + nuevo + " insertado");
	}

	public void insertEdge(E verOri, E verDest) {
		this.insertEdge(verOri, verDest, -1);
	}
	public void insertEdge(E verOri, E verDest, int weight) {
		Vertex<E> refOri = this.listVertex.search(new Vertex<E>(verOri)); //Se busca en la lista de vértices, el origen
		Vertex<E> refDest = this.listVertex.search(new Vertex<E>(verDest));//Asimismo se busca el destino
		//En caso de existir, se devuelve la referencia del dato.
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

	public String toString() {
		return this.listVertex.toString();
	}

	private void labels() {
		Node<Vertex<E>> aux = this.listVertex.first;
		for (; aux != null; aux = aux.getNext()) {
			aux.data.label = 0;
			Node<Edge<E>> OtherAux = aux.data.listAdj.first;
			for (; OtherAux != null; OtherAux = OtherAux.getNext())
				OtherAux.data.label = 0;
		}
	}
	
	//BFS - Breadth First Search - Recorrido en anchura 
	public void BFS(E data) {
		Vertex<E> nuevo = new Vertex<E>(data);
		Vertex<E> v = this.listVertex.search(nuevo);
		if (v == null) {
			System.out.println("Vertice no existe");
			return;
		}
		labels();
		BFSRec(v);
	}

		

}