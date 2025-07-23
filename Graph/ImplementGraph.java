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
        //hm.get(v).add(u); -- UNI DIRECTIONAL
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
//    public void dfs(int start){
//        HashSet<Integer> visited = new HashSet();
//        dfsHelper( start,visited);
//    }
//    public void dfsHelper(int curr,HashSet<Integer> visited ){
//        visited.add(curr);
//        System.out.print(curr + " ");
//        for(int nbr : hm.get(curr)){
//            if(!visited.contains(nbr))
//                dfsHelper(nbr,visited);
//        }
//    }
    public void dfs(int start){
        HashSet<Integer> visited = new HashSet();
        dfsHelper(start,visited);
    }
    public void dfsHelper(int start, HashSet<Integer> visited){
        visited.add(start);
        System.out.print(start+" ");
        for(int neighbour: hm.get(start)){
            if(!visited.contains(neighbour)){
                dfsHelper(neighbour,visited);
            }
        }
    }
    public  boolean pathFind(int start, int end){
        // base check if endpoint exist in the linkedlist of startpoint
        // check for common elements between both start and end
        HashSet<Integer> visited = new HashSet();
        return pathFindRecurse(start,end,visited);

    }
    public boolean pathFindRecurse(int start,int end,HashSet<Integer> visited){
        if(hm.get(start).contains(end)) return true;
        visited.add(start);
        //System.out.print(start + " ");
        for(int neighbour: hm.get(start)){
            if(!visited.contains(neighbour)){
                pathFindRecurse(neighbour,end,visited);
            }
        }
        return false;
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
        m.dfs(1);
        //add(2,3,4,5,5,6,2,1,23);
        System.out.print(m.pathFind(1,5));
    }
    public static void add(int ...a ){
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        System.out.println("Sum: " + sum);
    }
}
