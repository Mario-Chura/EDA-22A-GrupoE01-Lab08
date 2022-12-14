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
	public String toString() {
		return this.listVertex.toString();
	}

	private void initLabel() {
		Node<Vertex<E>> aux = this.listVertex.first;
		for (; aux != null; aux = aux.getNext()) {
			aux.data.label = 0;
			Node<Edge<E>> auxE = aux.data.listAdj.first;
			for (; auxE != null; auxE = auxE.getNext())
				auxE.data.label = 0;
		}
	}

	//DFS Depth First Search -Recorrido en profundidad  
	public void DFS(E data) {
		Vertex<E> nuevo = new Vertex<E>(data);
		Vertex<E> v = this.listVertex.search(nuevo);
		if (v == null) {
			System.out.println("Vertice no existe");
			return;
		}
		initLabel();
		DFSRec(v);
	}

	private void DFSRec(Vertex<E> v) {
		v.label = 1;
		System.out.print(v.data + ", ");
		Node<Edge<E>> e = v.listAdj.first;
		for (; e != null; e = e.getNext()) {
			if (e.data.label == 0) {
				Vertex<E> w = e.data.refDest;
				if (w.label == 0) {
					e.data.label = 1;
					DFSRec(w);
				} else {
					e.data.label = 2;
				}
			}
		}
	}


}