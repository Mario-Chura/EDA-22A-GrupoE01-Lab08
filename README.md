<div align="center">
<table>
    <theader>
        <tr>
            <td><img src="https://github.com/rescobedoq/pw2/blob/main/epis.png?raw=true" alt="EPIS" style="width:50%; height:auto"/></td>
            <th>
                <span style="font-weight:bold;">UNIVERSIDAD NACIONAL DE SAN AGUSTIN</span><br />
                <span style="font-weight:bold;">FACULTAD DE INGENIERÍA DE PRODUCCIÓN Y SERVICIOS</span><br />
                <span style="font-weight:bold;">ESCUELA PROFESIONAL DE INGENIERÍA DE SISTEMAS</span>
            </th>
            <td><img src="https://github.com/rescobedoq/pw2/blob/main/abet.png?raw=true" alt="ABET" style="width:50%; height:auto"/></td>
        </tr>
    </theader>
    <tbody>
        <tr><td colspan="3"><span style="font-weight:bold;">Formato</span>: Guía de Práctica de Laboratorio / Talleres / Centros de Simulación</td></tr>
        <tr><td><span style="font-weight:bold;">Aprobación</span>:  2022/03/01</td><td><span style="font-weight:bold;">Código</span>: GUIA-PRLE-001</td><td><span style="font-weight:bold;">Página</span>: 1</td></tr>
    </tbody>
</table>
</div>

<div align="center">
<span style="font-weight:bold;">INFORME DE LABORATORIO</span><br />

<table>
<theader>
<tr><th colspan="6">INFORMACIÓN BÁSICA</th></tr>
</theader>
<tbody>
<tr><td>ASIGNATURA:</td><td colspan="5">Estructura de Datos y Algoritmos</td></tr>
<tr><td>TÍTULO DE LA PRÁCTICA:</td><td colspan="5">Grafos</td></tr>
<tr>
<td>NÚMERO DE PRÁCTICA:</td><td>08</td><td>AÑO LECTIVO:</td><td>2022 A</td><td>NRO. SEMESTRE:</td><td>III</td>
</tr>
<tr>
<td>FECHA DE PRESENTACIÓN:</td><td>21/08/2022</td><td>HORA DE PRESENTACIÓN: 11:55 pm</td><td colspan="3"></td>
</tr>
<tr><td colspan="3">INTEGRANTE(s):
<ul>
      			<li><a href="https://github.com/fernandocoylaA">Fernando Jesús Coyla Alvarez</a></li>
			<li><a href="https://github.com/Icielo23">Valery Cielo Iquise Mamani</a></li>
			<li><a href="https://github.com/Mario-Chura">Mario Franco Chura Puma</a></li>
</ul>
</td>
<td>NOTA:</td><td colspan="2"></td>
</<tr>
<tr><td colspan="6">DOCENTE(s):
<ul>
<li>Richart Smith Escobedo Quispe - rescobedoq@unsa.edu.pe</li>
</ul>
</td>
</<tr>
</tbody>
</table>
</div>
  

  
<div align="center"><h2> SOLUCIÓN Y RESULTADOS </h2></div>

### I.	SOLUCIÓN DE EJERCICIOS/PROBLEMAS
#

La estrutura del presente laboratorio es la siguiente:

   

   ```sh

	    ├── EDA-22A-GrupoE01-Lab08
	        ├── Ejercicio_02
	        ├── Ejercicio_03_BSF
	        ├── Ejercicio_03_DFS
	        ├── Ejercicio_03_Dijkstra
	        ├── Ejercicio_04
	        ├── Ejercicio_05
	        └── Readme.md

   ```
   
   - En los archivos Test estará la ejecución del código.
#	
1.  Ejercicio 1: Crear un repositorio en GitHub, donde incluyan la resolución de los ejercicios propuestos y el informe.
	- El link del repositorio es el siguiente: https://github.com/Mario-Chura/EDA-22A-GrupoE01-Lab08.git 
