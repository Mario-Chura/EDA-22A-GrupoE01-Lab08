
public class Graph {
    //Atributos    
    private int n; //número de punto fijo n
    private int numberOfEdges;
    private double[] distance;
    private String[] path;
    private ArrayList<String> Vertax; //conjunto de vértices Vertax
    private static int[][] edges; //conjunto de aristas
    private boolean[] isVisited; //si ha sido visitado es el marcador visitado

    //Constructor
    public  Graph(int n){
        this.n = n;
        numberOfEdges=0;
        Vertax = new ArrayList<>(n);
        edges  = new int[n][n];
        isVisited = new boolean[n+1];
        distance = new double[n];
        for (int i = 0; i <n ; i++) {
            distance[i] = Double.POSITIVE_INFINITY;
        }

        path = new String[n];
        for (int i = 0; i <n ; i++) {
            path[i] = "";
        }
    }

    //Metodos

    public static void showEdges(){ // Imprime la lista de adyacencia
        for (int[] edse: edges
        ) {
            System.out.println(Arrays.toString(edse));
        }

    }
    public  int GetSizeOfGraph(ArrayList<String> Vertax){ // Permite obtener el número de vértices
        return Vertax.size();
    }
    

}
