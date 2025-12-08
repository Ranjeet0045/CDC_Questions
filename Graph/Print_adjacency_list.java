package Graph;

import java.util.ArrayList;
import java.util.List;

public class Print_adjacency_list {

    public static List<List<Integer>> printGraph(int V, int edges[][]) {
        List<List<Integer>> adj = new ArrayList<>();
        int n = edges.length;
        for(int i=0; i<V; i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0; i<n; i++){
            int a = edges[i][0], b = edges[i][1];
            adj.get(a).add(b);
            adj.get(b).add(a);
        }

        return adj;
    }

    public static void main(String[] args) {
        @SuppressWarnings("unused")
        int V = 5, E = 7;
        int[][] edges = {{0,1}, {0,4}, {4,1}, {4,3}, {1,3}, {1,2}, {3,2}};
        List<List<Integer>> ans = printGraph(V,edges);
        System.out.println(ans);
    }
}
