package cracking.chapter4;

import cracking.utils.Graph;

/* 
 * 4.2
 * Given a directed graph, design an algorithm to find out 
 * whether there is a route between two nodes
 * 
 * */
public class Q4_2 {

	
	
	public static void main(String[] args){
		Graph theGraph = new Graph();
//		theGraph.addVertex("A"); // 0
//		theGraph.addVertex("B"); // 1
//		theGraph.addVertex("C"); // 2
//		theGraph.addVertex("D"); // 3
//		theGraph.addVertex("E"); // 4
//		theGraph.addVertex("F"); // 5
//		theGraph.addVertex("G"); // 6
//		theGraph.addVertex("H"); // 7
//		theGraph.addVertex("I"); // 8
//		
//		theGraph.addUndirectedEdge(0, 1); // AB
//		theGraph.addUndirectedEdge(0, 2); // AC
//		theGraph.addUndirectedEdge(0, 3); // AD
//		theGraph.addUndirectedEdge(0, 4); // AE
//		
//		theGraph.addUndirectedEdge(1, 5); // BF
//		theGraph.addUndirectedEdge(5, 7); // FH
//		theGraph.addUndirectedEdge(3, 6); // DG
//		theGraph.addUndirectedEdge(6, 8); // GI

		theGraph.addVertex("A"); // 0
		theGraph.addVertex("B"); // 1
		theGraph.addVertex("C"); // 2
		theGraph.addVertex("D"); // 3
		theGraph.addVertex("E"); // 4
		
		theGraph.addDirectedEdge(0, 1); // AB
		theGraph.addDirectedEdge(1, 3); // BD
		theGraph.addDirectedEdge(0, 2); // AC
		theGraph.addDirectedEdge(4, 1); // EB		
		
		int v1 = 0;
		int v2 = 3;
		String v1Label = theGraph.mVertexList[v1].label;
		String v2Label = theGraph.mVertexList[v2].label;
		
		
		System.out.println("find a route between " + v1Label + " and " + v2Label);
		
		if(theGraph.isRoute(v1, v2)){
			System.out.println("there is a route between " + v1Label + " and " + v2Label);
		}
		else{
			System.out.println("there is no route between " + v1Label + " and " + v2Label);
		}
		System.out.println();
		
		v1 = 4;
		v2 = 0;
		v1Label = theGraph.mVertexList[v1].label;
		v2Label = theGraph.mVertexList[v2].label;
		
		System.out.println("find a route between " + v1Label + " and " + v2Label);
		
		if(theGraph.isRoute(v1, v2)){
			System.out.println("there is a route between " + v1Label + " and " + v2Label);
		}
		else{
			System.out.println("there is no route between " + v1Label + " and " + v2Label);
		}
		System.out.println();

		v1 = 0;
		v2 = 2;
		v1Label = theGraph.mVertexList[v1].label;
		v2Label = theGraph.mVertexList[v2].label;
		
		System.out.println("find a route between " + v1Label + " and " + v2Label);
		
		if(theGraph.isRoute(v1, v2)){
			System.out.println("there is a route between " + v1Label + " and " + v2Label);
		}
		else{
			System.out.println("there is no route between " + v1Label + " and " + v2Label);
		}
		System.out.println();

		v1 = 3;
		v2 = 2;
		v1Label = theGraph.mVertexList[v1].label;
		v2Label = theGraph.mVertexList[v2].label;
		
		System.out.println("find a route between " + v1Label + " and " + v2Label);
		
		if(theGraph.isRoute(v1, v2)){
			System.out.println("there is a route between " + v1Label + " and " + v2Label);
		}
		else{
			System.out.println("there is no route between " + v1Label + " and " + v2Label);
		}
		System.out.println();
	}
}