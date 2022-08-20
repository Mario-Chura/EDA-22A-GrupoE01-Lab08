public class GraphLink <E>{
	//Atributo
	protected ListLinked<Vertex<E>> listVertex; //Lista enlazada de vertices

	//Constructor

	//Crea una lista vacia	
	public GraphLink() { 
		listVertex = new ListLinked<Vertex<E>>();//Se inicializa la lista, generando una lista vacìa de aristas
	}

	//Metodos

	public void insertVertex(E data) { //Recibe como argumento la informaciòn que va a almacenar el vertice
		Vertex<E> nuevo = new Vertex<E>(data); //Primero se declara e inicializa, enviando el elemento(data)
		if (this.listVertex.search(nuevo) != null) { //si es diferente de nulo indica que ese vertice ya está dentro de la lista
			System.out.println("El vertice ya fue insertado anteriormente ... ");
		}
		this.listVertex.insertFirst(nuevo);//en caso no se encuentre, se inserta en el atributo lista el vertice
		System.out.println("vertice " + nuevo + " insertado");
	}

	public void insertEdge(E verOri, E verDest) {
		Vertex<E> refOri = this.listVertex.search(new Vertex<E>(verOri));//Se busca en la lista de vértices el origen 
		Vertex<E> refDest = this.listVertex.search(new Vertex<E>(verDest));//Se busca en la lista de vértices el destino

	}

	public String toString() {
		return this.listVertex.toString();
	}

}