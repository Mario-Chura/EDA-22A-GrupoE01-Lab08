public class GraphLink <E>{
	//Atributo
	protected ListLinked<Vertex<E>> listVertex; //Lista enlazada de vertices

	//Constructor

	//Crea una lista vacia	
	public class GraphLink() { 
		listVertex = new ListLinked<Vertex<E>>();//Se inicializa la lista, generando una lista vacìa de aristas
	}

	//Metodos
	//insertVertex
	public void insertVertex(E data) { //Recibe como argumento la informaciòn que va a almacenar el vertice
		Vertex<E> nuevo = new Vertex<E>(data); //Primero se declara e inicializa, enviando el elemento(data)
		if (this.listVertex.search(nuevo) != null) { //si es diferente de nulo indica que ese vertice ya está dentro de la lista
			System.out.println("El vertice ya fue insertado anteriormente ... ");
		}
		this.listVertex.insertFirst(nuevo);//en caso no se encuentre, se inserta en el atributo lista el vertice
		System.out.println("vertice " + nuevo + " insertado");
	}

	//insertEdge
	public void insertEdge(E verOri, E verDest) {
		Vertex<E> refOri = this.listVertex.search(new Vertex<E>(verOri));//Se busca en la lista de vértices el origen 
		Vertex<E> refDest = this.listVertex.search(new Vertex<E>(verDest));//Se busca en la lista de vértices el destino
		//En caso de que existan, se devuelve la referencia del dato.
		//System.out.println("Existen ambos vertices");
		if (refOri == null || refDest == null) {//Si alguna no existe no se puede realizar la inserción
			System.out.println("Vertice origen y/o destino no existen ... ");
			return;
		}
		//Como existe, se evalua la existencia de la arista en alguna de las dos aristas, en este caso la del origen
		if (refOri.listAdj.search(new Edge<E>(refDest))!= null) {		
			System.out.println("Arista ya fue insertada anteriormente ... ");
			return;
		}
		//Se inserta por duplicado
		refOri.listAdj.insertFirst(new Edge<E>(refDest)); //Se inserta en origen, cuyo destino es refDest
		refOri.listAdj.insertFirst(new Edge<E>(refOri)); //Se inserta en destino(refDest), cuyo fin es el origen. En caso de ser un no dirigido, se elimina esta lìnea 
	}

	//toString
	public String toString() {
		return this.listVertex.toString();
	}

}