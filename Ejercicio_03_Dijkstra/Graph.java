
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
    public  void addVertax(String s){ // Agregar vértice
        Vertax.add(s);
    }
    public int getFirstCO(int index){ // Obtiene el primer vértice adyacente del vértice especificado
        for (int i = 0; i <Vertax.size() ; i++) {
            if (edges[index][i]>0) return i;
        }
        return n;
    }
    public int getNextCO(int index,int firstCO){ // Obtiene los vértices adyacentes secuenciales del vértice especificado
        for (int i =firstCO+1 ; i <Vertax.size() ; i++) {
            if (edges[index][i]>0) return i;
        }
        return n;
    }
    public  void addEdges(int e1,int e2 , int weight){ // Agregar borde
        edges[e1][e2] = weight;        
        numberOfEdges++;
    }



}
