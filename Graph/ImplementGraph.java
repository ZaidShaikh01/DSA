import java.util.*;
public class ImplementGraph {

    HashMap <Integer, LinkedList<Integer>> hm;

    ImplementGraph(){
        hm = new HashMap<>();
    }

    void addVertex(int u){
        hm.putIfAbsent(u, new LinkedList<Integer>());
    }

    void addEdges(int u, int v ){
        addVertex(u);
        addVertex(v);
        hm.get(u).add(v);
        hm.get(v).add(u);
    }
    void display(){
        for(int vertex : hm.keySet()){
            System.out.print(vertex + " -> ");
            for(int edges : hm.get(vertex)){
                System.out.print(edges+" ");
            }
            System.out.println();
        }
    }

    public static void main(String [] args) {
        ImplementGraph m = new ImplementGraph();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of edges: ");
        int e = sc.nextInt();

        System.out.println("Enter edges (u v) one per line:");
        for (int i = 0; i < e; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            m.addEdges(u, v);
        }

        System.out.println("\nGraph Representation:");
        m.display();
    }

}
