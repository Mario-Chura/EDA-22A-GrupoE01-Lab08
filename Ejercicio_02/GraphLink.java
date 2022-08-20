public class GraphLink <E>{
	//Atributo
	protected ListLinked<Vertex<E>> listVertex; //Lista enlazada de vertices

	//Constructor

	//Crea una lista vacia	
	public GraphLink() { 
		listVertex = new ListLinked<Vertex<E>>();//Se inicializa la lista, generando una lista vacìa de aristas
	}
}