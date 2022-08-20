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

    //Metodos
    public boolean equals(Object o) {
        if (o instanceof Vertex<?>) {
            Vertex<E> v = (Vertex<E>) o;
            return this.data.equals(v.data);
        }
        return false;
    }
    


}