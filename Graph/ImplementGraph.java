//import java.util.*;
//public class ImplementGraph {
//
//    HashMap <Integer, LinkedList<Integer>> hm;
//
//    ImplementGraph(){
//        hm = new HashMap<>();
//    }
//
//    void addVertex(int u){
//        hm.putIfAbsent(u, new LinkedList<Integer>());
//    }
//
//    void addEdges(int u, int v ){
//        addVertex(u);
//        addVertex(v);
//        hm.get(u).add(v);
//        //hm.get(v).add(u); -- UNI DIRECTIONAL
//    }
//    void display(){
//        for(int vertex : hm.keySet()){
//            System.out.print(vertex + " -> ");
//            for(int edges : hm.get(vertex)){
//                System.out.print(edges+" ");
//            }
//            System.out.println();
//        }
//    }
////    public void dfs(int start){
////        HashSet<Integer> visited = new HashSet();
////        dfsHelper( start,visited);
////    }
////    public void dfsHelper(int curr,HashSet<Integer> visited ){
////        visited.add(curr);
////        System.out.print(curr + " ");
////        for(int nbr : hm.get(curr)){
////            if(!visited.contains(nbr))
////                dfsHelper(nbr,visited);
////        }
////    }
//    public void dfs(int start){
//        HashSet<Integer> visited = new HashSet();
//        dfsHelper(start,visited);
//    }
//    public void dfsHelper(int start, HashSet<Integer> visited){
//        visited.add(start);
//        System.out.print(start+" ");
//        for(int neighbour: hm.get(start)){
//            if(!visited.contains(neighbour)){
//                dfsHelper(neighbour,visited);
//            }
//        }
//    }
//    public  boolean pathFind(int start, int end){
//        // base check if endpoint exist in the linkedlist of startpoint
//        // check for common elements between both start and end
//        HashSet<Integer> visited = new HashSet();
//        return pathFindRecurse(start,end,visited);
//
//    }
//    public boolean pathFindRecurse(int start,int end,HashSet<Integer> visited){
//        if(start == end) return true;
//        visited.add(start);
//        if(!hm.containsKey(start)) return false;
//        System.out.print(start + " ");
//        for(int neighbour: hm.get(start)){
//            if(!visited.contains(neighbour)) {
//                if (pathFindRecurse(neighbour, end, visited)) {
//                    //System.out.print(neighbour);
//                    return true;
//                }
//            }
//
//        }
//        return false;
//    }
//
//    public void totalPath(int start, int end) {
//        HashSet<Integer> visited = new HashSet<>();
//        List<Integer> path = new ArrayList<>();
//        System.out.println("All paths from " + start + " to " + end + ":");
//        pathLookerAll(start, end, visited, path);
//    }
//
//    public void pathLookerAll(int current, int end, HashSet<Integer> visited, List<Integer> path) {
//        visited.add(current);
//        path.add(current);
//
//        if (current == end) {
//            // Print the current path
//            for (int node : path) {
//                System.out.print(node + " ");
//            }
//            System.out.println();
//        } else {
//            if (hm.containsKey(current)) {
//                for (int neighbor : hm.get(current)) {
//                    if (!visited.contains(neighbor)) {
//                        pathLookerAll(neighbor, end, visited, path);
//                    }
//                }
//            }
//        }
//
//        // Backtrack
//        visited.remove(current);
//        path.remove(path.size() - 1);
//    }
//
//
//    public void bfs(int start){
//        HashSet<Integer> visited = new HashSet<>();
//        Queue<Integer> q = new LinkedList<>();
//        visited.add(start);
//        q.add(start);
//        bfsHelperr(q,visited);
//    }
//    public void bfsHelperr(Queue<Integer> q, HashSet<Integer> visited){
//        if(q.isEmpty()){
//            return;
//        }
//        int curr = q.remove();
//        System.out.print(curr + " ");
//        for(int nbr : hm.get(curr)){
//            if(!visited.contains(nbr)){
//                visited.add(nbr);
//                q.add(nbr);
//            }
//        }
//        bfsHelperr(q,visited);
//    }
//
//    public static void main(String [] args) {
//        ImplementGraph m = new ImplementGraph();
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter number of edges: ");
//        int e = sc.nextInt();
//
//        System.out.println("Enter edges (u v) one per line:");
//        for (int i = 0; i < e; i++) {
//            int u = sc.nextInt();
//            int v = sc.nextInt();
//            m.addEdges(u, v);
//        }
//
//        System.out.println("\nGraph Representation:");
//        //m.display();
//        //m.dfs(1);
//        //add(2,3,4,5,5,6,2,1,23);
//        m.totalPath(3,6);
//        //m.bfs(1);
//    }
//    public static void add(int ...a ){
//        int sum = 0;
//        for (int i : a) {
//            sum += i;
//        }
//        System.out.println("Sum: " + sum);
//    }
//
//
//
//}
///*
//1 2
//2 5
//5 6
//3 1
//3 2
//3 5
//3 6
// */
