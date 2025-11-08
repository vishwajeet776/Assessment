package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import static javax.swing.UIManager.get;

class EdgeUnDirected {
    int src;
    int dest;
    public EdgeUnDirected(int s, int d){
        this.src=s;
        this.dest=d;
    }
}
class EdgeDirected{
    int src;
    int dest;
    int wt;
    public EdgeDirected(int s,int d,int w){
        this.src=s;
        this.dest=d;
        this.wt=w;
    }
}
public class AdjacencyList {
    public static void createGraphUndirected(List<EdgeUnDirected>[] graph){
        for (int i = 0; i < graph.length; i++) {
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new EdgeUnDirected(0,2));

        graph[1].add(new EdgeUnDirected(1,2));
        graph[1].add(new EdgeUnDirected(1,3));

        graph[2].add(new EdgeUnDirected(2,0));
        graph[2].add(new EdgeUnDirected(2,1));
        graph[2].add(new EdgeUnDirected(2,3));

        graph[3].add(new EdgeUnDirected(3,1));
        graph[3].add(new EdgeUnDirected(3,2));

    }
    public static void createGraphDirected(List<EdgeDirected>[] graph){
        for (int i = 0; i < graph.length; i++) {
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new EdgeDirected(0,2,2));

        graph[1].add(new EdgeDirected(1,2,10));
        graph[1].add(new EdgeDirected(1,3,0));

        graph[2].add(new EdgeDirected(2,0,2));
        graph[2].add(new EdgeDirected(2,1,10));
        graph[2].add(new EdgeDirected(2,3,-1));

        graph[3].add(new EdgeDirected(3,1,0));
        graph[3].add(new EdgeDirected(3,2,-1));
    }
    public static void BFS(ArrayList<EdgeUnDirected>[] graph){
        int n=graph.length;
        Queue<Integer> q=new LinkedList<>();
        boolean[] visited=new boolean[n];

        q.add(0);

        while (!q.isEmpty()){
            int current=q.remove();
            if (visited[current]==false){
                System.out.print(current+" ");
                visited[current]=true;
                for (int i = 0; i < graph[current].size(); i++) {
                    EdgeUnDirected e=graph[current].get(i);
                    q.add(e.dest);
                }
            }
        }
    }
    public static void main(String[] args) {
        int v=4;
        ArrayList<EdgeUnDirected>[] graph=new ArrayList[v];
        createGraphUndirected(graph);

        for (int i = 0; i < graph[2].size(); i++) {
            EdgeUnDirected e=graph[2].get(i);
            System.out.print(e.dest+" ");
        }
        System.out.println();
        ArrayList<EdgeDirected>[] graphD=new ArrayList[v];
        createGraphDirected(graphD);
        for (int i = 0; i < graphD[2].size(); i++) {
            EdgeDirected e=graphD[2].get(i);
            System.out.print(e.wt+"->");
        }
        System.out.println();
        BFS(graph);
    }
}
