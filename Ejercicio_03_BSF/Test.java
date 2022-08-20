public class Test {

	public static void main(String[] args) {
		GraphLink<String> g = new GraphLink<String>();

		g.insertVertex("A");
		System.out.println(g);
		g.insertVertex("aqp");
		g.insertVertex("hunter");
		System.out.println(g);
		g.insertVertex("sachaca");
		System.out.println(g);
		g.insertVertex("miraflores");
		System.out.println(g);
		g.insertVertex("paucarpata");
		System.out.println(g);
		g.insertVertex("characato");

		g.insertEdge("bustamante", "aqp");
		System.out.println(g);
		g.insertEdge("hunter", "aqp");
		System.out.println(g);
		g.insertEdge("sachaca", "bustamante");
		System.out.println(g);
		g.insertEdge("hunter", "bustamante");
		System.out.println(g);
		g.insertEdge("sachaca", "miraflores");

		System.out.println("----------------------------");

		System.out.println(g);
		System.out.println("Testeando BFS: ");
		g.BFS("bustamante");
		System.out.println(g);
		System.out.println(" ");
		g.BFS("miraflores");
		System.out.println(g);
	}
}