2.  Ejercicio 2: Implementar el cogido de Grafo cuya representación sea realizada mediante LISTA DE ADYACENCIA. (3 puntos)
    ##	 Procedimiento
    ##   Clase Nodo
	- Para implementar el codigo se creo una clase **Nodo**, con sus respectivos atributos, constructores, getters y setters
        ```py
        //Atributos de la clase Node
        protected T data; 
        protected Node<T> next; //puntero o referencia
        ```
    ##   Clase ListLinked
    - En esta clase **ListLinked**, almacenamos los elementos en esta lista enlazada.
    - Cuenta con el atributo *first* que es nuestro primer nodo y con un constructor que instancia con valor *null* este atributo.
        ```py
        //Atributo
            protected Node<T> first;

        // Constructor
            public ListLinked () {
                this.first = null;
            }

        ```
    - Asimismo cuenta con el metodo booleano **isEmpty** que define la existencia del grafo.
    - El metodo **search**, recibe como argumento un elemento y retorna el mismo si existe en el grafo.
        - Con ayuda de un *nodo* auxiliar, referencia al primer nodo del grafo, para luego hacer las comparaciones en un bucle *while*, mientras sea distinto a *null* y no exista igualdad en el dato del *nodo* y el *dato* recibido, se realiza el movimiento al siguiente nodo. Terminado el bucle ...
        ```py                      
        if (nodo != null) //Al cumplirse, significa que el elemento existe
           return nodo.data; //por consiguiente se devuelve el dato del elemento que se busca
        return null; //cuando recorra toda la lista y no encuentre al elemento
       ```
    - El metodo **insertFirst**, permite la insercion del dato que se le envia como argumento, al inicio de la lista
        ```py
        this.first = new Node<T>(data, this.first); //Creacion del nodo con el valor de data ingresado
        ```
    - El metodo **toString**, permite mostrar la informacion del Grafo con ayuda de un bucle *while* almacena la informacion de *data* de los nodos y se concatena en un *string* que luego es retornado.
    ##   Clase Vertex 
    - La clase **Vertex**, creada para almacenar los vertices de nuestro grafo. Cuenta con un atributo generico *data* y una lista enlazada que representa a *lista de adyacencia* de cada vértice, que guarda tipos arista. Su *constructor* recibe un tipo *data* y lo almacena en su atributo, ademas inicializa la lista enlazada de *edge* (aristas).
    - El metodo **equals** retorna un booleano resultado de la comparacion del atributo *data* y el dato del objeto recibido como argumento.
        ```py
        return this.data.equals(v.data); 
        ```
    - Finalmente cuenta con un metodo **toString**, que retorna el *data* y la lista enlazada.
    ## Clase Edge
    - La clase **Edge**, son las aristas que usamos como lista enlazada en la clase Vertex, como atributos contiene:
        ```py        
        protected Vertex<E> refDest; //Contiene la referencia de nuestro destino, que es un vértice
        protected int weight; // - ponderado (parámetro) / no ponderado (-1)  
        ```
    - Cuenta con dos *constructores* uno que recibe a la variable *Vertex* y al entero *weight*, asignando su valor a los atributos respectivos. El segundo solo recibe a la variable *Vertex* como se muestra a continuacion:
        ```py
        public Edge (Vertex<E> refDest) {
            this(refDest, -1); //Invoca al primer constructor 
        }
        ``` 
    - Cuanta igualmente con un metodo **equals** que realiza la comparacion del vertice *refDest* y el valor del vertice del objeto recibido.
       ```py
       return this.refDest.equals(e.refDest);
       ```  
    - El metodo **toString**, muestra la información del vértice destino y en caso tenga, la de su peso.
        ```py
        return refDest.data + " [" + this.weight + "], ";
        ```
    ## Clase GraphLink
    - La clase **GraphLink** nos permitira mostrar el grafo, mediante su atributo que consiste en una lista enlazada de vertices. Y su *constructor* que se encarga de inicializarla.
        ```py
        //Atributo
        protected ListLinked<Vertex<E>> listVertex; //Lista enlazada de vertices
        //Constructor
        listVertex = new ListLinked<Vertex<E>>();//Se inicializa la lista, generando una lista vacìa de aristas
        ```
    - Metodos:    
        - El metodo **insertVertex**, recibe como argumento la informaciòn que va a almacenar el vertice, dentro de este: Primero se declara e inicializa una variable tipo *vertex*, enviando el elemento(data).
            ```py             
                Vertex<E> nuevo = new Vertex<E>(data);
                //si es diferente de nulo indica que ese vertice ya está dentro de la lista
                if (this.listVertex.search(nuevo) != null) { 
                    System.out.println("El vertice ya fue insertado anteriormente ... ");
                }
                //en caso no se encuentre, se inserta en el atributo lista el vertice
                this.listVertex.insertFirst(nuevo);
                System.out.println("vertice " + nuevo + " insertado");
         
            ```
        - El metodo **insertEdge**, recibe dos tipo generico para el origen *verOri*, y destino *E verDest*.
            - Se busca en la lista de vértices el origen y el destino. En caso de que existan, se devuelve la referencia del dato.
                ```py                                       
                Vertex<E> refOri = this.listVertex.search(new Vertex<E>(verOri)); 
                Vertex<E> refDest = this.listVertex.search(new Vertex<E>(verDest));              
                ```
            - En un condicional se comprueba que si alguna no existe no se puede realizar la inserción, mostrando el debido mensaje en consola                
            - En caso existe, se evalua la existencia de la arista en alguna de las dos aristas, en este caso la del origen
                ```py
                if (refOri.listAdj.search(new Edge<E>(refDest))!= null) {       
                    if (refOri.listAdj.search(new Edge<E>(refDest))!= null) {       
                    System.out.println("Arista ya fue insertada anteriormente ... ");      
                    return;
                }
                
                ```
            - Finalmente se inserta por duplicado
                - Se inserta en origen, cuyo destino es refDest
                ```py            
                refOri.listAdj.insertFirst(new Edge<E>(refDest));
                ```
                - Se inserta en destino(refDest), cuyo fin es el origen. En caso de ser un no dirigido, se elimina esta lìnea 
                ```py 
                refOri.listAdj.insertFirst(new Edge<E>(refOri)); 
                ```   
        - El ultimo metodo **toString**, retorna el *string* de lista de vertices.
    ## Test
        - En las pruebas realizadas se creó un grafo *GraphLink* de *string*, donde se inserto vertices y aristas.
        - Para este caso distritos de arequipa. Obteniendo lo siguiente:
          
