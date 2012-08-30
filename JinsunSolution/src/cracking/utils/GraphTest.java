package cracking.utils;

public class GraphTest {
	public static void main(String[] args){
		Graph theGraph = new Graph(9);
		theGraph.addVertex("A"); // 0
		theGraph.addVertex("B"); // 1
		theGraph.addVertex("C"); // 2
		theGraph.addVertex("D"); // 3
		theGraph.addVertex("E"); // 4
		theGraph.addVertex("F"); // 5
		theGraph.addVertex("G"); // 6
		theGraph.addVertex("H"); // 7
		theGraph.addVertex("I"); // 8
		
		theGraph.addEdgeUndirectedGraph(0, 1); // AB
		theGraph.addEdgeUndirectedGraph(0, 2); // AC
		theGraph.addEdgeUndirectedGraph(0, 3); // AD
		theGraph.addEdgeUndirectedGraph(0, 4); // AE
		
		theGraph.addEdgeUndirectedGraph(1, 5); // BF
		theGraph.addEdgeUndirectedGraph(5, 7); // FH
		theGraph.addEdgeUndirectedGraph(3, 6); // DG
		theGraph.addEdgeUndirectedGraph(6, 8); // GI
		
		System.out.println("Visiting in bfs:");
		theGraph.bfs();
		
		System.out.println();
		System.out.println("Visiting in dfs:");
		theGraph.dfs();
		
		/*
		Visiting in bfs:
		A B C D E F G H I 
		Visiting in dfs:
		A B F H C D G I E 
		*/
	}
}
