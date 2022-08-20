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

}