3.  Ejercicio 3: Implementar BSF, DFS y Dijkstra con sus respectivos casos de prueba. (5 puntos)
	## Procedimiento
	## Breadth First Search (BFS) - Recorrido en anchura
    - Para la implentacion de este tipo de recorrido:
    - Se reutilizo lo implementado en el *ejercicio2*
        - Clase **Node** con sus respectivos atributos, constructores y metodos accesores y mutadores
        - Clase **Vertex**, añade un atributo *label* que tendra como valor segun el caso *"0=inexplorado" , "1 = visitado"*.
        - Clase **Edge**, añade igualmente un atributo *label* que segun el caso valdra: *0 = inexplorado , 1 = discovery , 2 = Cross*.
        - Clase **ListLinked**, añade el metodo *remove*: que recibe al elemento a eliminar
            ```py
            T item = null; //variable tipo elemento, auxiliar
            Node<T> aux = this.first; //auxiliar toma referencia del primero
            ```
            - Si se cumple que el atributo *first* es no nulo, y su *data* es igual al que se ingresa en el metodo. Se almacena el valor de *first.data* y se realiza el cambio de puntero de *first*
            ```py 
            if (this.first != null && this.first.data.equals(data)) {
            item = first.data; 
            first = first.next;
            ```
            - En otro caso se recorre el grafo con un *while*, en busqueda del elemento a "eliminar" 
        - Clase **GraphLink** aumenta un constructor que recibe dos argumentos, designando al valor *weight* como *-1*. Y en el constructor que recibe a los tres argumentos, en la parte final :
            - Se inserta en origen(refOri), cuyo destino es "refDest"
            ```py 
            refOri.listAdj.insertFirst(new Edge<E>(refDest, weight));
             ``` 
            - Se inserta en destino(refDest), cuyo destino es origen(refOri)
            ```py
            refDest.listAdj.insertFirst(new Edge<E>(refOri, weight));
            ```
            - Ademas se añade el metodo *labels*, que mediante un bucle *for* se cambia el valor *label* del auxiliar creado el cual referencia a *this.listVertex.first*.
        - El metodo *BFS* - Breadth First Search, implementado en la clase **GraphLink**. 
            - Recibe un elemento *data*, se crea un *nuevo* vertice enviando el valor de *data* recibido, ademas un vertice *v* que es igual al valor retorno de la busqueda de *data* en la lista *listVertex*
            ```py
            Vertex<E> nuevo = new Vertex<E>(data);
            Vertex<E> v = this.listVertex.search(nuevo);
            ```
            - Si *v* es nulo, se envia el mensaje de *inexistencia del vertice* en la consola
            - Si no es el caso se llama al metodo **labels** visto antes y ademas al metodo **BFSRec** enviandole el valor "*v*"
        - El metodo *BFSRec*, implementado igualmente en la clase **GraphLink**.
            - Recibe un vertice, crea una lista Enlazada *queue* , añade el vertice a la lista y asigna el valor de *1* a label de *vertice*.
            - En un bucle *while* mientras tamaño de la lista sea distinto a cero. Se retira de la lista a *vertice* y se muestra su *data* en consola.
            ```py
            vertice = queue.poll();
            System.out.print(vertice.data +", ");
            ```  
            - Se cre una nodo arista "*e*", que referencia al primer vertice
            ```py
            Node<Edge<E>> e = vertice.listAdj.first;
            ```
            - En un bucle *for*  
            ```py
                if(e.data.label == 0) { //comprueba si el valor label de el nodo arista es cero(inexplorado)
                    //si el caso se crea un vertice que referencia al destino(refDest) de el nodo arista.
                    Vertex<E> w = e.data.refDest; 
                    if(w.label == 0) { //si el label es cero(inexplorado)
                        e.data.label = 1; //cambia a uno el label de el nodo (descubierto) 
                        w.label = 1; //y el de "w" se vuelve 1 (descubierto)
                        queue.add(w); // se añade a la listaEnlazada(cola)
                    }else {
                        w.label = 2; //en otro caso sera 2 el valor (cross)
                    }
                }            
            ```
	    
