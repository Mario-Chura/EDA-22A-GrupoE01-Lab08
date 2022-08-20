public class Test {
    public static void main(String[] args) {
        Graph graph = new Graph(5);
        graph.addVertax("A");
        graph.addVertax("B");
        graph.addVertax("C");
        graph.addVertax("D");
        graph.addVertax("E");


        graph.addEdges(0,1,10);
        graph.addEdges(0,2,2);
        graph.addEdges(2,1,1);
        graph.addEdges(2,4,7);
        graph.addEdges(1,4,1);
        graph.addEdges(4,3,3);

        graph.showEdges();
        graph.dijkStra(0);
    }
}