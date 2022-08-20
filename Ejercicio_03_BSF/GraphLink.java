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

}