4.  Ejercicio 4: Solucionar el siguiente ejercicio: (5 puntos)
El grafo de palabras se define de la siguiente manera: cada vértice es una palabra en el idioma Inglés y dos palabras son adyacentes si difieren exactamente en una posición. Por ejemplo, las cords y los corps son adyacentes, mientras que los corps y crops no lo son.<br>
- Definimos el grafo de la siguiente manera: cada vértice es una palabra en el idioma inglés y dos palabras son adyacentes si se diferencian exactamente en una posición. Por ejemplo, las cords y los corps son adyacentes, mientras que los corps y crops no lo son.

	a) Dibuje el grafo definido por las siguientes palabras: words cords corps coops crops drops drips grips gripe grape graph <br>
	
	![imagen](Ejercicio_04/Img2.jpg)
	
	b) Mostrar la lista de adyacencia del grafo. <br>
	
	![imagen](Ejercicio_04/Img3.jpg)
	
5.  Ejercicio 5: Realizar un método en la clase Grafo. Este método permitirá saber si un grafo está incluido en otro. Los parámetros de entrada son 2 grafos y la salida del método es true si hay inclusión y false el caso contrario. (4 puntos)
	- 

	
   
#

### II.	SOLUCIÓN DEL CUESTIONARIO

#
-¿Cuantas variantes del algoritmo de Dijkstra hay y cuál es la diferencia entre ellas? (1 puntos) <br>


- El algoritmo de Dijkstra es un algoritmo para la búsqueda de las rutas más cortas entre los nodos en un gráfico, que puede representar, por ejemplo, redes de carreteras. Fue concebido por el científico informático Edsger W. Dijkstra en 1956 y publicado tres años después. El algoritmo de Dijkstra sirve para encontrar el camino más corto entre un a y b . Selecciona el vértice no visitado con la distancia más baja, calcula la distancia a través de él hasta cada vecino no visitado y actualiza la distancia del vecino si es menor. Se marca como visitado (puesto en rojo) cuando termine con los vecinos.
- Variantes del algoritmo de Dijkstra:
	- Cuando los pesos de arco son números enteros pequeños (delimitados por un parámetro C), las colas especializadas que aprovechan este hecho se pueden utilizar para acelerar el algoritmo de Dijkstra. El primer algoritmo de este tipo fue el algoritmo de Dial ( Dial 1969 ) para gráficos con pesos de borde enteros positivos, que usa una cola de cubos para obtener un tiempo de ejecución.{\displaystyle O(|E|+|V|C)}.
	-  El uso de un árbol de Van Emde Boas como cola de prioridad aporta complejidad a{\displaystyle O(|E|\log \log C)}( Ahuja et al. 1990 ). 
	-  Otra variante interesante basada en una combinación de un nuevo montón de radix y el conocido montón de Fibonacci se ejecuta en el tiempo{\displaystyle O(|E|+|V|{\sqrt {\log C}})}( Ahuja et al. 1990 ).
	-   Finalmente, los mejores algoritmos en este caso especial son los siguientes. El algoritmo dado por ( Thorup 2000 ) se ejecuta enO(|E|\log \log |V|)tiempo y el algoritmo dado por ( Raman 1997 ) se ejecuta en{\displaystyle O(|E|+|V|\min\{(\log |V|)^{1/3+\varepsilon },(\log C)^{1/4+\varepsilon }\})} hora.

-Invetigue sobre los ALGORITMOS DE CAMINOS MINIMOS e indique, ¿Qué similitudes encuentra, qué diferencias, en qué casos utilizar y porque? (2 puntos) <br>

