public class Vertex<E> {
    //Atributos
    protected E data;
    protected ListLinked<Edge<E>> listAdj;
    protected int label; // "0=inexplorado" , "1 = visitado"

    //Constructor
    public Vertex(E data) {
        this.data = data;
        listAdj = new ListLinked<Edge<E>>();
    }

}