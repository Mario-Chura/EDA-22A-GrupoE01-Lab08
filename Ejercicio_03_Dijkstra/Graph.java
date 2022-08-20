
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
    public int getNumberOfEdges(){ // Obtiene el número de aristas
        return numberOfEdges;
    }

    //DijkStra
    public void dijkStra(int index ){
        int CO; // CO son las coordenadas necesarias para la iteración
        int headIndex = index; //es el vértice inicial de cada DIJKSTRA
        distance[index]=0; // Establece la distancia desde el punto inicial al punto inicial, naturalmente 0

        while (!isVisited[headIndex]){            
            CO = getFirstCO(headIndex); // CO es la primera CO que no ha sido visitada
            while(isVisited[CO]){
                CO = getNextCO(headIndex,CO);
            }

            /*
                * Si el vértice headIndex no tiene vértices adyacentes que no hayan sido visitados, 
                * la coordenada del vértice se obtiene como n, lo que indica que es el último nodo desconocido, 
                * y solo necesita establecerse como conocido
            */
            if (CO==n) {
                isVisited[headIndex]=true;
                System.out.println("Coordenada no encontrada ");
            }else {
                while (!isVisited[CO]&&CO<n) { // Para todos los vértices adyacentes a través de un bucle
                    isVisited[headIndex]=true;
                    double currentDis = distance[headIndex]+edges[headIndex][CO];
                    if (currentDis<distance[CO]) {
                        distance[CO] = currentDis;
                        path[CO] = path[headIndex]+" "+Vertax.get(headIndex);
                    }

                    CO = getNextCO(headIndex, CO);
                }
            }
            headIndex = indexGet(distance,isVisited);
        }
        for (int i = 0; i <n ; i++) {
            path[i] = path[i]+" "+Vertax.get(i);
        }
        System.out.println("Iniciar nodo:"+Vertax.get(index));
        for (int i = 0; i <n ; i++) {
            System.out.println(Vertax.get(i)+"   "+distance[i]+"   "+path[i]);
        }
    }
    // Recibe la matriz de distancia y la matriz de acceso para devolver el siguiente vértice requerido
    public int indexGet(double[] distance, boolean[] isVisited){
        int j=0;
        double mindis=Double.POSITIVE_INFINITY;
        for (int i = 0; i < distance.length; i++) {
            if (!isVisited[i]){
                if(distance[i]<mindis){
                    mindis=distance[i];
                    j=i;
                }
            }
        }
        return j;
    }




}