Es importante recordar que el problema de Caminos Mínimos se presenta en muchas situaciones de aplicación real, como es el caso de transporte, telecomunicaciones, industria, aplicaciones geográficas y planeamientos, lo cual hace relevante su aprendizaje. El problema del camino más corto es aquel que consiste en encontrar un camino entre dos nodos de manera que la suma de los costes de los nodos que lo constituyen es mínima. Por supuesto, este tipo de algoritmos permiten estudiar costes de trayecto diferentes, como la distancia, el tiempo de viaje, el coste generalizado, etc.
- Algoritmos de Dijkstra:
También llamado algoritmo de caminos mínimos, es un algoritmo para la determinación del camino más corto dado un vértice origen al resto de vértices en un grafo con pesos en cada arista. Su nombre se refiere a Edsger Dijkstra, quien lo describió por primera vez en 1959.
Resuelve el problema de los caminos más cortos desde un único nodo origen hasta todos los otros nodos del grafo (aunque aplicando una regla de repetición del algoritmo, se puede automatizar la resolución del problema desde todos los nodos de origen hasta todos los nodos del grafo).
- Algoritmo de Bellman-Ford:
Resuelve el problema de los caminos más cortos desde un origen permitiendo que la ponderación de los nodos sea negativa. El algoritmo de Bellman-Ford determina la ruta más corta desde un nodo origen hacia los demás nodos para ello es requerido como entrada un grafo cuyas aristas posean pesos. La diferencia de este algoritmo con los demás es que los pesos pueden tener valores negativos ya que Bellman-Ford me permite detectar la existencia de un ciclo negativo.
El algoritmo de Dijkstra resuelve este mismo problema en un tiempo menor, pero requiere que los pesos de las aristas no sean negativos, salvo que el grafo sea dirigido y sin ciclos. Por lo que el Algoritmo Bellman-Ford normalmente se utiliza cuando hay aristas con peso negativo. Este algoritmo fue desarrollado por Richard Bellman, Samuel End y Lester Ford.
- Algoritmo de Floyd:
Resuelve el problema de los caminos más cortos entre todos los nodos. En informática, el algoritmo de Floyd-Warshall, descrito en 1959 por Bernard Roy, es un algoritmo de análisis sobre grafos para encontrar el camino mínimo en grafos dirigidos ponderados. El algoritmo encuentra el camino entre todos los pares de vértices en una única ejecución. El algoritmo de Floyd-Warshall es un ejemplo de programación dinámica.
- Algoritmo de Búsqueda A*:
Resuelve el problema de los caminos más cortos entre un par de nodos usando la heurística para agilizar la búsqueda.
- Algoritmo de Johnson:
Resuelve el problema de los caminos más cortos entre todos los nodos y puede ser más rápido que el de Floyd-Warshall en grafos de baja densidad.
- Algoritmo de Viterbi:
Resuelve el problema del camino estocástico más corto con un peso probabilístico adicional en cada nodo.
- MinimumSpanningTree
Se analiza los 3 algoritmos más importantes:

![imagen](Ejercicio_04/Img1.jpg)

#

### III.	CONCLUSIONES
#
-En el presente laboratorio hemos podido conocer los conceptos más básicos de la teoría de grafos conociendo los grafos dirigidos y no dirigidos, además de los sub grafos que están contenido dentro de un grafo y también los caminos, cadenas y ciclos que nos permiten movernos de un sitio a otro en el grafo.  <br>
-Se ha podido entender que es un grafo como una composición de un conjunto de objetos conocidos como nodos que se relacionan con otros nodos a través de un conjunto de conexiones conocidas como aristas. <br>
-Según lo investigado el algoritmo de Dijkstra nos proporciona información a los nodos sobre el estado de toda red, permitiendo tomar decisiones de la ruta, a partir de parámetros como la capacidad y el retardo del enlace. <br>

#
<div align="center"><h2>  RETROALIMENTACIÓN GENERAL </h2></div> <br>

<div align="center"><h2> REFERENCIAS Y BIBLIOGRAFÍA </h2></div> <br>

-   http://bioinfo.uib.es/~joemiro/teach/labmat/Old/labmatold/2006_7/TdGrafos.pdf
-   http://bioinfo.uib.es/~joemiro/teach/labmat/Old/labmatold/2006_7/TdGrafos.pdf
-   Escuela de Pedagogía en Educación Matemática, Marcelino Álvarez, et.al., http://repobib.ubiobio.cl/jspui/bitstream/123456789/1953/3/Alvarez_Nunez_Marcelino.pdf
-   Weiss M., Data Structures & Problem Solving Using Java, 2010, Addison-Wesley.
-   http://www.dma.fi.upm.es/personal/gregorio/matematica_discreta_II/31DistCaminos.pdf
-   https://www.ecured.cu/Algoritmo_de_Dijkstra
-   https://jariasf.wordpress.com/2013/01/01/camino-mas-corto-algoritmo-de-bellman-ford/
