public class Test {
	public static void main(String[] args) {
		GraphLink<String> g = new GraphLink<String>();
		
		g.insertVertex("lima");
		System.out.println(g);
		g.insertVertex("aqp");
		g.insertVertex("cusco");
		g.insertVertex("piura");
		g.insertVertex("tarapoto");
		g.insertEdge("lima", "arequipa");
		g.insertEdge("cusco", "aqp");
		g.insertEdge("piura", "lima");
		g.insertEdge("cusco", "lima");
		g.insertEdge("piura", "tarapoto");
		
		System.out.println(g);
		
		
	}
}
