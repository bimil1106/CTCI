package cracking.utils;

public class Vertex {
    public enum VertexState{UNVISITED, VISITED}
    
    public String label;
    public boolean isVisited;
    
    public Vertex(String label){
            this.label = label;
    }
}
