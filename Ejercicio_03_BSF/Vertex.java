public class Vertex<E> {
    //Atributos
    protected E data;
    protected ListLinked<Edge<E>> listAdj;
    protected int label; // "0=inexplorado" , "1 = visitado"
}