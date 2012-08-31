package cracking.utils;

import java.util.LinkedList;
import java.util.Stack;

public class Graph {
/* 
 * Need to represent vertices and edges.
 * Vertices are managed the array of Vertex
 * Edges are managed by adjacency matrix or adjacency list
 * 
 * */
        
        private int NUMBER_OF_VERTEX = 20;
        public Vertex [] mVertexList;
        private int mCount;
        private int [][] mAdjMatrix;
 
        public Graph(){            
            mVertexList = new Vertex[NUMBER_OF_VERTEX];
            mAdjMatrix = new int[NUMBER_OF_VERTEX][NUMBER_OF_VERTEX];
            mCount = 0;
            
            // set all edges to zero
            for(int i=0; i < NUMBER_OF_VERTEX; i++){
                    for(int j=0; j < NUMBER_OF_VERTEX; j++){
                            mAdjMatrix[i][j] = 0;
                    }
            }
        }
        
        public Graph(int numberOfVertex){
                NUMBER_OF_VERTEX = numberOfVertex;
                
                mVertexList = new Vertex[NUMBER_OF_VERTEX];
                mAdjMatrix = new int[NUMBER_OF_VERTEX][NUMBER_OF_VERTEX];
                mCount = 0;
                
                // set all edges to zero
                for(int i=0; i < NUMBER_OF_VERTEX; i++){
                        for(int j=0; j < NUMBER_OF_VERTEX; j++){
                                mAdjMatrix[i][j] = 0;
                        }
                }
        }
        
        public void addUndirectedEdge(int start, int end){
                mAdjMatrix[start][end] = 1;
                mAdjMatrix[end][start] = 1;
        }
        
        public void addDirectedEdge(int start, int end){
            mAdjMatrix[start][end] = 1;
        }
        
        
        public void addVertex(String label){
                if(mCount >= NUMBER_OF_VERTEX){
                        System.out.println("Add failed.. Number of Vertex is overflowed.");
                        return;
                }
                mVertexList[mCount++] = new Vertex(label);
        }
        
        public void printVertex(int vertex){
                System.out.print(mVertexList[vertex].label + " ");
        }
        
        public void printEdges(){
                for(int m[] : mAdjMatrix){
                        System.out.println();
                        for(int j : m){
                                System.out.println(j + " ");
                        }
                }
        }
        
        public int getAdjUnvisitedVertex(int vertex){
                
                for(int j=0; j<mCount; j++){
                        if(mAdjMatrix[vertex][j] == 1 && mVertexList[j].isVisited == false)
                                return j;
                }
                
                return -1;
        }

        public void dfs(){
                Stack<Integer> s = new Stack<Integer>(); 
                mVertexList[0].isVisited = true;
                printVertex(0);
                s.push(0);
                
                while(!s.isEmpty()){
                        int adjVertex = getAdjUnvisitedVertex(s.peek());
                        if(adjVertex == -1){
                                s.pop();
                        }
                        else{
                                mVertexList[adjVertex].isVisited = true;
                                printVertex(adjVertex);
                                s.push(adjVertex);
                        }
                }
                
                for(int i=0; i<mCount; i++){
                        mVertexList[i].isVisited = false;
                }
        }
        
        public void dfs(int vertex){
                Stack<Integer> s = new Stack<Integer>(); 
                mVertexList[vertex].isVisited = true;
                printVertex(0);
                s.push(vertex);
                
                while(!s.isEmpty()){
                        // Do not think about for loop with mCount
                        // Until popping, we can see the top
                        int adjVertex = getAdjUnvisitedVertex(s.peek());
                        if(adjVertex == -1){
                                s.pop();
                        }
                        else{
                                mVertexList[adjVertex].isVisited = true;
                                printVertex(adjVertex);
                                s.push(adjVertex);
                        }
                }

                for(int i=0; i<mCount; i++){
                        mVertexList[i].isVisited = false;
                }

        }
        
        public void dfsRecursion(){

        }
        
        public void bfs(){
                LinkedList<Integer> q = new LinkedList<Integer>();
                mVertexList[0].isVisited = true;
                printVertex(0);
                q.addLast(0);
                
                while(!q.isEmpty()){
                        int adjVertex = getAdjUnvisitedVertex(q.peek());
                        if(adjVertex == -1){
                                q.removeFirst();
                                //System.out.println("item in queue: " + q);
                        }
                        else{
                                mVertexList[adjVertex].isVisited = true;
                                printVertex(adjVertex);
                                q.addLast(adjVertex);
                        }
                }

                for(int i=0; i<mCount; i++){
                        mVertexList[i].isVisited = false;
                }
        }

		public boolean isRoute(int v1, int v2) {
			Stack<Integer> s = new Stack<Integer>();
			
			mVertexList[v1].isVisited = true;
			printVertex(v1);
			s.push(v1);
			
			while(!s.isEmpty()){
				int adjVertex = getAdjUnvisitedVertex(s.peek());
				if(adjVertex == -1){
					s.pop();
				}
				else{
					if(adjVertex == v2){
						return true;
					}
					mVertexList[adjVertex].isVisited = true;
					printVertex(adjVertex);
					s.push(adjVertex);
				}
			}
			return false;
		}
}

