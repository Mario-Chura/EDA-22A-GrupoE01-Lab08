public class Test {
	public static void main(String[] args) {
		GraphLink<String> g = new GraphLink<String>();
		
		g.insertVertex("arequipa");
		System.out.println(g);
		g.insertVertex("JLByR");
		g.insertVertex("hunter");
		g.insertVertex("sachaca");
		g.insertVertex("characato");
		g.insertEdge("arequipa", "bustamante");
		g.insertEdge("hunter", "JLByR");
		g.insertEdge("sachaca", "arequipa");
		g.insertEdge("hunter", "arequipa");
		g.insertEdge("sachaca", "characato");
		
		System.out.println(g);

		
	}
}
